package com.hashMapAssignmentHW;

import java.util.HashMap;
import java.util.Iterator;

public class RemoveElements {

	public static void main(String[] args) {
	
		HashMap<Integer,String> books = new HashMap<>();
		books.put(1231,"The importance of being earnest");
		books.put(2423,"Rework");
		books.put(3423,"The raven");
//		6.	WAP to remove an element from HashMap using key
		System.out.println("Remove key 3423 = "+books.remove(3423));//returns value
		
		//returns boolean
		System.out.println("Remove key = 2423 , val = Rework ="+books.remove(2423,"Rework"));
		
//		7.	WAP to empty Map. 
		//(Hint - Get keys and iterate through the keys to remove entries from Map)
		
		books.put(2423,"Rework");
		books.put(3423,"The raven");
		//option 1 
//		System.out.println("Before clear = "+books);
//		books.clear();
//		System.out.println("After clear = "+books);

		//option 2
		System.out.println("Before ="+books);
		Iterator<Integer> iter = books.keySet().iterator();
		while (iter.hasNext()) {
		    Integer key = iter.next();
		    if (key.equals(1231)) {
		        iter.remove(); // Remove the "b" key and its value from the map
		    }
		}
		System.out.println("After = "+books);
	
	
	}

}
