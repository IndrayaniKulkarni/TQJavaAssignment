/* WAP which throws ArrayIndexOutBoundsException.
 *  In the console, observe the stack trace and the 
line number from where the Exception is thrown */
package com.exercise01;

public class Q1array {

	public static void main(String[] args) {
		
		int num[] = new int[] {1,2,3,4,5};
		
		try{
			for(int i=0; i<=num.length; i++) {
			System.out.print(num[i]+" ");
		}
			throw new ArrayIndexOutOfBoundsException();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		/*without try and catch
		 * Exception in thread "main" 
		 * java.lang.ArrayIndexOutOfBoundsException: 
		 * Index 5 out of bounds for length 5
		 * at ExceptionHandlingAssignment/com.exercise01.Q1array.main(Q1array.java:13)
		 */
		
		/* Stack trace - 
		 *  java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
	at ExceptionHandlingAssignment/com.exercise01.Q1array.main(Q1array.java:14)
		 */
	}

}
