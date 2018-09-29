package com.fan.image.controller.excel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import com.fan.image.util.excel.ExcelSheetPO;
import com.fan.image.util.excel.ExcelUtil;
import com.fan.image.util.excel.ExcelVersion;

/**
 * 
 * ClassName: readExcel 
 * @Description: 读取Excel小工具
 * @author fanzhongbo
 * @version 1.0
 *
 * @date 2018年9月4日
 */
public class readExcel {
    
    /**
     * 
     * Description: 读取Excel并将结果写入另外一个Excel
     * @param args
     * @throws FileNotFoundException
     * @throws IOException   
     * void  
     * @throws
     * 
     * @author fanzhongbo
     * @date 2018年9月4日
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String url = "C:\\Users\\Administrator\\Desktop\\态势分析-苏州v2.0口径.xlsx";
        File file = new File(url.trim());
        List<ExcelSheetPO> list = ExcelUtil.readExcel(file, null, null);
        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i).getDataList());
            list.get(i).setHeaders(new String[] {""});
        }
        ExcelUtil.createWorkbookAtDisk(ExcelVersion.V2007, list, "E:\\test1.xlsx");
    }
}
