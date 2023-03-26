package com.linkedList01;

import java.util.LinkedList;

public class RetriveRemoveElementLL {

	public static void main(String[] args) {
		
		LinkedList<Integer> nums = new LinkedList<>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		
//		4.	WAP to remove and return the first element of a linked list.
		System.out.println("4.	WAP to remove and return the first element of a linked list.");
		System.out.println("Before removing element = "+nums);
		System.out.println("Element to be removed = "+nums.removeFirst());
		System.out.println("After removing element = "+nums);
		System.out.println("-------------------------------------------");
		
//		5.	WAP to retrieve but does not remove, the first element of a linked list.
		System.out.println("5.	WAP to retrieve but does not remove, the first element of a linked list.");
		System.out.println("nums = "+nums);
		System.out.println("Element at 0th index (getFirst) = "+nums.getFirst());
		System.out.println("Element at 0th index (peekFirst) = "+nums.peekFirst());
		System.out.println("Element at 0th index (pollFirst) = "+nums.pollFirst());
		System.out.println("-------------------------------------------");
		
//		6.	WAP to retrieve but does not remove, the last element of a linked list.
		System.out.println("6.	WAP to retrieve but does not remove, the last element of a linked list.");
		System.out.println("nums = "+nums);
		System.out.println("Element at 0th index (getLast) = "+nums.getLast());
		System.out.println("Element at 0th index (peekLast) = "+nums.peekLast());
		System.out.println("Element at 0th index (pollLast) = "+nums.pollLast());
		System.out.println("-------------------------------------------");
	}

}
