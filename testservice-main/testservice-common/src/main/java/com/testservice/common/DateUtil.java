package com.testservice.common;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateUtil {
	
	public static final String FORMAT_DDMMYYYY_HHMMSS = "dd/MM/yyyy HH:mm:ss";

	public static Date getDate(String dateValue,String format) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat(format,Locale.ENGLISH);
        return  sdf.parse(dateValue);
	}
	
	public static Date getDateURIDecoded(String dateValue,String format) throws ParseException, UnsupportedEncodingException{
        SimpleDateFormat sdf = new SimpleDateFormat(format,Locale.ENGLISH);
        return  sdf.parse(java.net.URLDecoder.decode(dateValue, "UTF-8"));
	}	
	
	
	public static String dateConvert(String pattern){

        long sysdate = System.currentTimeMillis();
        Date sys_date = new Date(sysdate);
        String system_date ="";
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
        
       return system_date = formatter.format(sys_date);	
	}
	
	public static void main(String[] args) throws Exception{
		String date="25/02/1984 12:42:12";
		
		Date d=DateUtil.getDate(date, FORMAT_DDMMYYYY_HHMMSS);
		System.out.println(d);
	}
	
}
