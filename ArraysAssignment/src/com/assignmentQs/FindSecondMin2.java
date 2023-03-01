/** 
 2. WAP to find 2nd min value in an array [-20, 0, -25, 15, 19, 37, 23] 
 * 
 */
package com.assignmentQs;

import java.util.Scanner;

public class FindSecondMin2 {
static Scanner sc = new Scanner(System.in);
public static int secondMin(int nums[]) {
	int min = Integer.MAX_VALUE;
	int min2 = Integer.MAX_VALUE;
	for(int i=0; i<nums.length; i++) {
		if(min>nums[i]) {
			min = nums[i];
		}
	}
	for(int i=0; i<nums.length; i++) {
		if(min2>nums[i] && min<nums[i]) {
			min2 = nums[i];
		}
	}
	return min2;
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
	    System.out.println("Second min = "+secondMin(nums));
	    

	}

}
