package com.mavanproject.junitprj;

public class StringDemo {
	public static boolean checkString(String s2)
	{ 
		String s1 = "Hi,How are you?";
		if(s1.contains(s2))
		{
			return true;
		}
		return false;
		
	}
	public static boolean checkString1(String s2)
	{

		String s1 = "Hello";
		if(s1.equals(s2))
		{
			return true;
		}
		return false;
	}

}
