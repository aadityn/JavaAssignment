package com.cybage.exceptionhandlings;

public class ArithmeticExceptionPgm 
{

	public static void main(String[] args) 
	{
		
		try
		{
			int a=30,b=0;
			int c=a/b;
			System.out.println("Value is : " +c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		

	}

}
