package com.cybage.ArraysPgm;
import java.util.Scanner;
    
public class ReverseOrder
{
        public static void main(String[] args)
        {
            int n;
            Scanner sc=new Scanner(System.in);
            System.out.println("How many numbers do you wish to enter");
            n=sc.nextInt();
            int[] array = new int[n];
            
            
            System.out.println("Enter " +n+ " Array elements: ");
            for(int i=0; i<n; i++)
            {
                array[i]=sc.nextInt();
            }
    
            System.out.println("The reverse Array is :");
            for (int i=(n-1); i>=0; i--)
            {
                System.out.println(array[i]);
            }
            sc.close();
        }
} 