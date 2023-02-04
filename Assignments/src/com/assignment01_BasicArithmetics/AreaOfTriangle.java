/*
 * 13. Write a Java program to enter base and height of a triangle and find its area.
 *
 * Classname - AreaOfTriangle
 *
 * Version info.
 *
 * Date - 29 jan., 2023
 *
 * Copyright notice
 */
package com.assignment01_BasicArithmetics;
import java.util.Scanner;
class AreaOfTriangle
{
    public static void main(String args[])
    {
        float base = 0.0f, height = 0.0f;
        double area = 0.0;

        Scanner sc = new Scanner(System.in);
        System.out.println("\n Do enter the base and height of the triangle = ");
        base = sc.nextFloat();
        height = sc.nextFloat();
        sc.close();

        //area = 1/2 * base * height;
        area = (0.5) * base * height;
        System.out.println("\n Area of given triangle = " + area + " sq. units ");
        
    }
}