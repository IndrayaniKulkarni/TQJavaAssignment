package com.testPaper8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListConversion {

	public static void main(String[] args) {
		
		//Q1. Show in example how to convert arraylist to array and array to arraylist.
		
		ArrayList<String> stuName = new ArrayList<>();
		stuName.add("Charlie");
		stuName.add("Clara");
		stuName.add("Bob");
		stuName.add("Amy");
		
		System.out.println("ArrayList = "+stuName);
		
		//convert arrayList to array
		//1. type safe
		String[] student = new String[stuName.size()];
		stuName.toArray(student);
		System.out.println("Array (String) Student = "+Arrays.toString(student));
		//2.
		Object[] student2 = stuName.toArray();
		System.out.println("Array (Object) Student = "+Arrays.toString(student2));
	
		//convert array to arrayList
		//1.
		ArrayList<String> stuAL1 = new ArrayList<>(Arrays.asList(student));
		System.out.println("stuAL1 -ArrayList = "+stuAL1);
		//2.
		List<String> stuAL2 = Arrays.asList(student);
		System.out.println("stuAL2 - List = "+stuAL2);
		
		
	}

}
