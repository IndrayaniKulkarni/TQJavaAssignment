package com.logical;

import java.util.Scanner;

public class UniqueChar {

	public static void unique(String s) {
		char ch[] = s.toCharArray();
		int count =0;
		System.out.println("Unique elements = ");
		for(int i=0; i<ch.length; i++) {
			count=1;
			for(int j=i+1; j<ch.length; j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j]='\0';
				}
			}
			if(count==1) {
				System.out.println(ch[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("String =");
		String s = sc.next();
		
		unique(s);
		
		sc.close();
	}

}
