package com.mavanproject.junitprj;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class TestAssertion {
	
	@Test
	public void testAssertion()
	{
		String str1 = new String("Komal");
		String str2 = new String("Komal");
		String str3 = null;
		String str4 = "Ankita";
		String str5 = "Ankita";
		String str6 = "Pooja";
		
		int a = 10;
		int b = 20;
		
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {1,2,3,4,5};
		
		assertEquals(str1, str2);
		assertTrue(a < b);
		assertFalse(a>b);
		assertNotNull(str4, str5);
		assertNull(str3);
		assertSame(str4, str5);
		assertNotSame(str5, str6);
		assertArrayEquals(arr1, arr2);
		
		
	}
	
}	
	
	
//	public String getPropValue(final String key)
//	{
//		Map<String, String> appProps = new HashMap<String, String>();
//		appProps.put("key1", "value1");
//		appProps.put("key2", "value2");
//		appProps.put("key3", "value3");
//		appProps.put("key4",null);
//		appProps.put("key5", "value4");
//		appProps.put("key6", "value4");
//		
//		String s = "komal";
//		String s1 = "Bhagyashree";
//		
//		return appProps.get(key);
//	}
//	@Test
//	public void assernNotNull1()
//	{
//		TestAssertion testA = new TestAssertion();
//		assertNotNull(testA.getPropValue("key1"),testA.getPropValue("key2"));
//	}
//	@Test
//	public void asserNull1()
//	{
//		TestAssertion testA = new TestAssertion();
//		assertNull(testA.getPropValue("key4"));
//	}
//	@Test
//	public void asserSame1()
//	{
//		TestAssertion testA = new TestAssertion();
//		assertSame(testA.getPropValue("key5"),testA.getPropValue("key6"));
//	}
//	@Test
//	public void assertNotSame1()
//	{
//		TestAssertion testA = new TestAssertion();
//		assertNotSame(testA.getPropValue("key1"),testA.getPropValue("key6"));
//	}
//	
//	@Test
//	public void assertequl1()
//	{
//		TestAssertion testA = new TestAssertion();
//		assertEquals(testA.getPropValue("key5"),testA.getPropValue("key6"));
//	}
//	
//	@Test
//	public void assertTrue11(String s,String s1)
//	{
//		TestAssertion testA = new TestAssertion();
//		assertTrue(s,s1);


