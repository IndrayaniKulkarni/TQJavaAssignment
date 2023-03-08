/**
 * 20.Split the string in equal parts
 */
package com.logical3words;

import java.util.Arrays;
import java.util.Scanner;

public class DivideString {

	public static void divideStr(String word, int parts) {
		
		int length = word.length();
		String result[] = new String[parts];
		if(length%parts!=0) {
			System.out.println("String can't be divided..");
		}
		else {
			int index = 0;
			int n = length/parts;
			for(int i=0; i<word.length(); i+=n) {
				result[index] = word.substring(i,i+n);
				index++;
			}
			System.out.println("String = "+Arrays.toString(result));
		}
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("String = ");
		String word = sc.next();
		System.out.println("divide into =");
		int parts = sc.nextInt();
		divideStr(word,parts);
		sc.close();
	}

}
