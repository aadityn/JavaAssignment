package com.cybage.ControlStatements;
import java.util.Scanner;

class EvennOdd 
{ 
    @SuppressWarnings("resource")
	public static void main(String args[]) 
    {         
		System.out.println("For how many numbers you want to find Even and Odd");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		System.out.println("Please enter " +n+ " values in Integers only");
			
			for(int i=0;i<n;i++)
			{
				int valuesdisplay=sc.nextInt();
				
						if(valuesdisplay%2==0)
						{
							System.out.println("Even");
						}
						else
						{
							System.out.println("Odd");
						}
			}
	  }
}