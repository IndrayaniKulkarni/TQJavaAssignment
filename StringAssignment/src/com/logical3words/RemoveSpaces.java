package com.logical3words;

import java.util.Scanner;

public class RemoveSpaces {

	public static String trimString(String str) {
		
		char ch [] = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<ch.length; i++) {
			if(ch[i]==' ') {
				continue;
			}
			sb.append(ch[i]);
		}
		
		String result = new String(sb);
		
		return result;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input = ");
		String str = sc.nextLine();
		String ans = trimString(str);
		System.out.println("After removing spaces in string = "+ans);
		sc.close();
	}

}
