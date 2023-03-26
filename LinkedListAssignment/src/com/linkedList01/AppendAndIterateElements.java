package com.linkedList01;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class AppendAndIterateElements {

	public static void main(String[] args) {

		LinkedList<Integer> nums = new LinkedList<>();
		nums.add(10);
		nums.add(23);
		nums.add(24);
		nums.add(24);
//		1.	WAP to append the specified element to the end of a linked list.
		// a. using add
		nums.add(27);
		// b. using addLast
		nums.addLast(29);
		System.out.println("\n-------------------------------------------\n");
//		2.	WAP to iterate through all elements in a linked list.
		// a. for loop
		System.out.println("\nFor loop = ");
		for (int i = 0; i < nums.size(); i++) {
			System.out.print(nums.get(i) + " ");
		}
		// b. enhanced for loop
		System.out.println("\nEnhanced for loop =");
		for (Integer n : nums) {
			System.out.print(n + " ");
		}
		// c. iterator
		System.out.println("\nIterator = ");
		Iterator<Integer> itr = nums.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		// d. listIterator
		System.out.println("\nListIterator = ");
		ListIterator<Integer> itr2 = nums.listIterator();
		while (itr2.hasNext()) {
			System.out.print(itr2.next() + " ");
		}
		// e. decendingIterator
		System.out.println("\nDescending iterator = ");
		Iterator<Integer> desc = nums.descendingIterator();
		while (desc.hasNext()) {
			System.out.print(desc.next() + " ");
		}
		System.out.println("\n-------------------------------------------\n");
		System.out.println("3.	WAP to iterate through all elements in a linked list starting at the specified position.");
//		3.	WAP to iterate through all elements in a linked list starting at the specified position.
		// a. for loop
		System.out.println("\nFor loop = from i = 1");
		for (int i = 1; i < nums.size(); i++) {
			System.out.print(nums.get(i) + " ");
		}
		// b. iterator
		System.out.println("\nListIterator = starting from index 1");
		Iterator<Integer> itr1 = nums.listIterator(1);
		while (itr1.hasNext()) {
			System.out.print(itr1.next() + " ");
		}
        System.out.println("\n-------------------------------------------\n");
        System.out.println("4.	WAP to iterate a linked list in reverse order.");
//		4.	WAP to iterate a linked list in reverse order.
		// a. listIterator
		System.out.println("\nListIterator = reverse");
		ListIterator<Integer> itrR = nums.listIterator(1);
		while (itrR.hasNext()) {
			System.out.print(itrR.next() + " ");
		}
		// b. decendingIterator
		System.out.println("\nDescending iterator = ");
		Iterator<Integer> desc2 = nums.descendingIterator();
		while (desc2.hasNext()) {
			System.out.print(desc2.next() + " ");
		}
	}
}
