/*
 * 14. WAP to check whether Unchecked Exception is propagated in calling stack
 */
package com.exercise02;

public class Q14UncheckedException {

	public static void methodC(int data) throws Exception{
		data = data/0;
	}
	public static void methodB(int data) throws Exception{
		methodC(data);
	}
	public static void methodA(int data) throws Exception{
		methodB(data);
	}
	public static void main(String[] args) {
		
		try {
			methodA(10);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
