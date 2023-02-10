/*
 * 4) Print pattern 
1 
121 
12321 
1234321 
123454321 
1234321 
12321 
121 
1 
Follow rows and cols approch
identify and design accordingly

 */
package com.assignment05_Patterns;

public class RightDirectionTriangleIncrDecr {

	public static void main(String[] args) {

		int rows = 5;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < (i+1); j++) {
				System.out.print(j+1);
			}
			for (int j = i-1; j >0; j--) {
				System.out.print(j-1);
			}
			System.out.println();
		}

	}

}
