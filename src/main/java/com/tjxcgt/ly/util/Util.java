package com.tjxcgt.ly.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;

public class Util {
	/**
	 * 对象转字符串
	 * @param obj
	 * @return
	 */
	public String projectToString(Object obj){
		String rult = obj.toString();
		return rult;
	}
	/**
	 * 对象转int
	 * @param obj
	 * @return
	 */
	public int prokectToInt(Object obj){
		int rult = Integer.parseInt(obj.toString());
		return rult;
	}
	/**
	 * 去除字符串最后一个逗号,若传入为空则返回空字符串
	 * 
	 * @descript
	 * @param para
	 * @return
	 * @author lanyuan
	 * @date 2015年3月29日
	 * @version 1.0
	 */
	public static String trimComma(String para) {
		if (StringUtils.isNotBlank(para)) {
			if (para.endsWith(",")) {
				return para.substring(0, para.length() - 1);
			} else {
				return para;
			}
		} else {
			return "";
		}
	}
	/**
	 * 使用当前月份,得到上一个月的月份:月份的格式是:yyyyMM
	 * 
	 * @param yyyymm
	 * @return yyyy-MM
	 */
	public static String getLastMonth(String currentMonth) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		Date date = null;
		try {
			date = sdf.parse(currentMonth + "01");
		} catch (ParseException e) {
			e.printStackTrace();
		}

		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.MONTH, -1);

		String lastDate = c.get(Calendar.YEAR) + "-"+ StringUtils.leftPad("" + (c.get(Calendar.MONTH) + 1), 2, "0");
		return lastDate;
	}
}
