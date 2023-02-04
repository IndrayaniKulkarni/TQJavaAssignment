/*
 * 12. Write a Java program to enter two angles of a triangle and find the third angle.
 *
 * Classname - FindAngleOfTriangle
 *
 * Version info.
 *
 * Date - 29 jan., 2023
 *
 * Copyright notice
 */
package com.assignment01_BasicArithmetics;
import java.util.Scanner;
class FindAngleOfTriangle
{
    public static void main(String args[])
    {
        float angleA = 0.0f, angleB = 0.0f, angleC = 0.0f;

        Scanner sc = new Scanner(System.in);
        System.out.println("\n Kindly enter (2) angle of triangle in degree = ");
        angleA = sc.nextFloat();
        angleB = sc.nextFloat();
        sc.close();

        //sum of angles of triangle = 180 degrees
        angleC = 180 - (angleA + angleB);
        System.out.println("\n Third angle of the given triangle = " + angleC + " degree.");

    }
}