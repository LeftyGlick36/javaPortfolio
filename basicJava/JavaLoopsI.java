package javaPortfolio.BasicJava;

import java.util.Scanner;

/**
 * 
 * Submissions Leaderboard Discussions Editorial Objective In this challenge,
 * we're going to use loops to help us do some simple math.
 * 
 * Task Given an integer, , print its first multiples. Each multiple (where )
 * should be printed on a new line in the form: N x i = result.
 * 
 * Input Format
 * 
 * A single integer, .
 * 
 * Constraints
 * 
 * Output Format
 * 
 * Print lines of output; each line (where ) contains the of in the form: N x i
 * = result.
 * 
 * Sample Input
 * 
 * 2 Sample Output
 * 
 * 2 x 1 = 2 2 x 2 = 4 2 x 3 = 6 2 x 4 = 8 2 x 5 = 10 2 x 6 = 12 2 x 7 = 14 2 x
 * 8 = 16 2 x 9 = 18 2 x 10 = 20
 * 
 * @author mosesmanning
 *
 */
public class JavaLoopsI {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			int j = i * x;
			System.out.println("" + x + " x " + i + " = " + j);
		}

	}
}
