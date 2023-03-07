/**
 * 17. Replace the first letter of every word with capital   
     I  love my india  : I Love My India

 */
package com.logical3words;

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceFirstLetter {

	public static String replaceLetter(String str) {
		char result[] = str.toCharArray();
		
		if (result[0] >= 'a' && result[0] <= 'z') {
			result[0] = (char) (result[0] - 32);

		}
		String str1 = new String(result);
		return str1;
	}

	public static void replaceFirstL(String line) {
		
		String convertToWords[] = line.split(" ");
//		System.out.println(Arrays.toString(convertToWords));
		String result[] = new String[convertToWords.length];
		StringBuilder ans = new StringBuilder();

		for (int i = 0; i < (convertToWords.length); i++) {
			result[i] = replaceLetter(convertToWords[i]);
			ans.append(result[i]);
			ans.append(" ");
		}

		System.out.println(Arrays.toString(result));
//		ans = ans.trim();
		System.out.println(ans);
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Sentence = ");
		
		String line = sc.nextLine();
		
//      String  line = "ten four";
		System.out.println("after replace = ");
		replaceFirstL(line);
		sc.close();
	}

}
