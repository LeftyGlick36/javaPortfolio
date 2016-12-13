package javaPortfolio.DataStructures;

import java.util.Scanner;

///**
// * Context 
//Given a  2D Array, :
//
//1 1 1 0 0 0
//0 1 0 0 0 0
//1 1 1 0 0 0
//0 0 0 0 0 0
//0 0 0 0 0 0
//0 0 0 0 0 0
//We define an hourglass in  to be a subset of values with indices falling in this pattern in 's graphical representation:
//
//a b c
//  d
//e f g
//There are  hourglasses in , and an hourglass sum is the sum of an hourglass' values.
//
//Task 
//Calculate the hourglass sum for every hourglass in , then print the maximum hourglass sum.
//
//Note: If you have already solved the Java domain's Java 2D Array challenge, you may wish to skip this challenge.
//
//Input Format
//
//There are  lines of input, where each line contains  space-separated integers describing 2D Array ; every value in  will be in the inclusive range of  to .
//
//Constraints
//
//Output Format
//
//Print the largest (maximum) hourglass sum found in .
//
//Sample Input
//
//1 1 1 0 0 0
//0 1 0 0 0 0
//1 1 1 0 0 0
//0 0 2 4 4 0
//0 0 0 2 0 0
//0 0 1 2 4 0
//Sample Output
//
//19
//Explanation
//
// contains the following hourglasses:
//
//1 1 1   1 1 0   1 0 0   0 0 0
//  1       0       0       0
//1 1 1   1 1 0   1 0 0   0 0 0
//
//0 1 0   1 0 0   0 0 0   0 0 0
//  1       1       0       0
//0 0 2   0 2 4   2 4 4   4 4 0
//
//1 1 1   1 1 0   1 0 0   0 0 0
//  0       2       4       4
//0 0 0   0 0 2   0 2 0   2 0 0
//
//0 0 2   0 2 4   2 4 4   4 4 0
//  0       0       2       0
//0 0 1   0 1 2   1 2 4   2 4 0
//The hourglass with the maximum sum () is:
//
//2 4 4
//  2
//1 2 4
// * @author mosesmanning
// *
// */
public class TwoDArrayDS {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[][] = new int[6][6];
		for (int row = 0; row < 6; row++) {
			for (int col = 0; col < 6; col++) {
				arr[row][col] = in.nextInt();
			}
		}

		int sum = 0;
		int newSum = -1000;
		for (int sRow = 1; sRow < arr.length - 1; sRow++) {
			for (int sCol = 1; sCol < arr.length - 1; sCol++) {
				sum = arr[sRow][sCol]

						+ arr[sRow - 1][sCol - 1] + arr[sRow - 1][sCol] + arr[sRow - 1][sCol + 1]
						+ arr[sRow + 1][sCol - 1] + arr[sRow + 1][sCol] + arr[sRow + 1][sCol + 1];

				if (sum > newSum) {
					newSum = sum;
					sum = 0;
				}
				sum = 0;
			}
		}
		System.out.println(newSum);

	}

}
