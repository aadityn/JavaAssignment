package com.packages.StringPgms;

import java.util.Scanner;

class ReverseaString
{
   public static void main(String args[])
   {
      String Name, strrev = "";
      Scanner sc = new Scanner(System.in);
 
      System.out.println("Enter a string:");
      Name = sc.nextLine();
 
      int length = Name.length();
 
      for (int i=length-1;i>=0;i--)
      {
    	  strrev = strrev + Name.charAt(i);
      }
        
 
       System.out.println("The reverse of a String is : " +strrev);
      
      sc.close();
   }
}