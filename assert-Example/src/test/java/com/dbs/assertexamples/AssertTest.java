package com.dbs.assertexamples;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

import java.util.List;

public class AssertTest {
	
	@Test
	public void checkAssertTrue() {
		boolean isListEmpty = ProdClass.isListEmpty();
	}
	
	@Test
	public void checkAssertFalse() {
		boolean isListNotEmpty = ProdClass.isListNotEmpty();
	}
	
	@Test
	public void checkAssertEquals1() {
		int actualSum = ProdClass.add(2, 4);
	}
	
	@Test
	public void checkAssertEquals2() {
		String actualString = ProdClass.getMessage();
	}
	
	@Test
	public void checkAssertNull() {
		String actualString = ProdClass.getNull();
	}
	
	@Test
	public void checkArrayEquals() {
	    int [] actualArray = ProdClass.getArray();
		int[] expectedArray = { 1, 2, 3 };					
	}
	
	@Test
	public void checkAssertListEquals() {
		List<String> expectedList = Arrays.asList("String1", "String2");
		List<String> actualList = ProdClass.getList();
	}

}
