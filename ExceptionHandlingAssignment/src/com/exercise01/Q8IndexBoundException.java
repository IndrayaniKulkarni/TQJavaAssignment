/*
 * WAP to show the scenario in which IndexOutBound Exception (Both ArrayInexOutOfBound and 
StringIndexOutOfBound) exception is generated and handle this exception.

 */
package com.exercise01;

public class Q8IndexBoundException {

	public static void main(String[] args) {
		String str2 = new String("language");
		try {
//			String str[] = {"java", "c", "python", "ruby"};
//			str[5]="c#";
			char str[] = str2.toCharArray();
			for(int i=0; i<=str.length;i++) {
				System.out.println(str[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		try {
			System.out.println(str2.substring(20));
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}

}
