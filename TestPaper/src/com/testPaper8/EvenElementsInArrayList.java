package com.testPaper8;

import java.util.ArrayList;
import java.util.Iterator;

public class EvenElementsInArrayList {

	public static void main(String[] args) {

		// WAP to add 1 to 50 numbers in ArrayList and print only even numbers
		// (using iterator)

		ArrayList<Integer> nums = new ArrayList<>();

		for (int i = 1; i < 51; i++) {
			nums.add(i);
		}
		System.out.println("nums arrayList contains = " + nums);

		System.out.println("even elements from 1 to 50 = ");
		Iterator<Integer> itr = nums.iterator();
		while (itr.hasNext()) {
			if (itr.next() % 2 != 0) {
				itr.remove();
				// This method removes the current element
				// (i.e., the one returned by the last .next() or .previous() method).
			}
			System.out.print(itr.next() + " ");
		}
	}

}
