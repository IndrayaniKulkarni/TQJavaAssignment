/**
 * 9. print next alphabet of each character
   Java - Kbwb
  03 Mar., 2023
 */
package com.logical2;

import java.util.Scanner;

public class CipherThyText {

	public static String decipher(String str, int key) {

		char letters[] = str.toCharArray();
		for (int i = 0; i < letters.length; i++) {
			if (letters[i] == ' ') {
				continue;
			}
			letters[i] = (char) ((int) letters[i] - key);
		}
		String decrypt = new String(letters);
		
		return decrypt;
	}

	public static String cipher(String str, int key) {

		char letters[] = str.toCharArray();
//		System.out.println(Arrays.toString(letters));
		for (int i = 0; i < letters.length; i++) {
			if (letters[i] == ' ') {
				continue;
			}
			letters[i] = (char) ((int) letters[i] + key);
		}
		String encrypt = new String(letters);
		return encrypt;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Kindly enter your secret text = ");
		String text = sc.nextLine();
		System.out.println("Kindly tell your key (to deflect the text) = ");
		int key = sc.nextInt();

		String encrypt = cipher(text, key);
		System.out.println("Enycrypted text =  " + encrypt);
		// System.out.println(text);

		String decrypt = decipher(encrypt, key);
		System.out.println("Decrypted text = " + decrypt);
	}

}
