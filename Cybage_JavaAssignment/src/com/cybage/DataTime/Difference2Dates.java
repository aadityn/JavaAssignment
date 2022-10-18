package com.cybage.DataTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

class diffdates
{
	public void difference(String startdate, String enddate) throws ParseException
	{
		SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy",Locale.ENGLISH);
		
		Date d1= s.parse(startdate);
		Date d2= s.parse(enddate);
		
		long differenceindates=d2.getTime()-d1.getTime();
		
		long dayss=(differenceindates/(1000 * 60 * 60 * 24));
		
		System.out.println("The difference between 2 dates is :" +dayss);
		
		
	}
}

public class Difference2Dates 
{

	public static void main(String[] args) throws ParseException 
	{
		
		diffdates dd= new diffdates();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter date1 in the Format of DD-MM-YYYY format");
		String Dates1=sc.nextLine();
		
		System.out.println("Please enter Date2 in the format of DD-MM-YYYY format");
		String Dates2=sc.nextLine();
		
		dd.difference(Dates1, Dates2);
		sc.close();
		

	}

}
