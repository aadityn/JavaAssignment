package com.cybage.exceptionhandlings;

public class StackoverflowErrorPgm 
{ 
    public static void main(String[] args) 
    { 
    	StackoverflowErrorPgm so= new StackoverflowErrorPgm();
    	System.out.println(so.sum(10));
        
    } 
    
    public int sum(int a)
    {
    	
    	try
    	{
    			if(a>0)
    			return a +sum(a+10);
    	}
    	catch(StackOverflowError e)
    	{
    		System.out.println(e);
    	}
		return a;
    			
    }
} 