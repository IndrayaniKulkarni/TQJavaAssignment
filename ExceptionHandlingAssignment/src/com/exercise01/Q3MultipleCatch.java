/*
 * 3. WAP to catch multiple exceptions. i.e ArrayIndexOutOfBoundsException 
 * and ArithmeticException

 */
package com.exercise01;

public class Q3MultipleCatch {

	public static void main(String[] args) {
		
		try {
			int arr[] = new int[]{0,1,2,3,4};
			arr[5]=10;
			int ans = arr[1]/0;
			System.out.println(ans);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException : "+e);
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException : "+e);
		}
		catch(Exception e) {
			System.out.println("Exception : "+e);
		}
	}

}
