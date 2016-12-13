package javaPortfolio.BasicJava;

import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Given an array of integers, calculate which fraction of its elements are
 * positive, which fraction of its elements are negative, and which fraction of
 * its elements are zeroes, respectively. Print the decimal value of each
 * fraction on a new line.
 * 
 * Note: This challenge introduces precision problems. The test cases are scaled
 * to six decimal places, though answers with absolute error of up to are
 * acceptable.
 * 
 * Input Format
 * 
 * The first line contains an integer, , denoting the size of the array. The
 * second line contains space-separated integers describing an array of numbers.
 * 
 * Output Format
 * 
 * You must print the following lines:
 * 
 * A decimal representing of the fraction of positive numbers in the array. A
 * decimal representing of the fraction of negative numbers in the array. A
 * decimal representing of the fraction of zeroes in the array. Sample Input
 * 
 * 6 -4 3 -9 0 4 1 Sample Output
 * 
 * 0.500000 0.333333 0.166667 Explanation
 * 
 * There are positive numbers, negative numbers, and zero in the array. The
 * respective fractions of positive numbers, negative numbers and zeroes are ,
 * and , respectively.
 * 
 * @author mosesmanning
 *
 */

public class PlusMinus {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		double pos = 0.0;
		double neg = 0.0;
		double zip = 0.0;
		int arr[] = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				pos++;
			}
			if (arr[i] < 0) {
				neg++;
			}
			if (arr[i] == 0) {
				zip++;
			}
		}
		System.out.println(pos / n);
		System.out.println(neg / n);
		System.out.println(zip / n);
	}
}
