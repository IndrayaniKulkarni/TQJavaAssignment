/** 
 * 13. Frequency of words
 */
package com.logical2;

import java.util.Scanner;

public class FrequencyOfWords {

	public static void freqWords(String words[]) {
		int count = 0;
		for(int i=0; i<words.length; i++) {
			count = 1;
			if(words[i]=="\0") {
				continue;
			}
			for(int j=i+1; j<words.length; j++) {
				if(words[i].equals(words[j])) {
					count++;
					words[j] = "\0";
				}
			}
			if(count>0) {
				System.out.print(words[i]+" : "+count);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input = ");
		String sentence = sc.nextLine();
		
		//to lower
		sentence = sentence.toLowerCase();
		
		String words[] = sentence.split(" ");
		
		freqWords(words);
		
		sc.close();
	}

}
