package com.cybage.FunctionsPgm;

class passvalue
{
	int a=10;
	public void valuedisplay(int a)
	{
		a=a+10; 
	}
}

public class PassByValue {

	public static void main(String[] args) 
	{
		passvalue pv= new passvalue();
		
		System.out.println("Before Pass by Value method is called " +pv.a);
		pv.valuedisplay(100);
		
		System.out.println("After Pass by Value method is Called " +pv.a);

	}

}
