package com.cybage.FunctionsPgm;

class passref
{
	int a=10;
	public void valuedisplay(passref pr)
	{
		pr.a=pr.a+10; 
	}
}

public class PassByReference {

	public static void main(String[] args) 
	{
		passref pv= new passref();
		
		System.out.println("Before Pass by Value method is called " +pv.a);
		pv.valuedisplay(pv);
		
		System.out.println("After Pass by Value method is Called " +pv.a);

	}

}
