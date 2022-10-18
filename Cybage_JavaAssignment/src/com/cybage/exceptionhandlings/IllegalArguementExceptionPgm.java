package com.cybage.exceptionhandlings;

import java.util.Scanner;

public class IllegalArguementExceptionPgm 
{

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("please do enter your age");
		int age=sc.nextInt();
		
			if(age>18)
			{
				System.out.println("Eligible for Voting");
			}
			else
			{
				throw new IllegalArgumentException("Not Eligible for Voting");
			}
		
		sc.close();

	}

}
