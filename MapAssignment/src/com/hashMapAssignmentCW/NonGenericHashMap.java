package com.hashMapAssignmentCW;

import java.util.HashMap;

/*
 * 2.	WAP add elements to HashMap without using generics, 
 * 0th location use String as key and Integer as value, 
 * on 1st location use String as key String and Integer as value.
 */
public class NonGenericHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap map = new HashMap();
		map.put("priya",1212);
		map.put("nita", 342);
		
	    for(Object k:map.keySet()) {
	    	System.out.println(k+" : "+map.get(k));
	    }
	}

}
