package com.hashMapAssignmentCW;

import java.util.HashMap;
import java.util.Map;

/*
 * 3.	WAP to add elements to a HashMap using generics with Integer as 
 * Key and String as value. And 4 key-value Map.Entry
 */
public class MapEntryIteration {

	public static void main(String[] args) {
		
		HashMap<Integer,String> emp = new HashMap<>();
		emp.put(101, "Sally");
		emp.put(103, "klaus");
		emp.put(132,"Sandip");
		emp.put(321, "Sarita");
		
		for(Map.Entry<Integer,String> e:emp.entrySet()) {
			System.out.println(e.getKey()+" : "+e.getValue());
		}
	}

}
