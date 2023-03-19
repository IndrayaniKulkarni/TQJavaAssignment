/*
 * . WAP to swap array like input array is [2, 4, 9, 0], so your output array must be [9, 
0, 2, 4] 
 */
package com.arrayLogicalQs;

import java.util.Arrays;
import java.util.Scanner;

public class SwapElementsInArray {

	public static void swapEle(int arr[]) {
		int mid = (arr.length)/2;
		for(int i=0; i<(arr.length)/2; i++) {
			int temp =arr[i+mid];
			arr[i+mid] = arr[i];
			arr[i]=temp;
		}
	}
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Size = ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		DuplicateValues.input(arr);
		System.out.println("Before = "+Arrays.toString(arr));
		swapEle(arr);
		System.out.println("After = "+Arrays.toString(arr));
		
		sc.close();
	}

}
