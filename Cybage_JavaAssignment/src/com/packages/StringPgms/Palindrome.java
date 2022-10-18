package com.packages.StringPgms;

import java.util.Scanner;

class Palindrome
{
   public static void main(String args[])
   {
      String Name, strrev = "";
      Scanner sc = new Scanner(System.in);
 
      System.out.println("Enter a string:");
      Name = sc.nextLine();
 
      int length = Name.length();
 
      for ( int i = length - 1; i >= 0; i-- )
         strrev = strrev + Name.charAt(i);
 
      if (Name.equals(strrev))
         System.out.println("The Entered String is a palindrome");
      else
         System.out.println("The Entered String is not a palindrome");
 
      sc.close();
   }
}