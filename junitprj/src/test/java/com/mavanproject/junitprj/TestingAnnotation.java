package com.mavanproject.junitprj;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestingAnnotation {
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("beforeClass ==== execute before all test cases");
	}
	
	@Before
	public void Before()
	{
		System.out.println("Befor method");  
	}
	
	@Test(timeout = 100)
	public void method1() {  
		 
	System.out.println("Test time method1");  
	}
	
	@Test(timeout = 200)
	public void method2() {  
		 
	System.out.println("Test time method2");  
	}
	
	@Test
	public void test() {  
 
	System.out.println("test method");  
	}
	
	@AfterClass
	public static void afterClass() {  
 
	System.out.println("after class");  
	}
	
	
	@After
	public void After()
	{
		System.out.println("After Method");  
	}
	
	@Ignore
	public void ignoreMethod()
	{
		System.out.println("Ignore method");  
	}

}
