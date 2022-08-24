package com.mavanproject.junitprj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MavenAddition {
	public static int add(int a,int b) 
	{
		int add = a+b;
		return add;
	}
	@Test
	public void addtest()
	{
		assertEquals(4, MavenAddition.add(2, 2));
	}
	

}
