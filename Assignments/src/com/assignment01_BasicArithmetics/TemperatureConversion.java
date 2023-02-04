/*
 * 7. Write a Java program to enter temperature in °Celsius and convert it into °Fahrenheit.
 * 8. Write a Java program to enter temperature in Fahrenheit(°F) and convert it into Celsius(°C)
 *
 * Classname - TemperatureConversion
 *
 * Version info
 * 
 * Date - 29 Jan., 2023
 *
 * Copyright notice
 */
package com.assignment01_BasicArithmetics;
import java.util.Scanner;
class TemperatureConversion
{
    public static void main(String args[])
    {
        double celsius = 0.0;
        double fahrenheit = 0.0;

        Scanner sc = new Scanner(System.in);
        System.out.println("\n Please enter temperature in °Celsius = ");
        celsius = sc.nextFloat();
       

        // 0°C = 32°F
        // 0°C * (9/5) + 32 = 32°F
        // 9/5 = 1.8
        // to avoid lossy conversion Fartenheit defined as double rather than float
        
        fahrenheit = (celsius*(1.8)) + 32;
        System.out.println("\n "+ celsius + " °C = " + fahrenheit + " F");
        
        System.out.println("\n Please enter temperature in Fartenheit = ");
        fahrenheit = sc.nextFloat();
        sc.close();

        //5/9 = 0.55  (recurring)
        celsius = (fahrenheit - 32) * + (0.55);
        System.out.println("\n "+ fahrenheit + " F = " + celsius + " °C");

    }
}