package javaPortfolio.BasicJava;

import java.util.Scanner;

/**
 * Objective Today, we're learning and practicing an algorithmic concept called
 * Recursion. Check out the Tutorial tab for learning materials and an
 * instructional video!
 * 
 * Recursive Method for Calculating Factorial Task Write a factorial function
 * that takes a positive integer, as a parameter and prints the result of (
 * factorial).
 * 
 * Note: If you fail to use recursion or fail to name your recursive function
 * factorial or Factorial, you will get a score of .
 * 
 * Input Format
 * 
 * A single integer, (the argument to pass to factorial).
 * 
 * Constraints
 * 
 * Your submission must contain a recursive function named factorial. Output
 * Format
 * 
 * Print a single integer denoting .
 * 
 * Sample Input
 * 
 * 3 Sample Output
 * 
 * 6 Explanation
 * 
 * Consider the following steps:
 * 
 * From steps and , we can say ; then when we apply the value from to step , we
 * get . Thus, we print as our answer.
 * 
 * @author mosesmanning
 *
 */
public class Day9Recursion {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		factorial(n);

	}

	private static void factorial(int x) {
		// TODO Auto-generated method stub
		int answer = 1;
		while (x != 1) {
			answer *= x;
			x--;
		}
		System.out.println(answer);
	}
}
