package com.cybage.OOPSConcept;
//In simple terms, abstraction “displays” only the relevant attributes of objects and “hides” the unnecessary/sensitive details.

//For example, when we are driving a car, we are only concerned about driving the car like start/stop the car, 
//accelerate/ break, etc. We are not concerned about how the actual start/stop mechanism or accelerate/brake process works internally. 
//We are just not interested in those details.

abstract class Bank
{
	abstract int getinterestrates();
}

class ICICI extends Bank
{
	int getinterestrates()
	{
		return 6;
	}
}

class Canarabank extends Bank
{
	int getinterestrates()
	{
		return 7;
	}
}


public class Abstraction 
{
	public static void main(String[] args) 
	{
		Bank b;
			
		b = new ICICI();
		System.out.println("The Interest rates of ICICI Bank is :" + b.getinterestrates());
		
		b = new Canarabank();
		System.out.println("The Interest rates of Canara Bank is :" + b.getinterestrates());

	}

}
