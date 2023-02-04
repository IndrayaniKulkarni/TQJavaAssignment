/*
 * 14. Write a Java program to calculate area of an equilateral triangle.
 *
 * Classname - AreaOfEquilateral
 *
 * Version info.
 *
 * Date - 29 Jan., 2023
 *
 * Copyright notice
 */
package com.assignment01_BasicArithmetics;
import java.util.Scanner;
class AreaOfEquilateral
{
    public static void main(String args[])
    {
        float side = 0.0f;
        double area;

        Scanner sc = new Scanner(System.in);
        System.out.println("\n Please enter side of the equilateral triangle = ");
        side = sc.nextFloat();
        sc.close();
        
        // area of equi. triangle = (sqrt(3)/4)*(side)*(side)
        area = (Math.sqrt(3)/4)*(side)*(side);
        System.out.println("\n Area of the equilateral triangle = "+ area + " sq. units ");
        
    }
}