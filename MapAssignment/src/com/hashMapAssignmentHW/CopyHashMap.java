package com.hashMapAssignmentHW;

import java.util.HashMap;

public class CopyHashMap {

	public static void main(String[] args) {
		
//		1.	WAP to copy all of the mappings from the specified HashMap to another map
		HashMap<Integer,String> books = new HashMap<>();
		books.put(1231,"The importance of being earnest");
		books.put(2423,"Rework");
		books.put(3423,"The raven");
		
		System.out.println("Books hashmap = "+books);
		
		System.out.println("Copy one map to other = ");
		HashMap<Integer,String> booksCopy = books;
		System.out.println("BooksCopy hashmap = "+booksCopy);
		
		//other method putAll
		System.out.println("Copy one map to other = ");
		HashMap<Integer,String> booksCopy1 = new HashMap<>();
		booksCopy1.putAll(books);
		System.out.println("BooksCopy1 hashmap = "+booksCopy1);
		
//		2.	WAP to test a HashMap is empty or not
		System.out.println("Is empty HashMap books = "+books.isEmpty());
		HashMap<Integer,String> ls = new HashMap<>();
		System.out.println("Is empty HashMap ls = "+ls.isEmpty());
		
//		3.	WAP to test if a HashMap contains a mapping for the specified key
//		5.	WAP to test if a HashMap contains a mapping for the specified value
		System.out.println("Does books contains 1231 key = "+books.containsKey(1231)+books.get(1231));
		
//		4.	WAP to search for an element from HashMap using key
		System.out.println("Does books contains 1231 key = "+books.containsKey(1231));
		

	}

}
