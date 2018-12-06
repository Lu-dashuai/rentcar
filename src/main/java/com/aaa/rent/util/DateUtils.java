package com.aaa.rent.util;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * className:FileUtil
 * discription:
 * author:luRuiHua
 * createTime:2018-11-23 08:34
 */
public class DateUtils {
    /**
     * 默认日期格式
     */
    public static String DEFAULT_FORMAT = "yyyy-MM-dd";
    private static final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    private static final SimpleDateFormat formatMs = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.sss");

    /**
     * 格式化日期
     * @param date 日期对象
     * @return String 日期字符串
     */
    public static String formatDate(Date date){
        SimpleDateFormat f = new SimpleDateFormat(DEFAULT_FORMAT);
        String sDate = f.format(date);
        return sDate;
    }
    /**
     * 格式化日期
     * @param str 日期对象
     * @return String 日期字符串
     */
    public static Date formatDate(String str){
        Date date = null;
        try{
            SimpleDateFormat f = new SimpleDateFormat(DEFAULT_FORMAT);
            date = f.parse(str);
        }catch (Exception e){
            e.printStackTrace();
        }

        return date;
    }
}