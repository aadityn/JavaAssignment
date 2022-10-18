package com.cybage.SwitchCase;
import java.util.Scanner;

public class SwitchCasePgm 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the First Number");
		Scanner fn= new Scanner(System.in);
		long FirstNumber= fn.nextLong();
		
		System.out.println("Enter the Second Number");
		Scanner Sn= new Scanner(System.in);
		long SecondNumber= Sn.nextLong();
		
		System.out.println("Enter the Operation Needed to be performed such as Add, Subtract, Multiply and Divide");
		Scanner opn=new Scanner(System.in);
		String ao= opn.nextLine();
		
		switch(ao)
		{
					case "Add": 
									System.out.println("The addition of 2 Numbers is :" +(FirstNumber+SecondNumber));
									break;
					
					case "Subtract": 
									System.out.println("The Subtraction of 2 Numbers is :" +(FirstNumber-SecondNumber));
									break;
									
					case "Multiply":
									System.out.println("The Multiplication of 2 Numbers is :" +(FirstNumber*SecondNumber));
									break;
									
					case "Divide":
									System.out.println("The Division of 2 Numbers is :" +(FirstNumber/SecondNumber));
									break;
									
					default:
									System.out.println("Please do select a valid Operation");
		}

	}

}
