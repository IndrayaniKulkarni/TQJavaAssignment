/**
 * 5) Diamond number pattern with star border 
* 
*1* 
*121* 
*12321* 
*1234321* 
*123454321* 
*1234321* 
*12321* 
*121* 
*1*

 */
package com.assignment05_Patterns;

import java.util.Scanner;

public class DiamondNumStarB {

	public static void main(String[] args) {
		
       Scanner sc = new Scanner(System.in);
       
       int n = sc.nextInt();
       
       //first half triangle
       for(int i=1;i<=n; i++) {
    	   
    	   System.out.print("*");
    	   for(int j=1; j<=i; j++) {
    		   System.out.print(j);
    	   }
    	   for(int j=i-1; j>1; j--) {
    		   System.out.print(j);
    	   }
    	   System.out.print("*");
    	   System.out.println();
       }
       //last half triangle
       for(int i=n-1;i>=1; i--) {
    	   
    	   System.out.print("*");
    	   for(int j=1; j<=i; j++) {
    		   System.out.print(j);
    	   }
    	   for(int j=i-1; j>=1; j--) {
    		   System.out.print(j);
    	   }
    	   System.out.print("*");
    	   System.out.println();
       }
       
       sc.close();
       
	}

}
