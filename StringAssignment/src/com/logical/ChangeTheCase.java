/** 6. Change the case of all the character
     
     JaVa- jAvA
     03 mar., 2023
*/

package com.logical;

import java.util.Scanner;

public class ChangeTheCase {

	public static void changeCase(String str) {
		
		char ch[] = str.toCharArray();
		// 65 - 90 - A to Z
		//97 - 122 - a to z
		for(int i=0; i<ch.length; i++) {
			if(ch[i]>=65 && ch[i]<=90) {
				ch[i] = (char) ((int)ch[i] + 32);
			}
			else if(ch[i]>=97 && ch[i]<=122) {
				ch[i] = (char) ((int)ch[i] - 32);
			}
		}
		String result = new String(ch);
		System.out.println("Change case = "+result);
		
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("String = ");
		String str = sc.next();
		
		changeCase(str);
		sc.close();
	}

}
