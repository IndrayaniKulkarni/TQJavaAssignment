/**
 *  10. Count the words
 */

package com.logical2;

import java.util.Scanner;

public class CountWord {

	public static void wordCount(String str) {
		char ch[] = str.toCharArray();
		int words = 1;
		for(int i=0; i<ch.length; i++) {
			if(ch[i]==' ') {
				words++;
			}
		}
		System.out.println("WordCount : "+words);
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Text = ");
		String text = sc.nextLine();
		
		System.out.println("Text = "+text);
		/* Rough work 
		 * System.out.println("Text = "+Arrays.toString(text.split("\\s")));
		//s is regular expression or whitespace
		 * let's try with out built in split
		*/
		
		if(!text.isEmpty()) {
			wordCount(text);
		}
		else
		{
			System.out.println("WordCount : 0");
		}
		
		sc.close();
	}

}
