package com.cybage.FunctionsPgm;

import java.util.Scanner;

class prime
{
	
		public void primenumber(int n)
		{
				if(n<=1)
				{
					System.out.println("The Number is not a prime number");
				}
				else if(n%2==0)
				{
					System.out.println("The Number is Not a prime Number");
				}
				else
				{
					System.out.println("The Number is Prime");
				}
		}
}

public class PrimeusingFunc 
{

	public static void main(String[] args) 
	{
		System.out.println("Please do enter a Number to Check whether its a prime or Not");
		Scanner sc= new Scanner(System.in);
		int NewNum= sc.nextInt();
		
		prime p= new prime();
		p.primenumber(NewNum);
		sc.close();

	}

}
