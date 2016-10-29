package javaPortfolio;

import java.util.Scanner;

/**
 * In this challenge, we test your knowledge of using if-else conditional
 * statements to automate decision-making processes. An if-else statement has
 * the following logical flow:
 * 
 * Task Given an integer, , perform the following conditional actions:
 * 
 * If is odd, print Weird If is even and in the inclusive range of to , print
 * Not Weird If is even and in the inclusive range of to , print Weird If is
 * even and greater than , print Not Weird Complete the stub code provided in
 * your editor to print whether or not is weird.
 * 
 * Input Format
 * 
 * A single line containing a positive integer, .
 * 
 * Constraints
 * 
 * Output Format
 * 
 * Print Weird if the number is weird; otherwise, print Not Weird.
 * 
 * Sample Input 0
 * 
 * 3 Sample Output 0
 * 
 * Weird Sample Input 1
 * 
 * 24 Sample Output 1
 * 
 * Not Weird Explanation
 * 
 * Sample Case 0: is odd and odd numbers are weird, so we print Weird.
 * 
 * Sample Case 1: and is even, so it isn't weird. Thus, we print Not Weird.
 * 
 * @author mosesmanning
 *
 */
public class JavaIfElse {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String ans = "";
		if (n >= 2 && n <= 5) {
			ans = "Not Weird";

		}
		if (n >= 6 && n <= 20) {
			ans = "Weird";

		}

		if (n > 20) {
			ans = "Not Weird";
			// Complete the code

		}
		if (n % 2 == 1) {
			ans = "Weird";
		}
		System.out.println(ans);

	}
}
