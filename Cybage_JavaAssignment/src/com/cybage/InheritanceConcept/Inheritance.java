package com.cybage.InheritanceConcept;
class Parent 
{
	void sum(int a, int b)
	{
		int sum=  a +  b;
		System.out.println("The Sum of 2 values are : " + sum);
	}
}

class Child extends Parent
{
	void multiply(int c, int d)
	{
		float mul= c* d;
		System.out.println("The multiplication of 2 Numbers is :" + mul);
	}
}


public class Inheritance 
{

	public static void main(String[] args)
	{
		Child c = new Child();
		c.sum(10, 20);
		c.multiply(20, 10);

	}

}
