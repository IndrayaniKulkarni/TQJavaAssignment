/** 1. WAP to find 2nd max value in an array 
 * [20, 0, 31, 45, 100, 1, 105, 90]
 * 
 */
package com.assignmentQs;

import java.util.Scanner;

public class FindSecondMax {
static Scanner sc = new Scanner(System.in);
public static int secondMax(int nums[]) {
	int max = Integer.MIN_VALUE;
	int max2 = Integer.MIN_VALUE;
	for(int i=0; i<nums.length; i++) {
		if(max<nums[i]) {
			max = nums[i];
		}
	}
	for(int i=0; i<nums.length; i++) {
		if(max2<nums[i] && max>nums[i]) {
			max2 = nums[i];
		}
	}
	return max2;
}
public static void input(int nums[]) {
		for(int i=0; i<nums.length; i++) {
			nums[i]=sc.nextInt();
		}
	}
	public static void main(String[] args) {
		
		int n = sc.nextInt();
	    int nums[] = new int[n];
	    input(nums);
	    System.out.println("Second max = "+secondMax(nums));
	    

	}

}
