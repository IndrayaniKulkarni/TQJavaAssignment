package com.hashMapAssignmentCW;

import java.util.HashMap;
import java.util.Map;

/*
 * 1.	WAP to add elements to a HashMap without using generics (ie do not use <>) 
 * and print content of it. Use Integer as Key and String as Value. 
 * In second HashMap add elements of String type as Key and Integer as Value.
 */
public class AddPrintHashMap {

	public static void main(String[] args) {
	
		//WAP to add elements to a HashMap without using generics (ie do not use <>) 
        //and print content of it. Use Integer as Key and String as Value. 
		HashMap colours = new HashMap();
		colours.put(100, "white");
		colours.put(102,"brown");
//		colours.put("gray",324);
	
		for(Object key: colours.keySet()) {
			Object val = colours.get(key);
			System.out.println(key+" : "+val);
		}
	
//		In second HashMap add elements of String type as Key and Integer as Value.
		HashMap<String,Integer> students = new HashMap<>();
		students.put("yasmin",1321);
		students.put("brian", 234);
		
		for(Map.Entry<String,Integer> e: students.entrySet()) {
			System.out.println(e.getKey()+" : "+e.getValue());
		}
	
	}

}
