package com.linkedList01;

import java.util.LinkedList;

public class DisplayAndRemoveElement {

	public static void main(String[] args) {
	
		LinkedList<String> book = new LinkedList<>();
		book.add("The picture of dorian gray");
		book.add("Emma");
		book.add("Atomic habit");
		book.add("The valley of fear");
		book.add("Wildfire");
		
//		10.	WAP to get the first and last occurrence of the specified elements in a linked list.
		System.out.println("\n10.	WAP to get the first and last occurrence of the specified elements in a linked list.");
		System.out.println("Linked list = \n"+book);
		System.out.println("Book at first occurance (using getFirst)= " + book.getFirst());
		System.out.println("Book at first occurance (using peek)= " + book.peek());
		System.out.println("\n-------------------------------------------");
		
		System.out.println("Book at last occurance (using getLast)= \n" + book.getLast());
		System.out.println("Book at last occurance (using peekLast)= \n" + book.peekLast());
		System.out.println("\n-------------------------------------------");
		
//		11.	WAP to display the elements and their positions in a linked list.
		System.out.println("\n11.	WAP to display the elements and their positions in a linked list.");
		for(int i=0; i<book.size(); i++) {
			System.out.print(i+" : "+book.get(i)+"\n");
		}
		System.out.println("\n-------------------------------------------");
		
//		12.	WAP to remove a specified element from a linked list.
		System.out.println("\n12.	WAP to remove a specified element from a linked list.");
		System.out.println("\nLinkedList before removing element \"Atomic habit\" \n"+book);
		book.remove("Atomic habit");
		System.out.println("LinkedList after removing element \"Atomic habit\" \n"+book);
		System.out.println("\n-------------------------------------------");
		
//		13.	WAP to remove first and last element from a linked list.
		System.out.println("\n13.	WAP to remove first and last element from a linked list.");
		System.out.println("\nLinkedList before removing element at 0th index = \n"+book);
		System.out.println("Removed element = "+book.get(0));
		book.remove(0);
		System.out.println("LinkedList after removing element at 0th index = \n"+book);
		
		System.out.println("\nLinkedList before removing element at last= \n"+book);
		System.out.println("Removed element = "+book.pop());
		System.out.println("LinkedList after removing element at last= \n"+book);
		System.out.println("\n-------------------------------------------");
		
//		14.	WAP to remove all the elements from a linked list.
		System.out.println("\n14.	WAP to remove all the elements from a linked list.");
		System.out.println("\nLinkedList before removing all elements = \n"+book);
		book.clear();
		System.out.println("LinkedList after removing all elements = \n"+book);

	}

}
