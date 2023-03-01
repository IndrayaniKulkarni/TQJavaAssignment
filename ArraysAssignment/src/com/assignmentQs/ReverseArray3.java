/*
 * 4. WAP to reverse the array itself, don’t print array in reverse – I want current array
reverse. Means e.g. arr[] = [3, 90, 45, 29, 37, 78] so your same array must be [78,
37, 29, 45, 90, 3] by using temporary array. 

 */
package com.assignmentQs;

import java.util.Scanner;

public class ReverseArray3 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void reverse(int num[], int ans[]) {
		int k=0;
		for(int i=num.length-1; i>=0; i--) {
			ans[k] = num[i];
			k++;
		}
	}
	public static void print(int a[]) {
		for(int x:a) {
			System.out.print(x+" ");
		}
	}
	public static void input(int nums[]) {
		for(int i=0; i<nums.length; i++) {
			nums[i] =sc.nextInt();
		}
	}
	public static void main(String[] args) {
		System.out.println("Size = ");
	     int n = sc.nextInt();
	     
	     int a[] = new int[n];
	     System.out.println("Array =");
	     input(a);
	     System.out.println("Before  reversing = ");
	     print(a);
	     
	     int ans[] = new int[a.length];
	     reverse(a,ans);
	     System.out.println("\nAfter reversing = ");
	     print(ans);
	}

}
