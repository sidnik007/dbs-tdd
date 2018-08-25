package com.nelkinda.beforeafterexercise;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeAfterTest {
	
	private static List<String> sampleList;
	
	@BeforeClass
	public static void setup() {
		sampleList = new ArrayList<String>();
	}
	
	@Before
	public void init() {
		sampleList.add("String1");
	}
	
	@Test
	public void test1() {
		System.out.println(sampleList.toString());
	}
	
	@Test
	public void test2() {
		System.out.println(sampleList.toString());
	}
	
	@After
	public void finalize() {
		sampleList.clear();
	}
	
	@AfterClass
	public static void tearDown() {
		
	}
	

}
