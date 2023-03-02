/**
 * 2. Count frequency of characters
 */
package com.logical;

import java.util.Scanner;

public class FrequencyOfChar {

	public static void frequencyCounter(String str) {
		// 1. convert string to char arr and then traverse through it for each char

		/*
		 * not useful as we can't mark counted char as we can't modify string for(int
		 * i=0; i<str.length(); i++) { for(int j=i+1; j<str.length();j++) {
		 * if(str.charAt(i)==str.charAt(j)) {
		 * 
		 * } } }
		 */

		char ch[] = str.toCharArray();
		int count = 0;
		System.out.println("Frequency of characters = ");
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '\0') {
				continue;
			}
			count = 1;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					ch[j] = '\0';
					count++;
				}
			}
			System.out.print(ch[i] + " : " + count);
			System.out.println();
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("String = ");
		String str = sc.next();

		frequencyCounter(str);
		sc.close();
	}

}
