package com.Exception;

import java.util.Scanner;

public class NullPointExceptionex {

	public static void main(String[] args) 
	{
		// Null point Exception
		String name=null;
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("enter the name:");
			name=sc.nextLine();
			
		}catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		sc.close();
		System.out.println("Name is:"+name);

	}

}
