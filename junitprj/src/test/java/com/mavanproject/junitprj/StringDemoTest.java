package com.mavanproject.junitprj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringDemoTest {
	
	@Test
	public  void stringTest1() {
		String str = "are";
		boolean result = StringDemo.checkString(str);
		System.out.println("Content result is: " + result);
		assertEquals(true, result);
	}
	

	@Test
	public  void stringTest2() {
		String str = "Hello";
		boolean result = StringDemo.checkString(str);
		System.out.println("Equal result is: " + result);
		assertEquals(true, result);
	}

}
