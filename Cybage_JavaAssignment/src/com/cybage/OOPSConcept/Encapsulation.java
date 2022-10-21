package com.cybage.OOPSConcept;
// Encapsulation is used for Data Security Purpose
//Encapsulation is used to Hide the Data members (Variables) from other classes.

class Account
{
	public long acc_num;
	public String Name;
	public String email_ID;
	
	public long getacc_num()
	{
		return acc_num;
	}
	public void setacc_num(long acc_num)
	{
		this.acc_num=acc_num;
	}
	
	public String getName()
	{
		return Name;
	}
	public void setname(String Name)
	{
		this.Name=Name;
	}
	
	public String getemail_ID()
	{
		return email_ID;
	}
	public void setemail_ID(String email_ID)
	{
		this.email_ID=email_ID;
	}
}

public class Encapsulation 
{

	public static void main(String[] args) 
	{
		Account a= new Account();
		a.setacc_num(123456);
		a.setname("Aditya Nadkarni");
		a.setemail_ID("aadityn@cybage.com");
		
		
		System.out.println("Account No:" + a.getacc_num()+"\n "+"Account Name:"
                + a.getName()+" \n"+"Account holder email:" + a.getemail_ID());

	}

}
