/** 12. Unique words
 * 
 */
package com.logical2;

import java.util.Scanner;

public class UniqueWords {

	public static void uniqueCount(String words[]) {
		int count = 0;
		System.out.println("Unique words = ");
		for(int i = 0; i<words.length; i++) {
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
			if(count==1) {
				System.out.print(words[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input = ");
		String line = sc.nextLine();
		
		line = line.toLowerCase();
		
		String words[] = line.split(" ");
		
		uniqueCount(words);
		sc.close();
	}

}
