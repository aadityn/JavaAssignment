package com.cybage.exceptionhandlings;

public class NullPointerExceptionPgm 
{

	public static void main(String[] args) 
	{
		
		String Name=null;
		try 
		{
			if(Name.equals("Aditya Nadkarni"))
			{
				System.out.println("Same Name as the String");
			}
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}

	}

}
