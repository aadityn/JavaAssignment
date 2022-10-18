package com.packages.StringPgms;

public class StringFunctions 
{

	public static void main(String[] args) 
	{
		String Name1 ="Aditya";
		String Name2="Nadkarni";
		
		System.out.println("Equals Function : " +(Name1.equals(Name2)));
		System.out.println("IsEmpty Function : " +(Name1.isEmpty()));
		System.out.println("Concat Function : " +(Name1.concat(Name2)));
		System.out.println("Contains Function : " +(Name1.contains("Adi")));
		System.out.println("Length Function : " +Name1.length());
		System.out.println("ToUpperCase Function : " +Name1.toUpperCase());
		System.out.println("toLowerCase Function : " +Name1.toLowerCase());
	}

}
