/*
 * 16. Write a Java program to enter P, T, R and calculate Simple Interest.
 * 17. Write a Java program to enter P, T, R and calculate Compound Interest
 * 
 * Classname - FindInterest
 * 
 * Version info.
 *
 * Date - 29 Jan., 2023
 *
 * Copyright notice
 */
package com.assignment01_BasicArithmetics;
import java.util.Scanner;
class FindInterest
{
    public static void main(String args[])
    {
        float P, R, N = 0.0f;
        double CompoundInterest, SimpleInterest = 0.0f;

        Scanner sc = new Scanner(System.in);
        System.out.println("\n Please enter the following data...");
        System.out.println("\n Principal amount = Rs.");
        P = sc.nextFloat();
        System.out.println("\n Rate of interest = ");
        R = sc.nextFloat();
        System.out.println("\n Time period (in year)= ");
        N = sc.nextFloat();
        

        //S.I
        SimpleInterest = (P*R*N)/100;
        System.out.println("\n Simple interest for given date = Rs." + SimpleInterest);
        System.out.println("\n Total amount  = Rs." + (P + SimpleInterest));

        //C.I
        float T = 0.0f;
        System.out.println("\n Please enter the following data...");
        System.out.println("\n Principal amount = Rs.");
        P = sc.nextFloat();
        System.out.println("\n Rate of interest = ");
        R = sc.nextFloat();
        // System.out.println("\n Number of times interest applied per time period = ");
        // N = sc.nextFloat();
        System.out.println("\n Number of time periods elapsed (in year) = ");
        T = sc.nextFloat();
        sc.close();
        
        // NEED TO DO CALCULATIONS AGAIN WITH PRECISION
        // changes done
        double amountCI = P * Math.pow((1+(R/100)),(T));
        CompoundInterest = amountCI - P;
        System.out.println("\n  Compound Interest = Rs." + CompoundInterest);
        System.out.println("\n Total amount  = Rs." + amountCI);

    }
}