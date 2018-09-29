package com.fan.image.controller.lang;

import org.apache.commons.lang3.StringUtils;
/**
 * 
 * ClassName: stringUtilsTest 
 * @Description: StringUtils使用
 * @author fanzhongbo
 * @version 1.0
 *
 * @date 2018年9月26日
 */
public class stringUtilsTest {
    /**
     * 
     * Description: 打印数组
     * @param str
     * @return   
     * String  
     * @throws
     * 
     * @author fanzhongbo
     * @date 2018年9月26日
     */
    public static String printArray(String[] str) {
        String result="";
        for(String str1:str){
            result+=str1;
        }
        return result;
    }
    public static void main(String[] args) {
        String str="\n";
        System.out.println("isEmpty判断字符串\" \"是否为空："+StringUtils.isEmpty(str));
        System.out.println("isBlank判断字符串\" \"是否为空(isblank特殊空白字符也视为存在)："+StringUtils.isBlank(str));
        System.out.println("trim去除字符串\" \"两端空格："+"1"+StringUtils.trim(str)+"1");
        System.out.println("equals比较字符串\"我们不一样吗\"和\"我们不一样\"是否相同："+StringUtils.equals("我们不一样吗", "我们不一样"));
        System.out.println("indexOf判断字符'3'在字符串\"123456\"中出现的位置："+StringUtils.indexOf("123456", '3'));
        System.out.println("contains判断字符串\"123456\"是否包含字符串\"34\"："+StringUtils.contains("123456", "23"));
        System.out.println("split根据字符串\"34\"分割字符串\"123456\"："+printArray(StringUtils.split("123456", "34")));
        System.out.println("replace字符串替换："+StringUtils.replace("123456", "34", "43"));
        System.out.println("countMatches统计字符串在主串中出现的次数："+StringUtils.countMatches("123456", "3"));
    }
}
