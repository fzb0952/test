package com.fan.image.bean;
/**
 * 
 * ClassName: TTab 
 * @Description: SMD中TAB工作表实体
 * @author fanzhongbo
 * @version 1.0
 *
 * @date 2018年10月10日
 */
public class TTab {
    
    //表中文名
    public String cTableName;
    //表名
    public String cTable;
    //存储空间
    public String cSaveSpace;
    //单独大对象表空间
    public String cBigObject="1..是";
    //数据缓存
    public String cCache="0..否";
    //记录事务日志
    public String cLog="1..是";
    //分区
    public String cPartition;
    //版本
    public String cVersion="1.0.0.0";
    //说明
    public String cExplain;
    public String getcTableName() {
        return cTableName;
    }
    public void setcTableName(String cTableName) {
        this.cTableName = cTableName;
    }
    public String getcTable() {
        return cTable;
    }
    public void setcTable(String cTable) {
        this.cTable = cTable;
    }
    public String getcSaveSpace() {
        return cSaveSpace;
    }
    public void setcSaveSpace(String cSaveSpace) {
        this.cSaveSpace = cSaveSpace;
    }
    public String getcBigObject() {
        return cBigObject;
    }
    public void setcBigObject(String cBigObject) {
        this.cBigObject = cBigObject;
    }
    public String getcCache() {
        return cCache;
    }
    public void setcCache(String cCache) {
        this.cCache = cCache;
    }
    public String getcLog() {
        return cLog;
    }
    public void setcLog(String cLog) {
        this.cLog = cLog;
    }
    public String getcPartition() {
        return cPartition;
    }
    public void setcPartition(String cPartition) {
        this.cPartition = cPartition;
    }
    public String getcVersion() {
        return cVersion;
    }
    public void setcVersion(String cVersion) {
        this.cVersion = cVersion;
    }
    public String getcExplain() {
        return cExplain;
    }
    public void setcExplain(String cExplain) {
        this.cExplain = cExplain;
    }
    
}
