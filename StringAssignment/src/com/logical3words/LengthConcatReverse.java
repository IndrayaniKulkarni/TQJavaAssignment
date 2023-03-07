/**
 * 15. Length, concat, reverse w.o method
 */
package com.logical3words;

import java.util.Scanner;

public class LengthConcatReverse {

	public static int lengthArr(String s) {
		int length = 0;
		char ch[] = s.toCharArray();
		length = ch.length;
//		for(int i=0; i<ch.length; i++) {
//			length++;
//		}
		return length;
	}
	public static String concatStr(String s1, String s2) {
		char str1[] = s1.toCharArray();
		char str2[] = s2.toCharArray();
		char result[] = new char[s1.length()+s2.length()];

		int j=0;
		for(int i=0; i<str1.length; i++) {
			result[i] = str1[j++];
		}
		//System.out.println(">"+Arrays.toString(result));
		j=0;
		for(int i=str1.length;i<result.length; i++) {
			result[i] = str2[j++];
		}
		String str = new String(result);
		return str;
	}
	public static String reverseStr(String str) {
		char ch[] = str.toCharArray();
		char result[] = new char[ch.length];
		int j=0;
		for(int i=ch.length-1; i>=0; i--) {
			result[j++] = ch[i];
		}
		String answer = new String(result);
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("String = ");
		String str = sc.next();
		System.out.println("Length of string = "+lengthArr(str));
		System.out.println("String 1 = ");
		String str1 = sc.next();
		System.out.println("String 2 = ");
		String str2 = sc.next();
		System.out.println("Concat (String 1 and String 2) = "+concatStr(str1,str2));
		System.out.println("String = ");
		String str3 = sc.next();
		System.out.println("Reverse String = "+reverseStr(str3));
		sc.close();
	}

}
