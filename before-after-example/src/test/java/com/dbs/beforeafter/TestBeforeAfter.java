package com.dbs.beforeafter;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestBeforeAfter {
	
	@BeforeClass
	public static void setup() {
		System.out.println("Before Class");
	}
	
	@Before
	public void init() {
		System.out.println("Before Test Case");
	}
	
	@Test
	public void test1() {
		System.out.println("Test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("Test 2");
	}
	
	@After
	public void finalize() {
		System.out.println("After Test Case");
	}
	
	@AfterClass
	public static void tearDown() {
		System.out.println("After Class");
	}

}
