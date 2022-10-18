package com.cybage.FunctionsPgm;

import java.util.Scanner;

class Swapping
{
	int a,b;
	public void Swap(int a , int b)
	{
		int temp= a;
		a=b;
		b=temp;
		
		System.out.println("After swapping the values are :" +a+ " " +b);
	}
}


public class SwappingUsingFunc 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the First Number");
		Scanner fn=new Scanner(System.in);
		int firstNum=fn.nextInt();
		
		System.out.println("Enter the Second Number");
		int SecondNum=fn.nextInt();
		
		System.out.println("Before Swapping the Numbers are :" +firstNum+ " and " +SecondNum);
		
		Swapping sp= new Swapping();
		sp.Swap(firstNum, SecondNum);
		fn.close();
				
	}

}
