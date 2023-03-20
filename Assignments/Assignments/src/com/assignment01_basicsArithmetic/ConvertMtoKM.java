/*
 * 6. Write a Java program to enter length in centimeter and convert it into meter and kilometer
 *
 * Classname - ConvertMtoKM
 *
 * Version info
 *
 * Date - 29 Jan., 2023
 *
 * Copyright notice
*/
package com.assignment01_basicsArithmetic;
import java.util.Scanner;
class ConvertMtoKM
{
    public static void main(String args[])
    {
        float lengthInCM = 0.0f;
        double meter, kilometer;

        Scanner sc = new Scanner(System.in);
        System.out.println("\n Please enter length in centimeter (cm) = ");
        lengthInCM = sc.nextFloat();
        sc.close();

        meter = 0.01 * lengthInCM; // 1cm = 100m  // 1m = 0.10cm
        kilometer =  0.001 * meter; // 1km = 1000m // 1m = 0.001km

        System.out.println(" "+ lengthInCM + " cm = " + meter + " m ." );
        System.out.println(" "+ lengthInCM + " cm = " + kilometer + " km ." );
        
    }

}