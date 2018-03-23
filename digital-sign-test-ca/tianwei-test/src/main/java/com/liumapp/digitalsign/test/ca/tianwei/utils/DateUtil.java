package com.liumapp.digitalsign.test.ca.tianwei.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author liumapp
 * @file DateUtil.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/23/18
 */
public class DateUtil {

    public static String dateToString(Date date) {
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	return sdf.format(date);
    }

    public static String convertBeginTimeToDBDate(String notBefore) {
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	try {
	    Date before = sdf.parse(notBefore);
	    sdf.applyPattern("yyyyMMdd");
	    return sdf.format(before) + "000000";
	} catch (ParseException e) {
	    e.printStackTrace();
	}
	return null;
    }

    @SuppressWarnings("unused")
    private static String convertEndTimeToDBDate(String notAfter) {
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	try {
	    Date before = sdf.parse(notAfter);
	    sdf.applyPattern("yyyyMMdd");
	    return sdf.format(before) + "595959";
	} catch (ParseException e) {
	    e.printStackTrace();
	}
	return null;
    }
	
	
    /**
     * 创建一个"yyyy-MM-dd HH:mm:ss"日期的格式化对象
     * 
     * @return "yyyy-MM-dd HH:mm:ss"日期的格式化对象
     */
    private static SimpleDateFormat newLongYMDHMSFormat() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }
    
    /**
     * 创建一个"yyyyMMddHHmmss"日期的格式化对象
     * 
     * @return "yyyyMMddHHmmss"日期的格式化对象
     */
    @SuppressWarnings("unused")
    private static SimpleDateFormat newShortYMDFormat() {
        return new SimpleDateFormat("yyyyMMddHHmmss");
    }
    
    /**
     * 创建一个"yyyyMMddHHmmss"日期的格式化对象
     * @return "yyyyMMddHHmmss"日期的格式化对象
     */
    private static SimpleDateFormat newShortYMDHMSFormat() {
        return new SimpleDateFormat("yyyyMMddHHmmss");
    }
    
    /**
     * "yyyyMMddHHmmss"格式的日期转换为"yyyy-MM-dd HH:mm:ss"格式的日期
     * @param shortYMDHMS "yyyyMMddHHmmss"格式的日期
     * @return "yyyy-MM-dd HH:mm:ss"格式的日期
     * @throws ParseException
     */
    public static String toLongYMDHMS(String shortYMDHMS) throws ParseException {
        return newLongYMDHMSFormat().format(newShortYMDHMSFormat().parse(shortYMDHMS));
    }
	
    /**
     * "yyyyMMddHHmmss"格式的日期转换为"yyyy-MM-dd"格式的日期
     * @param shortYMDHMS "yyyyMMddHHmmss"格式的日期
     * @return "yyyy-MM-dd"格式的日期
     * @throws ParseException
     */
    public static String toLongYMD(String shortYMDHMS) throws ParseException {
        return newLongYMDHMSFormat().format(newShortYMDHMSFormat().parse(shortYMDHMS));
    }
	
    /**
     * "yyyy-MM-dd HH:mm:ss"格式的日期转换为"yyyyMMddHHmmss"格式的日期
     * 
     * @param longYMDHMS
     *            "yyyy-MM-dd HH:mm:ss"格式的日期
     * @return "yyyyMMddHHmmss"格式的日期
     * @throws ParseException
     */
    public static String toShortYMDHMS(String longYMDHMS) throws ParseException {
        return newShortYMDHMSFormat().format(newLongYMDHMSFormat().parse(longYMDHMS));
    }
}
