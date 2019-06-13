package com.kwale.project.india;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Formatter;

public class GetCurrentDateTime
{
	private static Formatter month;

	public static String getDateTime(){
		String day = null;
		String monthDate = null;

		DateFormat dateFormat = new SimpleDateFormat("dd,yyyy HH:mm:ss");
		Date date = new Date();
		day = dateFormat.format(date);
		
		month = new Formatter();
		Calendar cal = Calendar.getInstance();
		month = new Formatter();
		month.format("%tb", cal);

		monthDate = month+" "+day;
		
		return monthDate;
	}
};