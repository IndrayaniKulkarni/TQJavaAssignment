package com.hashMapAssignmentCW;

import java.util.HashMap;

/*
 * 4.	WAP to create a map using Wrapper class as key and value 
 * same as keys’ data type WAP to count the number of key-value (size) mappings in a map.
 */
public class WrapperClassMap {

	public static void main(String[] args) {

		HashMap<Integer, Integer> num = new HashMap<>();

		num.put(1, 10);
		num.put(2, 20);
		num.put(3, 30);
		System.out.println("Size of num = "+num.size());
		System.out.println("Elements in num = ");
		for(Object o: num.keySet()) {
			System.out.println(o+" : "+num.get(o));
		}

	}

}
