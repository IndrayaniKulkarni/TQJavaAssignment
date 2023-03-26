package com.testPaper8;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchArrayList {

	public static void searchElement(ArrayList<Integer> arr, int target) {
		
		if(arr.contains(target)) {
			System.out.println(target+" found ..");
		}
		else {
			System.out.println(target+" not found..");
		}
//		System.out.println(""+arr.contains(target));
	}
	public static void main(String[] args) {
		//Write a Java program to search an element in an array list
		Scanner sc = new Scanner(System.in);
	   // System.out.println("Size = ");
		//int size = sc.nextInt();
		ArrayList<Integer> arrLs = new ArrayList<>();
		System.out.println("Array nums = ");
//		int num;
//		for(int i=0; i<arrLs.size(); i++) {
//		    num = sc.nextInt();
//			arrLs.add(num);
//		}
//		System.out.println(arrLs);
		arrLs.add(101);
		arrLs.add(102);
		arrLs.add(103);
		arrLs.add(104);
		arrLs.add(105);
		System.out.println(arrLs);
		System.out.println("element need to search = ");
//		int target = sc.nextInt();
		int target = 103;
		searchElement(arrLs,target);
		
		sc.close();
	}

}
