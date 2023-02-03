/*
 * 9. Write a Java program to convert days into years, weeks and days.
 *
 * Classname - ConvertDays
 *
 * Version info.
 *
 * Date - 29 Jan., 2023; 30 Jan.,2023
 *
 * Copyright notice 
 */
 
 //util , lang are packages 
import java.util.Scanner;
import java.lang.Math;
class ConvertDays
{
    public static void main(String args[])
    {
        int days = 0;
        int weeks = 0;
        int year = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number of days = ");
        days = sc.nextInt();
        sc.close();
        
        // 1 day = 24 hrs
        // 1 week = 24 * 7 
        // 1 year = 24 * 52 ??

        // week = 7 days 
        // year = 52 or 53 weeks (depending upon leap year or not)


        weeks = Math.round(days/7);
        year = Math.round(days/365) ; //assuming the year is not leap year

        System.out.println("\n "+ days + " day/s = "+ weeks + " week/s and "+ (days%7) + " days.");
        System.out.println("\n "+ days + " day/s = "+ year + " year/s and "+ (days%365) + " days.");
        System.out.println("\n\n * Assuming year is not leap year.");
		
		// need to convert days into year, week and days
		
		year = Math.round(days/365);
		days = days%365;
		weeks = Math.round(days/7);
		days = days%7;
		
		System.out.println("\n Year, Week, Days = " + year + " year/s "  + weeks + " week/s " + days + " day/s");
		
    }
}
