package com.testPaper8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ColoursArrayList {

	public static void main(String[] args) {
		// Write a Java program to create a new array list,
		// add some colors (string) and print out the collection

		ArrayList<String> colours = new ArrayList<>();

		colours.add("white");
		colours.add("brown");
		colours.add("magenta");
		colours.add("blue");

		// print - toString
		System.out.println("\nToString() = " + colours.toString());

		// print - for loop
		System.out.println("\nForLoop = ");
		for (int i = 0; i < colours.size(); i++) {
			System.out.print(colours.get(i));
		}

		// print - enhanced for loop
		System.out.println("\nEnhanced forLoop = ");
		for (String s : colours) {
			System.out.print(s + " ");
		}

		// print - iterator
		System.out.println("\nIterator = ");
		Iterator<String> itr = colours.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

		// print - listIterator - forward
		System.out.println("\nListIterator (forward) =  ");
		ListIterator<String> liter1 = colours.listIterator();
		while (liter1.hasNext()) {
			System.out.print(liter1.next() + " ");
		}

		// print - listIterator - backward
		System.out.println("\nListIterator (backward) =  ");
		ListIterator<String> liter2 = colours.listIterator(colours.size());
		while (liter2.hasPrevious()) {
			System.out.print(liter2.previous() + " ");
		}
	}

}
