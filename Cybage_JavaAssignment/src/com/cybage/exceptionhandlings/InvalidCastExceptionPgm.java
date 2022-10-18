package com.cybage.exceptionhandlings;

public class InvalidCastExceptionPgm 
{

	public static void main(String[] args) 
	{
		try
		{
			int a=100;
			char c='a';
			
			c=(char)a;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		

	}

}
