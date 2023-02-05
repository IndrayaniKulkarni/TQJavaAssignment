/*
 * 4.	 WAP to show the use of break statement ( in for loop)
 * 5th Feb.,2023
 */
package com.assignment03_Loop;

import java.util.Scanner;

public class UseBreak {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("\nPlease enter any integer = ");
		num = sc.nextInt();
		int i = 1;
		// though the number should incr till num
		// it will stop at point where 10 multiple value

		while (i <= num) {
			if (i % 10 == 0) {
				break;
			}
			System.out.print(i + "\t");
			i += 1;
		}
		sc.close();

	}

}
