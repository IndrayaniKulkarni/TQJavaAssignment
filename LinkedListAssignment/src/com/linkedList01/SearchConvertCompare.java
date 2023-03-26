package com.linkedList01;

import java.util.ArrayList;
import java.util.LinkedList;

public class SearchConvertCompare {

	public static void main(String[] args) {

		LinkedList<Integer> ls = new LinkedList<>();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		LinkedList<Integer> ls2 = new LinkedList<>();
		ls2.add(1);
		ls2.add(20);
		ls2.add(3);
		ls2.add(40);
//		7.	WAP to check if a particular element exists in a linked list.
		System.out.println("7.	WAP to check if a particular element exists in a linked list.");
		System.out.println("ls = "+ls);
		System.out.println(ls.contains(30)?" 30 is present.":" 30 is not present.");
		System.out.println("-------------------------------------------");
//		8.	WAP to convert a linked list to array list.
		System.out.println("8.	WAP to convert a linked list to array list.");
		ArrayList<Integer> arrLs = new ArrayList<Integer>(ls);
		System.out.println("LinkedList to ArrayList = "+arrLs);
		System.out.println("-------------------------------------------");
//		9.	WAP to compare two linked lists.
		System.out.println("9.	WAP to compare two linked lists.");
		System.out.println("List 1 = "+ls);
		System.out.println("List 2 = "+ls2);
		boolean flag = true;
		for(int i=0; i<ls.size(); i++) {
			if(ls2.contains(ls.get(i))) {
				flag = false;
			}
		}
		System.out.println(flag?" linked list are equal ":" linked list are no equal ");
		System.out.println("-------------------------------------------");
	}

}
