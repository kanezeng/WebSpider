package com.kanezeng.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public abstract class DateTime {

	/**
	*method Return a String object showing current date and time.
	*@return String currentDateTime
	*/
	public static String getSystemTime() {
		
		Date date=new Date();
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		return df.format(date);
	}
	
	/**
	*method Convert a String object contains Date & Time info to java.sql.Timestamp object
	*@param dateString a String contains Date & Time info
	*@return dataTime timestamp
	*/

	public final static java.sql.Timestamp string2Time(String dateString)
		throws java.text.ParseException {

		DateFormat dateFormat;
		dateFormat = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss.SSS", Locale.ENGLISH);//设定格式
		//dateFormat = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss", Locale.ENGLISH);
		dateFormat.setLenient(false);
		java.util.Date timeDate = dateFormat.parse(dateString);//util类型
		java.sql.Timestamp dateTime = new java.sql.Timestamp(timeDate.getTime());//Timestamp类型,timeDate.getTime()返回一个long型
	
		return dateTime;

	}
	
	public final static int getIntervalDays(Calendar startday,Calendar endday) {
		if(startday.after(endday)) {
			Calendar cal=startday;
			startday=endday;
			endday=cal;
		}
		long sl=startday.getTimeInMillis();
		long el=endday.getTimeInMillis();
		long ei=el-sl;
		
		return (int)(ei/(1000*60*60*24));
	}
	
	public final static int getIntervalDays(Date startday,Date endday) {
		if(startday.after(endday)) {
			Date cal=startday;
			startday=endday;
			endday=cal;
		}
		long sl=startday.getTime();
		long el=endday.getTime();
		long ei=el-sl;
		
		return (int)(ei/(1000*60*60*24));
	}
}
