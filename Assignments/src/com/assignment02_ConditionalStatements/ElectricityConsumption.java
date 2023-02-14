/*
 * 3. Write a Java program to input electricity consumption unit and 
 * calculate total electricity bill according to the given condition: 
 For first 50 units Rs. 0.50/unit
 For next 100 units Rs. 0.75/unit 
 For next 100 units Rs. 1.20/unit 
 For unit above 250 Rs. 1.50/unit 
 An additional surcharge of 20% is added to the bill
 */
package com.assignment02_ConditionalStatements;

import java.util.Scanner;

public class ElectricityConsumption {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nElectricity consumption unit = ");
		float units = sc.nextFloat();
		double bill = 0.0;
		float rate =0.0f;
		if(units<50)
		{
			bill = units * 0.50;
			rate = 0.50f;
		}
		else if(units<150)
		{
			bill = 50 * 0.50 + (units-50) * 0.75;
			rate = 0.75f;
		}
		else if(units<250)
		{
			bill = (50 * 0.05)+ (150 * 0.75) + (units-200) * 1.20;
			rate = 1.20f;
		}
		else if(units>=250)
		{
			bill = (50 * 0.05)+ (150 * 0.75) + (50 * 1.20) + (units-250)* 1.50;
			rate = 1.50f;
		}
		bill = bill+(bill)*0.20f;
		System.out.println("Units-----------Rate");
		System.out.println("050            Rs.0.05");
		System.out.println("150            Rs.0.75");
		System.out.println("250            Rs.1.20");
		System.out.println("Electricity consumption(in units)------Amount(RS)");
		System.out.print("\t\t"+units+"\t\t\t"+(float)bill);
		sc.close();

	}

}
