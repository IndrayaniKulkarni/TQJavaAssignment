/*
 * 
 * NEED TO REVISIT (good difficulty level)
3) Print pattern 
1 
123 
12345 
1234567 
123456789 
1234567 
12345 
123 
1
rows = 9
cols = ....1,3,5, 

 */
package com.assignment05_Patterns;

public class RightDirectionTriangle2incr {

	public static void main(String[] args) {

		int rows = 5;

//		 first half triangle
		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < (((i + 1) * 2) - 1); j++) {
				System.out.print(j + 1);

			}
			System.out.println();
		}
		// second half

		for (int i = (rows - 1); i >= 0; i--) {

			for (int j = 0; j < (((i + 1) * 2) - 1); j++) {
				System.out.print(j + 1);

			}
			System.out.println();
		}

	}

}
