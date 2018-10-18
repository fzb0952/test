package com.fan.image.controller.excel;

import java.io.File;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import com.fan.image.bean.TSmd;
import com.fan.image.bean.TTab;
import com.fan.image.consts.enums.sizeEnum;

/**
 * 
 * ClassName: dataBaseToSMD
 * 
 * @Description: 将数据库相关表转化为smd,复用需修改数据库连接信息
 * @author fanzhongbo
 * @version 1.0
 *
 * @date 2018年10月9日
 */
public class dataBaseToSMD {
    /**
     * 
     * Description: 转换数据类型如：character->C
     * 
     * @param type
     * @return String
     * @throws
     * 
     *         @author fanzhongbo
     * @date 2018年10月9日
     */
    public static String exchangeString(String type) {

        if ("character".equals(type)) {
            type = "C";
        } else if ("character varying".equals(type)) {
            type = "VC";
        } else if ("date".equals(type)) {
            type = "D";
        } else if ("timestamp without time zone".equals(type)) {
            type = "DT";
        } else if ("integer".equals(type)) {
            type = "INT";
        } else if ("numeric".equals(type)) {
            type = "N";
        } else if ("text".equals(type)) {
            type = "TEXT";
        }
        return type;
    }

    /**
     * 
     * Description: 查询出SMD中COL所需字段
     * 
     * @return List<TSmd>
     * @throws SQLException
     * @throws
     * 
     *         @author fanzhongbo
     * @date 2018年10月9日
     */
    public static List<TSmd> queryCol() throws SQLException {
        // TODO Auto-generated method stub
        List<TSmd> smd = new ArrayList<TSmd>();
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            Class.forName("org.postgresql.Driver").newInstance();

            // 数据库： GTR
            String url = "";
            // 模式名
            String schema = "db_xsaj_gz";

            // 用户名：postgres 密码： root
            con = DriverManager.getConnection(url, "sa", "123456");
            st = con.createStatement();

            // 查询
            String sql
                = "select col_description(a.attrelid,a.attnum) as comment,a.attname as name, a.attnotnull as notnull,"
                    + "table_name,data_type,character_maximum_length,ordinal_position from information_schema.columns col "
                    + "left join pg_class pg on pg.relname = col.table_name "
                    + "left join pg_attribute as a on a.attrelid = pg.oid and a.attnum>0 and col.column_name=a.attname "
                    + "WHERE table_schema='" + schema + "'";
            rs = st.executeQuery(sql);

            while (rs.next()) {
                TSmd tSmd = new TSmd();
                tSmd.setcTableName(rs.getString(4).toUpperCase());
                tSmd.setcColName(rs.getString(2).toUpperCase());
                tSmd.setcName(rs.getString(1));
                tSmd.setcType(exchangeString(rs.getString(5)));
                tSmd.setcLength(rs.getString(6));
                if ("t".equals(rs.getString(3))) {
                    tSmd.setcIsNull("1");
                }
                if ("1".equals(rs.getString(7))) {
                    tSmd.setcKey("1");
                }
                smd.add(tSmd);
            }
            // for (TSmd tSmd1 : smd) {
            // System.out.println(tSmd1.getcColName() + tSmd1.getcName());
            // }

        } catch (Exception e) {
            System.out.print(e.toString());
        } finally {
            rs.close();
            st.close();
            con.close();
        }
        return smd;
    }

    /**
     * 
     * Description: 查询出SMD中TAB所需字段
     * 
     * @return
     * @throws SQLException List<TTab>
     * @throws
     * 
     *         @author fanzhongbo
     * @date 2018年10月10日
     */
    public static List<TTab> queryTab() throws SQLException {
        // TODO Auto-generated method stub
        List<TTab> smd = new ArrayList<TTab>();
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            Class.forName("org.postgresql.Driver").newInstance();

            // 数据库： GTR
            String url = "";
            // 模式名
            String schema = "db_xsaj_gz";

            // 用户名：postgres 密码： root
            con = DriverManager.getConnection(url, "sa", "123456");
            st = con.createStatement();

            // 查询
            String sql = "select a.table,a.tablename from (\r\n"
                + "SELECT  C.relname AS table, dd .description as  tablename FROM  pg_class C, pg_description dd WHERE C.oid = dd.objoid AND dd.objsubid = '0'\r\n"
                + ")a inner join (select DISTINCT table_name from information_schema.columns col WHERE table_schema='db_xsaj_gz')b\r\n"
                + "on a.table = b.table_name";
            rs = st.executeQuery(sql);

            while (rs.next()) {
                TTab tTab = new TTab();
                tTab.setcTable(rs.getString(1));
                tTab.setcTableName(rs.getString(2));
                tTab.setcSaveSpace(schema);
                smd.add(tTab);
            }

        } catch (Exception e) {
            System.out.print(e.toString());
        } finally {
            rs.close();
            st.close();
            con.close();
        }
        return smd;
    }

    /**
     * 通过泛型的list<?>可以匹配所有的类，只要那个类所有的属性是String类型的
     * 
     * @param peos 实体的List
     * @param fileAbPath 绝对路径
     * @throws Exception
     */
    public static void writeExcel(List<?> peos, String fileAbPath, String type) throws Exception {
        // 列数
        int columnNum;
        int rows = peos.size(); // 行数
        File file;
        // 判断文件类型,如果不是以.xls结尾，那么停止执行
        file = new File(fileAbPath);
        if (!file.getName().endsWith("xls")) {
            return;
        }
        if (!file.exists()) {// 如果文件不存在，则重新创建
            file.createNewFile();
        }
        if (peos.size() == 0 || peos.equals("") || peos == null) {
            return;
        }
        // 反射获得类的属性个数 ,也就得到了你要打印的列数
        Class obClass = peos.get(0).getClass();
        Field[] fields = obClass.getDeclaredFields();
        columnNum = fields.length;
        // 得到该对象的属性名字，存到数组中去
        String[] titleNames = new String[columnNum];
        for (int i = 0; i < columnNum; i++) {
            titleNames[i] = fields[i].getName();
        }
        // 创建工作簿
        WritableWorkbook workbook = Workbook.createWorkbook(file);
        // 创建sheet
        WritableSheet sheet = workbook.createSheet(type, 0);
        Label label = null;
        for (int i = 0; i < peos.size(); i++) {
            // 写入标题--类的属性名
            if (i == 0) {
                for (int j = 0; j < columnNum; j++) {
                    label = new Label(j, 0, titleNames[j]);
                    sheet.addCell(label);
                }
            }
            Object people = peos.get(i);
            // 读取每个实体中的字段上的值
            for (int j = 0; j < columnNum; j++) {
                String value = (String)fields[j].get((Object)people);
                label = new Label(j, i + 1, value);
                sheet.addCell(label);
            }
        }
        // 写入
        workbook.write();
        // 关闭
        System.out.println(type + "写入完成");
        workbook.close();
    }

    public static void main(String[] args) throws Exception {
        // 写入TAB相关信息
        writeExcel(queryTab(), "E:\\\\smdtest.xls", "TAB");
        // 写入COL相关信息
        writeExcel(queryCol(), "E:\\smdtest1.xls", "COL");
    }

}
