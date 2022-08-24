package com.mavanproject.junitprj;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.spy;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SpyTest {

	@Test
	public void test() {
	 List spyArrayList = spy(ArrayList.class);
	 assertEquals(0, spyArrayList.size());
	 
	 spyArrayList.add("Mockito");
	 spyArrayList.add("spy");
	 
	 assertEquals(2, spyArrayList.size());
	 
	 System.out.println(spyArrayList.size());
	 System.out.println(spyArrayList);
	}
}
