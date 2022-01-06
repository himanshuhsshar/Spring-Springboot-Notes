package com.jobmanager.beans;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConvertor {
	
private static DateConvertor instance;
	
	private DateConvertor()
	{
		// no-op
	}
	
	public static DateConvertor getInstance() {
		if(instance==null)
		{
			instance = new DateConvertor();
		}
		return instance;
	}
	public Date toDate(String sDate, String pattern) throws ParseException{
		Date date = null;
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		date = sdf.parse(sDate);
		return date;
	}
	
	public String fromDate(Date date, String format)
	{
		String sDate=null;
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		sDate = sdf.format(date);
		return sDate;
	}

}
