package com.testPaper9;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Q3. Write a  program to implement a function that takes a list of integers 
 * as input and returns the sum untill total should be a single digit number.
#		ex:input :1,2,3,4,5,6  
#			      1+2+3+4+5 = 15 
#		  output : 1+5 =6

 */
public class AddTillSingleDigit {
	static Scanner sc = new Scanner(System.in);
	
	public static void addNum(int num) {
		int sum = 0 ;
		while(num!=0) {
			int r = num%10;
			num = num/10;
			sum += r;
		}
		checkDigits(sum);
	}
	public static void checkDigits(int num) {
		
		if(num<10) {
			System.out.println(num);
		}
		else {
			addNum(num);
		}
	}
	public static void addArray(int arr[]) {
		int sum = 0 ;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		checkDigits(sum);
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
		
		addArray(arr);
	}
}
