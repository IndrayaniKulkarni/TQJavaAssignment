/** 
 * 14. Split the string w/o method
 */
package com.logical2;

import java.util.Arrays;
import java.util.Scanner;

public class SplitString {

	public static StringBuffer[] methodSplit(String input, char points) {
	
		char ch[] = input.toCharArray();
		
		StringBuffer str = new StringBuffer("");
		
		//count spaces 
		int spaces =1;
		for(int i=0; i<ch.length; i++) {
//			System.out.print(ch[i]+" ");
			if(ch[i]==points) {
				spaces++;
			}
		}
		System.out.println("spaces "+ spaces);
		StringBuffer arr[] = new StringBuffer[spaces];
		
		int k=0;
		for(int i=0; i<ch.length; i++) {
			for(int j=i; j<ch.length && ch[i]!=points ; j++) {
				str.append(ch[j]);
				
			}
			if(ch[i]==points) {
				arr[k] = new StringBuffer();
				arr[k++].append(str);
				System.out.print(arr[k]+" ");
			}
			if(k==spaces) {
				break;
			}
		}
		
		return arr;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input = ");
		String input = sc.nextLine();
		System.out.println("Where to split = ");
		char points = sc.next().charAt(0);
		
		StringBuffer result[] = methodSplit(input,points);
		
		System.out.println("Array of string = "+ Arrays.toString(result));
		sc.close();
		
	}

}
