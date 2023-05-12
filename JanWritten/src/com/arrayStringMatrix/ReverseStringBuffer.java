package com.arrayStringMatrix;
// 10) Reverse the original string
import java.util.Arrays;

public class ReverseStringBuffer {

//	public static void reverseString(String str) {
//		
//		char ch[] = str.toCharArray();
//		
//		for(int i=0; i<ch.length/2; i++) {
//			char temp = ch[i];
//			ch[i] = ch[ch.length-i-1];
//			ch[ch.length-i-1] = temp;
//		}
//		String ans = new String(ch);
//		System.out.println(ans);
//	}
	public static void main(String[] args) {
		 
		String str = "Reverse";
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
		
	}

}
