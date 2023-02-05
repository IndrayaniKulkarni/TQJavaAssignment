/*
 * 3. Write a Java program to input any alphabet and check whether it is vowel or consonant 
 * 
 * Date - 03 Feb.,2023
 */
package com.assignment03_Switch;

import java.util.Scanner;

public class NumberDay {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("\nInput any letter/alphabet = ");
		char alpha = sc.next().charAt(0);

// method 1
		switch (alpha) {
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("\nAlphabet is vowel.");
			break;
		default:
			System.out.println("\nAlphabet is consonant.");
			break;

		}

		sc.close();

	}

}