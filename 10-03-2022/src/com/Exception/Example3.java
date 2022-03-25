package com.Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Example3 
{
	
		public static void main(String[] args)throws IOException {
			String name;
			int age;
			float sal;
			
		//Create an object
			//InputStreamReader is=new InputStreamReader(System.in);
			//BufferedReader br=new BufferedReader(is);
			
			
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			//readLine()->String
			//int age=Integer.parseInt(br.readLine());   //"23"
			//float sal=Float.parseFloat(br.readLine());
			//long l=Long.parseLong(br.readLine())
			//short s=Short.parseShort(br.readLine());
			//char ch=br.readLine().charAt(0);
			System.out.println("Enter age");
			age=Integer.parseInt(br.readLine());
			System.out.println("Enter name");
			name=br.readLine();
			System.out.println("enter salary");
			sal=Float.parseFloat(br.readLine());
			System.out.println(age);
			System.out.println(name);
			System.out.println(sal);
			
		}
		


}
