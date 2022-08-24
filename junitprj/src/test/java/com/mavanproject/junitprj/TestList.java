package com.mavanproject.junitprj;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

public class TestList {
	@Test
	public void testList_get()
	 {
		List mocklist = mock(List.class);
		when(mocklist.get(0)).thenReturn("komal");

		
			assertEquals("komal",mocklist.get(0));
//			assertEquals("Maya",mocklist.get(0));
			
			System.out.println(mocklist.get(0));
//			System.out.println(mocklist.get(0));
	 }
}
