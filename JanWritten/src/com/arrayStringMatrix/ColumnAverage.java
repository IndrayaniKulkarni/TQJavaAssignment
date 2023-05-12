package com.arrayStringMatrix;

import java.util.Arrays;

/*6.	Write a program which calculates average of 
 * each column of two dimensional array.Also calculate max of all numbers.
e.g. If array is {{2,4,9,7} , {6,5,3,10} {7,3,6,4}} 
average of each column will be 
column1 =5 , column2 = 4, column3= 6, column4 = 7. Max element is 10.[

*/
public class ColumnAverage {

	public static void main(String[] args) {
		
		int matrix[][] = {{2,4,9,7} , {6,5,3,10}, {7,3,6,4}} ;
		int rows = matrix.length;
        int cols = matrix[0].length;

        int[] colSum = new int[cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                colSum[j] += matrix[i][j];
            }
        }
        //System.out.println(Arrays.toString(colSum));
		
        float[] colAvg = new float[cols];
        for (int j = 0; j < cols; j++) {
            colAvg[j] = (float) colSum[j] / rows;
            System.out.println("Column " + (j+1) + " average: " + colAvg[j]);
        }
        int max = matrix[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("Maximum element: " + max);
	}

}
