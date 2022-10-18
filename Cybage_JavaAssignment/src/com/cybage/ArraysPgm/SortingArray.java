package com.cybage.ArraysPgm;
import java.util.Scanner;
    
public class SortingArray
{
		
        public static void main(String[] args)
        {
        	int n,temp=0;
            Scanner sc=new Scanner(System.in);
            System.out.println("How many numbers do you wish to enter");
            n=sc.nextInt();
            int[] array = new int[n];
            
            
            System.out.println("Enter " +n+ " Array elements: ");
            for(int i=0; i<n; i++)
            {
                array[i]=sc.nextInt();
            }
    
            //sorting technique
            for(int i=0; i<n; i++)
            {
            	for(int j=i+1;j<n;j++)
            	{
            		if(array[i]>array[j])
            		{
            			temp=array[i];
            			array[i]=array[j];
            			array[j]=temp;
            		}
            	}
            }
            
           System.out.println("The Sorted value is  : ");
            for(int i=0; i<n; i++)
            System.out.println(array[i]);
            
            sc.close();
        }
} 