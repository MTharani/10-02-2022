package com.Exception;

import java.util.Scanner;

class Checkage extends Exception
{
	public Checkage(String s)
	{
		super(s);    //call the super class constructor(exception class)
	}
}
public class Mainclass {

	public static void main(String[] args) 
	{
		int age;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the age:");
		age=sc.nextInt();
		try {
		if(age<18)
		{
		   Checkage ob=new Checkage("not eligible for voting");
		   throw ob;
		}
		   //throw new checkage("not eligible for voting");
		   else
		   {
			   System.out.println("You can vote");
		   }
		}catch(Checkage e)
		{ 
			e.printStackTrace();
		}
		
		sc.close();
	
		
	}

}
