/*
 * 4. Write a Java program to enter length and breadth of a rectangle and find its area.
 *
 * Classname - AreaOfRectangle
 *
 * Version information
 *
 * Date - 29 Jan.,2023
 *
 * Copyright notice
*/
package com.assignment01_BasicArithmetics;
import java.util.Scanner;
class AreaOfRectangle
{
    public static void main(String args[])
    {
        float length = 0.0f, breadth = 0.0f;
        double area;

        Scanner sc = new Scanner(System.in);
        System.out.println("\n Please input the length and breadth = ");
        length = sc.nextFloat();
        breadth = sc.nextFloat();
        sc.close();
        
        area = length * breadth;
        System.out.println("\n Area of length and breadth = "+area + " sq units ");
    }
}