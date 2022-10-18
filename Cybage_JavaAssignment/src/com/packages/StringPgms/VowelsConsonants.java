package com.packages.StringPgms;

import java.util.Scanner;

public class VowelsConsonants
{

	public static void main(String[] args) 
	{
		int vowels=0,consonants=0,spaces=0;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Please enter a text");
		String Text=sc.nextLine();
		
		int length=Text.length();
		
		for(int i=0;i<=length-1;i++)
		{
			char ch=Text.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				vowels++;
			}
			else if (ch==' ')
			{
				spaces++;
			}
			else
				consonants++;
		}
		
		System.out.println("The Numbers of Vowels in Text is :" +vowels);
		System.out.println("The Numbers of consonants in Text is :" +consonants);
		System.out.println("The Numbers of spaces in Text is :" +spaces);
		
		sc.close();
	}

}
