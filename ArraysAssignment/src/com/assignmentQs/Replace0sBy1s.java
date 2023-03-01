/*
 * 12. WAP to replace all the 0’s with 1’s in your array. 
 * Your array is [26, 0, 67, 45, 0, 78, 54, 34, 10, 0, 34] 
 */
package com.assignmentQs;

import java.util.Scanner;

public class Replace0sBy1s {
	static Scanner sc = new Scanner(System.in);
	public static void replace(int a[]) {
		for(int i=0; i<a.length; i++) {
			if(a[i]==0) {
				a[i]=1;
			}
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
		
		int num[] = new int[n];
		
		System.out.println("Array = ");
		input(num);
		System.out.println("Given array = ");
		print(num);
		replace(num);
		System.out.println("\nAfter replacing 0's with 1's = ");
		print(num);
		
	}

}
