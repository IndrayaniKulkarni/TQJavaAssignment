package com.arrayList;

import java.util.ArrayList;
import java.util.List;

/*
 * 1. WAP to add elements to arraylist without using generics (no <>) and 
 * print content of it where Integer is used. In second arraylist String is used.
 * 2. WAP add elements to arraylist without using generics, 0th location keep Integer, 
 * 1st location String now print each element and display contents.
 */
public class NonGenericClass {

	public static void main(String[] args) {
		//1.
		List ls1 = new ArrayList<>();
		ls1.add(102);
		ls1.add(100);
		ls1.add(103);
		for(int i=0; i<ls1.size(); i++) {
			System.out.println(ls1.get(i));
		}
		
		List ls2 = new ArrayList<>();
		ls2.add("Java");
		ls2.add("C++");
		ls2.add("LISP");
		for(int i=0; i<ls2.size(); i++) {
			System.out.println(ls2.get(i));
		}
		
		//2.
		List ls3 = new ArrayList<>();
		ls3.add(101);
		ls3.add("C++");
		
		for(int i=0; i<ls3.size(); i++) {
			System.out.println(ls3.get(i));
		}
		
	}

}
