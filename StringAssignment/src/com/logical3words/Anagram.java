/**
 * 16.Anagram 
 * 
 */
package com.logical3words;

import java.util.Scanner;

public class Anagram {

	public static char[] sortChars(char ch[]) {
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] > ch[j]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		return ch;
	}

	public static boolean isEqual(char ch1[], char ch2[]) {
//		boolean status = true;
		ch1 = sortChars(ch1);
		ch2 = sortChars(ch2);

		for (int i = 0; i < ch1.length; i++) {
			if (ch1[i] != ch2[i]) {
				return false;
			}
		}
		return true;
	}

	public static boolean isAnagram(String str1, String str2) {
		// word is anangram if
		// 1. there length are equal
		// 2. both string have same characters
		boolean flag = false;

		if (str1.length() == str2.length()) {
			char ch1[] = str1.toCharArray();
			char ch2[] = str2.toCharArray();
			if (isEqual(ch1, ch2)) {
				flag = true;
			}
		}
		return flag;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Any word = ");
		String word = sc.next();
		System.out.println("Another one please = ");
		String word2 = sc.next();
		System.out.println(isAnagram(word, word2) ? " anangram..." : " not an anagram..");
		sc.close();
	}

}
