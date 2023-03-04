/**
 * 7. Change the case of the vowels
 * 03 Mar.,2023
 */

package com.logical2;

import java.util.Scanner;

public class ChangeCaseOfVowel {

	public static boolean isVowel(char ch) {
		if(ch == 'a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			return true;
		}
		else {
			return false;
		}
	}
	public static void changeCase(String str) {
		str = str.toLowerCase();
		char ch[] = str.toCharArray();
		
		for(int i=0; i<ch.length; i++) {
			if(isVowel(ch[i])) {
				if(ch[i]>=97 && ch[i]<=122) {
					ch[i] = (char)((int)ch[i] - 32);
				}
			}
		}
		String result = new String(ch);
		System.out.println("Changed case of vowels in given string = "+result);
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Input String = ");
		String s = sc.next();
		
		changeCase(s);
		
		sc.close();
	}

}
