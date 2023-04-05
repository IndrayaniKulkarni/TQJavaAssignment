package com.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListAddOp {

	public static void main(String[] args) {
	
		ArrayList<Integer> l = new ArrayList<>();
//				3. WAP to use add operation of ArrayList
		//add
		l.add(100);
		//add index
		l.add(1, 101);
		//addAll
		ArrayList<Integer> l2 = new ArrayList<>();
		l2.add(201);
		l2.add(202);
		l2.add(203);
		l.addAll(l2);
		//addAll index
		l.addAll(1, l2);
//				4. WAP to print all elements of ArrayList using iterator
		System.out.println("ArrayList using iterator");
		Iterator<Integer> itr = l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
//				5. WAP to iterate through all elements in an ArrayList using for loop
		System.out.println("ArrayList using for loop");
		for(int i=0; i<l.size(); i++) {
			System.out.println(l.get(i));
		}
//				6. WAP to iterate through all elements in an ArrayList using for each
		System.out.println("ArrayList using for each");
		for(Integer i:l) {
			System.out.println(i);
		}
	}

}
