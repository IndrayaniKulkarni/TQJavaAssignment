/*
 * 2. Write a Java program to input any character 
 * and check whether it is alphabet, digit or special character.
 */
package com.assignment02_ConditionalStatements;

import java.util.Scanner;

public class CheckInputCategory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Scanner sc = new Scanner(System.in);
		ch = sc.next().charAt(0);
		sc.close();

		if ((ch >= 'A') && (ch <= 'Z')) {
			System.out.println("\nCharacter is Capital letter.");
		} else if ((ch >= 'a') && (ch <= 'z')) {
			System.out.println("\nCharacter is Small letter.");
		} else if ((ch >= '0') && (ch <= '9')) {
			System.out.println("\nCharacter is digit.");
		} else {
			System.out.println("\nCharacter is special character.");
		}

	}

}
