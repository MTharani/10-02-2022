package com.Exception;

import java.util.Scanner;

class BankException extends Exception
{
	public BankException(String s)
	{
		super(s);
	}
}
class SBIBank
{
	int balanceamt;
	public SBIBank()
	{
		 balanceamt=20000;
		
	}
	void withDraw(int withdrawamt)
	{
		try {
		if(withdrawamt>balanceamt)
		{
			throw new BankException("Insufficent Balance ");
		}
		else
		{
			balanceamt=balanceamt-withdrawamt;
			System.out.println("your withDraw amount is:"+withdrawamt);
			System.out.println("Balance Amount:"+balanceamt);
		}
		}catch(BankException e)
		{
			e.printStackTrace();
		}
	}
}
public class Mainbank {

	public static void main(String[] args) 
	{
		SBIBank sob=new SBIBank();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the WithDraw amont:");
		int amt=sc.nextInt();
		sob.withDraw(amt);
		sc.close();

	}

}
