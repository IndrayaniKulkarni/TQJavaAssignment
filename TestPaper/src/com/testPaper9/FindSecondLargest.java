package com.testPaper9;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Q2.  Given an array of integers, write a function to find the second largest element 
 * in the array.
#	input: [64,56,3,5,12,44,63,65]
#	output: 64
 */
public class FindSecondLargest {
	static Scanner sc = new Scanner(System.in);
	
	public static void secondLargest(int arr[]) {
		int max = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		for(int i=0; i<arr.length; i++) {
			if(max2<arr[i] && arr[i]<max) {
				max2 = arr[i];
			}
		}
		System.out.println("max = "+max+"\t second max = "+max2);
	}
	public static void input(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}
	public static void main(String[] args) {
	
		System.out.println("Size = ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Array = ");
		input(arr);
		System.out.println(Arrays.toString(arr));
		
		secondLargest(arr);
	}

}
