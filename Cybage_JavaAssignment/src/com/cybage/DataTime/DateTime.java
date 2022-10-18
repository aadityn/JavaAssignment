package com.cybage.DataTime;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateTime 
{

	public static void main(String[] args) 
	{
		
		Date Localtime=new Date();
		System.out.println("The current Local Time is : " +Localtime);
		
		SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy" + " " + " HH:mm:ss");
		s.setTimeZone((TimeZone.getTimeZone("GMT")));		
		System.out.println("The Current GMT Time is :" +s.format(Localtime));
			
	}

}