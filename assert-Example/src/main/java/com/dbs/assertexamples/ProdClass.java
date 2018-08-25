package com.dbs.assertexamples;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ProdClass {

	public static boolean isListEmpty() {
		List<String> demoList = new ArrayList<>();
		return demoList.isEmpty();
	}

	public static boolean isListNotEmpty() {
		List<String> demoList = new ArrayList<>();
		demoList.add("String1");
		return demoList.isEmpty();
	}

	public static int add(int i, int j) {
		return i + j;
	}

	public static String getMessage() {
		return "Hello World";
	}

	public static String getNull() {	
		return null;
	}

	public static int[] getArray() {
	    int[] sampleArray = { 1, 2, 3 };				
		return sampleArray;
	}

	public static List<String> getList() {
		List<String> sampleList = Arrays.asList("String1", "String2");
		return sampleList;
	}
	

}
