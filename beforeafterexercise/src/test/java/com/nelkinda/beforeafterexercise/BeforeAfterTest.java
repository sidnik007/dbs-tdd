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
	
	
	public static void setup() {
		sampleList = new ArrayList<String>();
	}
	
	
	public void init() {
		sampleList.add("String1");
	}
	
	
	public void test1() {
		System.out.println(sampleList.toString());
	}
	
	
	public void test2() {
		System.out.println(sampleList.toString());
	}
	
	
	public void finalize() {
		sampleList.clear();
	}
	
	
	public static void tearDown() {
		
	}	
}
