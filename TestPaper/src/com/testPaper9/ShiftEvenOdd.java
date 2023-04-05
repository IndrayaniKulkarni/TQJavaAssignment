package com.testPaper9;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Q1. Write a program to shift all odd number after even number in an array.
 */
public class ShiftEvenOdd {

	static Scanner sc = new Scanner(System.in);
	public static void shiftNum(int arr[]) {
		// 1 2 3 4 5 6
		// pointer to 1 and pointer to 6
		//half arr iteration
		int left = 0, right = arr.length-1;
		while(left<right) {
			if(arr[left]%2!=0 && arr[right]%2==0) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
			left++;
			right--;
		}
		System.out.println(Arrays.toString(arr));
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
		shiftNum(arr);
		
		sc.close();
	}

}
