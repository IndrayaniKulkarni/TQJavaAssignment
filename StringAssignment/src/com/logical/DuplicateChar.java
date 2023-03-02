/**
 * 3. Duplicate characters(Print and count) 
 */
package com.logical;

import java.util.Scanner;

public class DuplicateChar {

	public static void duplicate(String input) {
		char ch[] = input.toCharArray();
	    int count = 0;
	    for(int i=0;i<ch.length; i++) {
	    	count = 1;
	    	if(ch[i]=='\0') {
	    		continue;
	    	}
	    	for(int j=i+1; j<ch.length; j++) {
	    		if(ch[i]==ch[j]) {
	    			count++;
	    			ch[j]='\0';
	    		}
	    	}
	    	if(count>1) {
	    		System.out.print(ch[i]+" : "+count);
	    		System.out.println();
	    	}
	    }
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("String - ");
		String input = sc.next();
		
		duplicate(input);
		sc.close();
	}

}
