package com.Exception;

import java.util.Scanner;

class Blankexception extends Exception
{
	public Blankexception(String s) 
	{
		super(s);
	}
}

public class Mainclassname {

	public static void main(String[] args) 
	{
		
		String fname=null, lname=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first name");
	    fname=sc.nextLine();
	    System.out.println("enter the last name");
	    lname=sc.nextLine();
	    
	    if(fname==" "||lname==" "||fname.length()==0||lname.length()==0)
	    {
	    	try 
	    	{
		try
		{
			throw new Blankexception("First name and last not suppose to blank");
		}catch(Blankexception e)
		{
			e.printStackTrace();
		}
	    	}catch(NullPointerException e)
		{
			e.printStackTrace();
		}
	    }
	    else
	    {
	    	System.out.println("Name:"+fname+lname);	
	    }
		    
	    

	}

}
