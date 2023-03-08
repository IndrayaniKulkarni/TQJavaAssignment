/** 14. Split the string w/o method
 * 
 */

package com.logical3words;

import java.util.Arrays;
import java.util.Scanner;

public class SplitMethod {

	public static String[] splitS(String s, char ch) {
		char letters[] = s.toCharArray();
//		System.out.println(Arrays.toString(letters));
		int noOfWords = 1;
		// no. of words
		for (int i = 0; i < s.length(); i++) {
			if (ch == s.charAt(i)) {
				noOfWords++;
			}
		}
		System.out.println("no of words "+noOfWords);
		// array of size no. of words
		String words[] = new String[noOfWords];

		// lets try with substring
		
		int start = 0;
	    int end = s.indexOf(ch);
	    int i = 0;

	    while (end >= 0) {
	        words[i++] = s.substring(start, end);
	        start = end + 1;
	        end = s.indexOf(ch, start);
	    }
	    words[i] = s.substring(start);

		return words;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("String =");
		String str = sc.nextLine();

		System.out.println("spilt at which place =");
		char ch = sc.nextLine().charAt(0);
//        System.out.println(" {"+ch+"}");
		String s[] = splitS(str, ch);

		System.out.println(" Words in sentences = " + Arrays.toString(s));

		sc.close();
	}
}
