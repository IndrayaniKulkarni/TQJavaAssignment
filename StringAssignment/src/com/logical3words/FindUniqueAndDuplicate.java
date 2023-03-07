/**
 * 
 * 21. String str1={"mamta@gmail.com", "pratik@gmail.com","vivek@gmail.com"}
 *     String str2={"pratik@gmail.com","vivek@gmail.com","priya@gmail.com","bhushan@gmail.com"}
 *     result: unique elements of str2, duplicate elements
 */
package com.logical3words;

public class FindUniqueAndDuplicate {

public static void unique2(String str1[], String str2[]) {
		
		int count = 0;
		System.out.print("[ ");
		for(int i=0; i<str2.length; i++) {
			count = 1;
			if(str2[i].equals("\0")) {
				continue;
			}
			for(int j=0; j<str1.length; j++) {
				if(str2[i].equals(str1[j])) {
					count++;
					str1[i]="\0";
					str2[j]="\0";
				}
			}
			if(count==1) {
				System.out.print(str2[i]+" ");
			}
		}
		System.out.print("]");
	
	}
	public static void unique(String str1[], String str2[]) {
		
		int count = 0;
		System.out.print("[ ");
		for(int i=0; i<str1.length; i++) {
			count = 1;
			if(str1[i].equals("\0")) {
				continue;
			}
			for(int j=0; j<str2.length; j++) {
				if(str1[i].equals(str2[j])) {
					count++;
					str1[i]="\0";
					str2[j]="\0";
				}
			}
			if(count==1) {
				System.out.print(str1[i]+" ");
			}
		}
		System.out.print("]");
	
	}
	public static void duplicate(String str1[], String str2[]) {
		System.out.print("[ ");
		for(int i=0; i<str2.length; i++) {
			for(int j=0; j<str1.length; j++) {
				if(str2[i].equals(str1[j])) {
					System.out.print(str2[i]+" ");
				}
			}

		}
		System.out.print("]");

	}
	
	public static void main(String[] args) {
		String str1[]={"mamta@gmail.com", "pratik@gmail.com","vivek@gmail.com"};
		String str2[]={"pratik@gmail.com","vivek@gmail.com","priya@gmail.com","bhushan@gmail.com"};
		
		System.out.println("\nUnique string in str1 = ");
		unique(str1,str2);
		System.out.println("\nUnique string in str2 = ");
		unique2(str1,str2);
		String s1[]={"mamta@gmail.com", "pratik@gmail.com","vivek@gmail.com"};
	    String s2[]={"pratik@gmail.com","vivek@gmail.com","priya@gmail.com","bhushan@gmail.com"};
		System.out.println("\nDuplicate strings = ");
		duplicate(s1,s2);
	}

}
