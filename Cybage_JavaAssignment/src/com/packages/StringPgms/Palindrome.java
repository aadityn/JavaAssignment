package com.packages.StringPgms;

import java.util.Scanner;

class Palindrome
{
   public static void main(String args[])
   {
      String strrev="";
      
      Scanner sc= new Scanner(System.in);
      System.out.println("Please Enter a string to Check whether its palindrome or Not");
      String Name=sc.nextLine();
      
      int len= Name.length();
      
      for (int i=len-1;i>=0;i--)
      {
    	  strrev= strrev+Name.charAt(i);
      }
      
      if(Name.equals(strrev))
      {
    	  System.out.println("The Entered String is a palindrome");
      }
      else
          System.out.println("The Entered String is not a palindrome");
      
      sc.close();
   }
}