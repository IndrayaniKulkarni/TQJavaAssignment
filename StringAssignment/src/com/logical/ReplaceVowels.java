package com.logical;

import java.util.Scanner;

public class ReplaceVowels {

	public static void replaceV(String str) {
		
		// 1. we can convert string to arr and then check for vowel and then replace
		// 2. directly use of replace method 
		str = str.toLowerCase();
		char ch[] = str.toCharArray();
		
		for(int i=0; i<ch.length; i++) {
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				ch[i]='@';//special symbol
			}
		}
		String str2 = new String(ch);
		System.out.println("After replace with array method = "+str2);
	}
	public static void replaceBuiltIn(String str) {
		
		str = str.replace('a', '@');
		str = str.replace('e', '@');
		str = str.replace('i', '@');
		str = str.replace('o', '@');
		str = str.replace('u', '@');
		
		System.out.println("After replace with built in method = "+str);
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("String = ");
		String str = sc.next();
		
//		replaceV(str);
		replaceBuiltIn(str);
		sc.close();
	}

}
