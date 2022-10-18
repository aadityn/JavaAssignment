package com.cybage.ArraysPgm;
import java.util.Scanner;
    
public class SumofAllElements
{
		
        public static void main(String[] args)
        {
        	int n,sum=0;
            Scanner sc=new Scanner(System.in);
            System.out.println("How many numbers do you wish to enter");
            n=sc.nextInt();
            int[] array = new int[n];
            
            
            System.out.println("Enter " +n+ " Array elements: ");
            for(int i=0; i<n; i++)
            {
                array[i]=sc.nextInt();
            }
    
            
            for(int i=0; i<n; i++)
            {
            	sum=sum+array[i];
            }
            
            System.out.println("The sum of All Array elements are : " +sum);
            sc.close();
        }
} 