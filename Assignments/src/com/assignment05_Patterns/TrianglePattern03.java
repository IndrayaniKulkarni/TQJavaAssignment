/*
 * 
* 3) Print pattern 
1 
123 
12345 
1234567 
123456789 
1234567 
12345 
123 
1 
r = 9
c = 9
r=5, c=5
incr. 2
 */
package com.assignment05_Patterns;

public class TrianglePattern03 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= (i * 2 - 1); j++) {

				System.out.print((j));
				// +""+(j+1)
				// j++;

			}
			System.out.println();
		}

		// lower half
		for (int i = (5 - 1); i >= 1; i--) {
			for (int j = 1; j <= (i * 2 - 1); j++) {

				System.out.print((j));
				// +""+(j+1)
				// j++;

			}
			System.out.println();
		}

	}

}
