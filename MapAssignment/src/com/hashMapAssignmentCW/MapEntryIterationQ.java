package com.hashMapAssignmentCW;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEntryIterationQ {

	public static void main(String[] args) {
		
//		 * 5.	WAP to get all the entries from a HashMap. 
//		 * Iterate the entries and print the Key & Value values
		HashMap<String,Integer> order = new HashMap<>();
		
		order.put("flair ink pen", 5);
		order.put("paper clips", 20);
		order.put("washi tape", 5);
		
		System.out.println("Stationary order = ");
		for(Map.Entry<String, Integer> o: order.entrySet()) {
			System.out.println(o.getKey()+" : "+o.getValue());
		}
		
//		6.	WAP to get only the Keys from a HashMap
		
		Set<String> keys = order.keySet(); //store keys in Set
		Iterator<String> itr = keys.iterator();
		System.out.println("Keys = ");
		while(itr.hasNext()) {
			System.out.print(itr.next()+" , ");
		}
		
//		7.	WAP to get only the Values from a HashMap

		Collection<Integer> vals = order.values();
		Iterator<Integer> itrV = vals.iterator();
		System.out.println("\nValues = ");
		while(itrV.hasNext()) {
			System.out.print(itrV.next()+" , ");
		}
		
	}

}
