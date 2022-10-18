package com.cybage.ObjectsandClasses;


class College
{
	String name;
	int roll;
	int age;
	
	public College(String Name, int RollNo, int Age)
	{
		this.name=Name;
		this.roll=RollNo;
		this.age=Age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getRollNo()
	{
		return roll;
	}
	
	public int getage()
	{
		return age;
	}
}


public class Student {

	public static void main(String[] args) 
	{
		College cl= new College("Aditya Nadkarni", 305, 31);
		System.out.println(cl.getName());
		System.out.println(cl.getRollNo());
		System.out.println(cl.getage());

	}

}
