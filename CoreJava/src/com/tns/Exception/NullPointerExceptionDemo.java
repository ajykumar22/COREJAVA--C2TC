package com.tns.Exception;
public class NullPointerExceptionDemo
{
	public static void main(String args[])
	{
        try 
        {
            String s = null; // null value
            System.out.println(s.charAt(0));
        } 
        catch(NullPointerException e) 
        {
            System.out.println("Null value is found in the program: "+e);
        }
    }
}