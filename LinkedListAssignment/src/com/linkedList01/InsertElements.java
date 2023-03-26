package com.linkedList01;

import java.util.LinkedList;

public class InsertElements {

	public static void main(String[] args) {

		LinkedList<String> names = new LinkedList<>();
		names.add("bob");
		names.add("mark");
		names.add("billy");
		
//		5.	WAP to insert the specified element at the specified position in the linked list. 
//		7.	WAP to insert the specified element at the front of a linked list.
		System.out.println("5.	WAP to insert the specified element at the specified position in the linked list. OR\n 7.	WAP to insert the specified element at the front of a linked list.");
		System.out.println("LinkedList before insertion = " + names);
		names.add(1, "alice");
		System.out.println("LinkedList after insertion = " + names);
		System.out.println("-------------------------------------------");
		
//		6.	WAP to insert elements into the linked list at the first and last position.
//		8.	WAP to insert the specified element at the end of a linked list.
		System.out.println("6.	WAP to insert elements into the linked list at the first and last position. OR\n8.	WAP to insert the specified element at the end of a linked list.");
		// at first
		System.out.println("LinkedList before insertion = " + names);
		names.add(0, "mary");
		System.out.println("LinkedList after insertion = " + names);
		// add at first
		System.out.println("LinkedList before insertion = " + names);
		names.addFirst("santosh");
		System.out.println("LinkedList after insertion = " + names);
		// offer first
		System.out.println("LinkedList before insertion = " + names);
		names.offerFirst("sandip");
		System.out.println("LinkedList after insertion = " + names);

		// at last
		System.out.println("LinkedList before insertion = " + names);
		names.add(names.size()+1, "nita");
		System.out.println("LinkedList after insertion = " + names);
		// add at last
		System.out.println("LinkedList before insertion = " + names);
		names.addLast("govind");
		System.out.println("LinkedList after insertion = " + names);
		// offer last
		System.out.println("LinkedList before insertion = " + names);
		names.offerLast("sam");
		System.out.println("LinkedList after insertion = " + names);
		System.out.println("-------------------------------------------");

//		9.	WAP to insert some elements at the specified position into a linked list.
		System.out.println("9.	WAP to insert some elements at the specified position into a linked list.");
		System.out.println("LinkedList before insertion = " + names);
		names.add(4,"savita");
		System.out.println("LinkedList after insertion = " + names);
		System.out.println("-------------------------------------------");
	}

}
