/**
 * 
 */
/**
 * @author zhixun
 *
 */
package com.dmy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateData {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d=new Date();
		d.setTime(1504843800000L);
		
		
		String time = "2017-09-07 12:10:00";
		System.out.println(format.parse(time).getTime());
		
		System.out.println(	format.format(d));
		
	
	}
}
