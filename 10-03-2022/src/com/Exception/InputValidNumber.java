package com.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputValidNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num;
		while(true)
		{
			System.out.println("Enter valid number");
			try {
				num=Integer.parseInt(sc.next());
				break;//while loop

			}catch(NumberFormatException e) {
				e.printStackTrace();
			}catch(InputMismatchException e) {
				e.printStackTrace();
			}
			sc.close();
			System.out.println("Please valid integer only");		
		}

		System.out.println("Input is valid");
	}
}



