/**1. Check string in palindrome
 * 
 */
package com.logical;

import java.util.Scanner;

public class Palindrome {

	public static void checkPalindrome(String s1) {

		// 1. create another string append one char by one and compare
		// 2. compare first and last char till middle
		boolean flag = false;
		int i = 0;
//		System.out.println(s1.length());
//		System.out.println(" "+s1.charAt(i)+" : "+ s1.charAt(s1.length()-i-1));
		for (i = 0; i < s1.length() / 2; i++) {
//			System.out.println(" "+s1.charAt(i)+" : "+ s1.charAt(s1.length()-i));
			if (s1.charAt(i) == s1.charAt(s1.length() - i - 1)) {
				flag = true;
			} else {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println(s1 + " is palindrome.");
		} else {
			System.out.println(s1 + " is not palindrome.");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("String = ");
		String s1 = sc.next();

		checkPalindrome(s1);

		sc.close();
	}

}
