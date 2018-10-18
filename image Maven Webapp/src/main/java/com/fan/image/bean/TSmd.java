package com.fan.image.bean;
/**
 * 
 * ClassName: TSmd 
 * @Description: SMD中COL工作表实体
 * @author fanzhongbo
 * @version 1.0
 *
 * @date 2018年10月9日
 */
public class TSmd {
    //表名
    public String cTableName;
    //字段
    public String cColName;
    //字段中文名
    public String cName;
    //主键
    public String cKey;
    //默认值
    public String cDefault;
    //不为空
    public String cIsNull;
    //数据类型
    public String cType;
    //数据长度
    public String cLength;
    //数据精度
    public String cAccuracy;
    //版本
    public String cVersion="1.0.0.0";
    //说明
    public String cExplain;
    //代码类型
    public String cCodeType;
    //扩展属性
    public String cExtend;
    
    public String getcTableName() {
        return cTableName;
    }
    public void setcTableName(String cTableName) {
        this.cTableName = cTableName;
    }
    public String getcColName() {
        return cColName;
    }
    public void setcColName(String cColName) {
        this.cColName = cColName;
    }
    public String getcName() {
        return cName;
    }
    public void setcName(String cName) {
        this.cName = cName;
    }
    public String getcType() {
        return cType;
    }
    public void setcType(String cType) {
        this.cType = cType;
    }
    public String getcLength() {
        return cLength;
    }
    public void setcLength(String cLength) {
        this.cLength = cLength;
    }
    public String getcKey() {
        return cKey;
    }
    public void setcKey(String cKey) {
        this.cKey = cKey;
    }
    public String getcDefault() {
        return cDefault;
    }
    public void setcDefault(String cDefault) {
        this.cDefault = cDefault;
    }
    public String getcIsNull() {
        return cIsNull;
    }
    public void setcIsNull(String cIsNull) {
        this.cIsNull = cIsNull;
    }
    public String getcAccuracy() {
        return cAccuracy;
    }
    public void setcAccuracy(String cAccuracy) {
        this.cAccuracy = cAccuracy;
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
    public String getcCodeType() {
        return cCodeType;
    }
    public void setcCodeType(String cCodeType) {
        this.cCodeType = cCodeType;
    }
    public String getcExtend() {
        return cExtend;
    }
    public void setcExtend(String cExtend) {
        this.cExtend = cExtend;
    }

}
