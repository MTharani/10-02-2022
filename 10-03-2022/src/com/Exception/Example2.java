package com.Exception;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args)
	{
		String name;
		int age;
		double sal;
		Scanner sc=new Scanner(System.in);
        
		System.out.println("enter the age:");
		age=sc.nextInt();
		sc.nextLine();
		System.out.println("enter the name:");
		name=sc.nextLine();
		System.out.println("Enter the sal:");
		sal=sc.nextDouble();
		
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("salary:"+sal);
		sc.close();

	}

}
