package com.arrayLogicalQs;

import java.util.Scanner;

public class DuplicateValues {

	static Scanner sc = new Scanner(System.in);
	public static void findDuplicates(int arr[]) {
		System.out.println("Duplicate elements =");
		for(int i=0; i<arr.length; i++) {
		     for(int j=i+1; j<arr.length; j++) {
		    	 if(arr[i]==arr[j]) {
		    		 System.out.print(arr[i]+" ");
		    	 }
		     }
		}
	}
	public static void input(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Size = ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		input(arr);
		findDuplicates(arr);
		sc.close();
	}

}
