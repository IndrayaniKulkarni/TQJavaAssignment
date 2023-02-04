/*
 * 5. Write a Java program to enter radius of a circle and find its diameter, circumference and area
 *
 * Classname - CircumferenceOfCircle
 *
 * Version info.
 *
 * Date - 29 Jan., 2023
 *
 * Copyright notice 
*/
package com.assignment01_BasicArithmetics;
import java.util.Scanner;
class CircumferenceOfCircle
{
    public static void main(String args[])
    {
        float radius = 0.0f, diameter = 0.0f;
        float pi = 3.14f;
        double circumference;

        Scanner sc = new Scanner(System.in);
        System.out.println("\n Please enter radius of circle = ");
        radius = sc.nextFloat();
        sc.close();
        
        diameter = 2*radius;
        System.out.println("\n Diameter of circle = "+diameter+" units ");

        circumference = 2 * pi * radius;
        System.out.println("\n Circumference of circle = "+circumference +" units ");
    }
}