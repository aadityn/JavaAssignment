package com.cybage.OOPSConcept;
class Doctor
{
	public void operation()
	{
		System.out.println("Doctor performs operation");
	}
}

class Surgeon extends Doctor
{
	public void operation()
	{
		//super.operation();
		System.out.println("Surgeon performs operation with the help of Doctor");
	}
}

public class MethodOverriding 
{

	public static void main(String[] args) 
	{
		//Child Method will be overridden
		Surgeon s= new Surgeon();
		s.operation();
		
		//Parent Method will be Executed
		Doctor d = new Doctor();
		d.operation();
		
		//Child Method will be called
		Doctor d1 = new Surgeon();
		d1.operation();
		
	}

}
