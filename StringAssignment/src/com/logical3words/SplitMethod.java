/** 14. Split the string w/o method
 * 
 */

package com.logical3words;

import java.util.Arrays;
import java.util.Scanner;

public class SplitMethod {

	public static String[] splitS(String s, char ch) {
		char letters[] = s.toCharArray();
		int noOfWords = 0;
		// no. of words
		for(int i=0; i<s.length(); i++) {
			if(ch==s.charAt(i)) {
				noOfWords++;
			}
		}
		// array of size no. of words
		String words[] = new String[noOfWords+1];
		
		// lets try with substring
    /* 	int index =0;
		int k=0;
		for(int j=0; j<s.length(); j++) {
			if(s.charAt(j)==ch) {
				words[k++]=s.substring(index,j);
				System.out.println(" > "+s.substring(index,j));
			}
			index++;	
		} */
//		System.out.println(Arrays.toString(words));
		int k;
		for(int i=0; i<letters.length; i++) {
			if(letters[i]==ch) {
				k=i;
			}
			String a = new String();
		}
		return words;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("String =");
		String str = sc.nextLine();
		
		System.out.println("spilt at which place =");
		char ch = sc.next().charAt(0);
		
		String s[] = splitS(str,ch);
		
		System.out.println(" >"+Arrays.toString(s));
		
		sc.close();
	}
}
