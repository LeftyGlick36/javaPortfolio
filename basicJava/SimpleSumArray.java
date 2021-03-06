package javaPortfolio.BasicJava;

import java.util.Scanner;

/**
 * Given an array of integers, can you find the sum of its elements?
 * 
 * Input Format
 * 
 * The first line contains an integer, , denoting the size of the array. The
 * second line contains space-separated integers representing the array's
 * elements.
 * 
 * Output Format
 * 
 * Print the sum of the array's elements as a single integer.
 * 
 * Sample Input
 * 6 1 2 3 4 10 11 Sample 
 * 
 * Output
 * 31 Explanation
 * 
 * We print the sum of the array's elements, which is:
 * @author mosesmanning
 */
public class SimpleSumArray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = (int) in.nextInt();
		int x = 0;
		int arr[] = new int[size];

		for (int j = 0; j < size; j++) {
			arr[j] = in.nextInt();
		}
		for (int i = 0; i < size; i++) {
			x += arr[i];
		}

		System.out.println(x);
	}
	
	
}
