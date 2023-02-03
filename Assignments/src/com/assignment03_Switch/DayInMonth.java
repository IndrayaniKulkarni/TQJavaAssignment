/*
 * 1. Write a Java program print total number of days in a month using switch case 
 * 
 * Date - 03 Feb.,2023
 */
package com.assignment03_Switch;

import java.util.Scanner;

public class DayInMonth {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("\nPlease enter the month (keep first letter capitial) =");
		String month = sc.next();

		switch (month) {
		case "Janunary":
		case "March":
		case "May":
		case "July":
		case "August":
		case "December":
			System.out.println(" 31 days in the month.");
			break;

		case "April":
		case "June":
		case "September":
		case "Octoberr":
		case "November":
			System.out.println(" 30 days in the month.");
			break;

		case "February":
			System.out.println("\nPlease enter the year = ");
			int year = sc.nextInt();
//			boolean flag = false;
			int flag=0;
			if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
				flag = 1;
			} else {
				flag = 0;
			}
			//switch value type can't be boolean
			switch(flag)
			{
			case 1: System.out.println(" 29 days in the month.");break;
			case 0:System.out.println(" 28 days in the month.");break;
			}
			break;
			
			default: System.out.println("\nKindly check something went wrong...");

		}
		sc.close();

	}

}