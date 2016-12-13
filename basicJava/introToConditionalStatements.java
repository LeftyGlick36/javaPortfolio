package javaPortfolio.BasicJava;

import java.util.Scanner;

/**
 * Objective In this challenge, we're getting started with conditional
 * statements. Check out the Tutorial tab for learning materials and an
 * instructional video!
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
public class introToConditionalStatements {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		String ans = "";

		// if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
		if (n % 2 == 1) {
			ans = "Weird";
		} else if((n%2 == 0) && (n>=2 && n<=5)){
			// Complete the code
			ans = "Not Weird";
		}else if((n%2 == 0) && (n>=6 && n<=20)){
			// Complete the code
			ans = "Weird";
		}else if(n>20){
			ans = "Not Weird";
		}
		System.out.println(ans);
	}
}
