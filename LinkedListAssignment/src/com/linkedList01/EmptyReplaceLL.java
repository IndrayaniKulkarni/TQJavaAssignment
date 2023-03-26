package com.linkedList01;

import java.util.LinkedList;

public class EmptyReplaceLL {

	public static void main(String[] args) {
	
		LinkedList<Integer> num = new LinkedList<>();
//		10.	WAP to test a linked list is empty or not.
		System.out.println("10.	WAP to test a linked list is empty or not.");
		System.out.println("Is list empty = "+num.isEmpty());
		System.out.println("-------------------------------------------");
		
		
		num.add(101);
		num.add(232);
		num.add(235);
		
//		11.	WAP to replace an element in a linked list.
		System.out.println("10.	WAP to test a linked list is empty or not.");
		System.out.println("Before replace = "+num);
		num.set(2,23);
		System.out.println("After replace = "+num);
		System.out.println("-------------------------------------------");

	}

}
