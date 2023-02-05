/*
 * 5.	Write a Java program to print all alphabets from a to z. - using  for loop
 *5th Feb.,2023
 */
package com.assignment03_Loop;

public class AtoZWithForLoop {

	public static void main(String[] args) {

		// Capital letters
		for (int i = 65; i <= 90; i++) {
			System.out.print((char) i + " ");
		}
		System.out.println();
		// Small letters
		for (int i = 97; i <= 122; i++) {
			System.out.print((char) i + " ");
		}

	}

}
