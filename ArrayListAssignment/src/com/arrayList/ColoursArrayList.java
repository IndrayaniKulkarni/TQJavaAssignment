package com.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 7. WAP to create a new ArrayList, add some colors (string) and print the collection
 */
public class ColoursArrayList {

	public static void main(String[] args) {
		
		// 7. WAP to create a new ArrayList, add some colors (string) and print the collection
		ArrayList<String> colour = new ArrayList<>();
		colour.add("red");
		colour.add("yellow");
		colour.add("blue");
		colour.add("magenta");
		
		System.out.println("To string method = "+colour);
		System.out.println("With iterator = ");
	    Iterator<String> itr = colour.iterator();
	    while(itr.hasNext()) {
	    	System.out.print(itr.next()+" ");
	    }
	    
	    //8. WAP to remove element from ArrayList.
	    colour.remove(0);
	    System.out.println("\nRemove element from 0th index = "+colour);
	    
	    //9. WAP to remove all elements from ArrayList
	    ArrayList<String> colour2 = new ArrayList<>();
	    colour2.add("grey");
	    colour2.add("magenta");
	    colour2.add("yellow");
	    colour.removeAll(colour2);
	    System.out.println("\nRemove element from colour arraylist which are present in the colour2 arraylist = "+colour);
	    
	    //10. WAP to retain all elements from ArrayList
	    colour.add("red");
		colour.add("yellow");
		colour.add("magenta");
		System.out.println("Colour (arrayList) = "+colour);
		System.out.println("Colour (arrayList) = "+colour2);
		colour.retainAll(colour2);
		System.out.println("ColourandColour2 retain method = "+colour);
		
		//11. WAP to know how many elements in ArrayList
		System.out.println("Number of elements in arrayList colour2 = "+colour2.size());
		
		//12. WAP to test an ArrayList is empty or not
		System.out.println("\nCheck arrayList-colour empty or not = "+colour.isEmpty());
		
		//13. WAP to empty ArrayList
		colour2.clear();
		System.out.println("\nCheck arrayList-colour2 empty or not = "+colour2.isEmpty());
		
		//14. WAP to search an element from ArrayList
		System.out.println("\nArrayList = "+colour);
		System.out.println("Search element-blue in colour arrayList = "+colour.contains("blue"));
		colour.add("blue");
		System.out.println("\nArrayList = "+colour);
		System.out.println("Search element-blue in colour arrayList = "+colour.contains("blue"));
		
		
		//15. WAP to search the specified collection in this collection
		System.out.println("\ncolour = "+colour);
		colour2.add("grey");
	    colour2.add("magenta");
	    colour2.add("yellow");
		System.out.println("colour2 = "+colour2);
		System.out.println("Search arrayList colour2 in colour = "+colour.containsAll(colour2));
		
		System.out.println("\ncolour = "+colour);
		colour2.remove("grey");
		System.out.println("colour2 = "+colour2);
		System.out.println("Search arrayList colour2 in colour = "+colour.containsAll(colour2));
		
		//16. WAP to retrieve an element (at a specified index) from a given ArrayList
		System.out.println("\nValue at 2nd index in arrayList colour = "+colour.get(2));
		
		//17. WAP to insert an element into the ArrayList at the first position
		System.out.println("\nBefore insertion arrayList colour = "+colour);
		colour.add(1, "white");
		System.out.println("After insertion arrayList colour = "+colour);
	}

}
