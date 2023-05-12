package com.outputErrorResolveQs;

/*
 * 10. WAP to print following series [2M]

592
-322
590
-320
588
-318

 */
public class PrintSeries {

	public static void main(String[] args) {

		int num1 = 592;
		int num2 = -322;
		
		for(int i=0; i<3; i++) {
			System.out.println(num1);
			System.out.println(num2);
			num1 -=2;
			num2 +=2;
		}
	}

}
