package com.cybage.Polymorphism;
class ParentClass
{
	void display(int a, int b)
	{
		int sum = a+ b;
		System.out.println("The Sum of 2 Numbers is : " + sum);
	}
	void display(int a , int b, int c)
	{
		int sum = a+ b+c;
		System.out.println("The Sum of 2 Numbers is : " + sum);
	}
}


public class MethodOverloading 
{

	public static void main(String[] args) 
	{
		ParentClass pc = new ParentClass();
		pc.display(10, 20);
		pc.display(10, 20, 30);

	}

}
