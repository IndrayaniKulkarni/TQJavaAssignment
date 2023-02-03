/*
 * 15. Write a Java program to enter marks of five subjects and calculate total, average and percentage.
 *
 * Classname - MarksOfStudent
 *
 * Version info.
 * 
 * Date - 29 jan., 2023
 *
 * Copyright notice
 */
import java.util.Scanner;
class MarksOfStudent
{
    public static void main(String args[])
    {

        float marks1, marks2, marks3, marks4, marks5 = 0.f;
        double tot, avg, per;

        Scanner sc = new Scanner(System.in);
        System.out.println("\n Please enter marks(out of 100) of 5 subjects = ");
        marks1 = sc.nextFloat();
        marks2 = sc.nextFloat();
        marks3 = sc.nextFloat();
        marks4 = sc.nextFloat();
        marks5 = sc.nextFloat();
        sc.close();

        tot = marks1 + marks2 + marks3 + marks4 + marks5;
        avg = tot/5;
        per = tot/5;

        System.out.println("\n Total of given marks = " + tot);
        System.out.println("\n Average of given marks = " + avg);
        System.out.println("\n Percentage of given marks = " + per + " %");
        
        // Otherway
        /*
        int numberOfSubject ;

        Scanner sc = new Scanner(System.in);
        System.out.println("\n Please number of subjects = ");
        numberOfSubject = sc.nextInt();

        float marks[] = new float[numberOfSubject];

        
        System.out.println("\n Please enter marks(out of 100) of subjects = ");
        for(int i=0; i<numberOfSubject; i++)
        {
            marks[i] = sc.nextFloat();
        }
        sc.close();
        
        double tot = 0;
        
        for(int i=0; i<numberOfSubject; i++)
        {
            tot += marks[i];
        }

        double avg = tot/numberOfSubject;
        double per = tot/numberOfSubject;
        System.out.println("\n Total of given marks = " + tot);
        System.out.println("\n Average of given marks = " + avg);
        System.out.println("\n Percentage of given marks = " + per + " %");
        */

    }
}