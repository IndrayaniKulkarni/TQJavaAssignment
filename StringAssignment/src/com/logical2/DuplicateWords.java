/** 
 * 11. Duplicate words
 */
package com.logical2;

import java.util.Scanner;

public class DuplicateWords {

	public static void whosDuplicate(String words[]) {
		System.out.println("Duplicate words = ");
		int count = 0;
		for(int i=0; i<words.length; i++) {
			count = 1;
			if(words[i]=="\0") {
				continue;
			}
			for(int j=i+1; j<words.length; j++) {
				// here you were checking equality with == which checks ref. 
				// are refering to same obj
				// but we need to check equality of value
				if(words[i].equals(words[j])) {
					count++;
					words[j] = "\0";
				}
			}
			if(count>1) {
				System.out.print(words[i]+" ");
			}
		}
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Line = ");
		String line = sc.nextLine();
		
		line = line.toLowerCase();
		String words[] = line.split(" ");
		
		whosDuplicate(words);
		
		sc.close();
	}

}
