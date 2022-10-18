package com.cybage.exceptionhandlings;

public class IndexOutofRangeExceptionPgms 
{

	public static void main(String[] args) 
	{
		try
		{
			String Name ="This is aditya Nadkarni";
			
			System.out.println("The length of the String is :" +Name.length());
			
			char c=Name.charAt(50);
			System.out.println("c");
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}

}
