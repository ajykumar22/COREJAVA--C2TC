package com.tns.Exception;

public class NumberFormatExceptionDemo 
{
	public static void main(String args[])
	{
        try
        {
            int n = Integer.parseInt ("Test");				 // Test is not a number.
            System.out.println(n);
        } 
        catch(NumberFormatException e)
        {
            System.out.println("Number format exception: "+e);
        }
    }
}

