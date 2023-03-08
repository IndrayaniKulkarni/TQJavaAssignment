/** Count the number of lines, word, characters from a string
 * 
 */
package com.logical3words;

import java.util.Scanner;

public class CountLineWordsCharacters {

	public static int countCharacters(String str) {
	    
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==' '||str.charAt(i)=='.') {
				continue;
			}
			count++;
		}
		return count;
	}
	public static int countWords(String str) {
         int count = 1;		
         for(int i=0; i<str.length(); i++) {
        	 if(str.charAt(i)==' ') {
        		 count++;
        	 }
         }
         return count;
	}
	public static int countLines(String str) {
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='.') {
				count++;
			}
		}
		if(count==0) {
			count =1;
		}
		return count;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input = ");
		String str = sc.nextLine();
		System.out.println("No. of characters in the given text = "+countCharacters(str));
		System.out.println("No. of words in the given text = "+countWords(str));
		System.out.println("No. of lines in the given text = "+countLines(str));
		sc.close();
	}

}
