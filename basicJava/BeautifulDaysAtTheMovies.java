package javaPortfolio.basicJava;

import java.time.format.ResolverStyle;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;
import javax.print.attribute.standard.NumberUpSupported;

/**
 * Lily likes to play games with integers and their reversals. For some integer
 * , we define to be the reversal of all digits in . For example, , , and .
 * 
 * Logan wants to go to the movies with Lily on some day satisfying , but he
 * knows she only goes to the movies on days she considers to be beautiful. Lily
 * considers a day to be beautiful if the absolute value of the difference
 * between and is evenly divisible by .
 * 
 * Given , , and , count and print the number of beautiful days when Logan and
 * Lily can go to the movies.
 * 
 * Input Format
 * 
 * A single line of three space-separated integers describing the respective
 * values of , , and .
 * 
 * Constraints
 * 
 * Output Format
 * 
 * Print the number of beautiful days in the inclusive range between and .
 * 
 * Sample Input
 * 
 * 20 23 6 Sample Output
 * 
 * 2 Explanation
 * 
 * Logan wants to go to the movies on days , , , and . We perform the following
 * calculations to determine which days are beautiful:
 * 
 * Day is beautiful because the following evaluates to a whole number: Day is
 * not beautiful because the following doesn't evaluate to a whole number: Day
 * is beautiful because the following evaluates to a whole number: Day is not
 * beautiful because the following doesn't evaluate to a whole number: Only two
 * days, and , in this interval are beautiful. Thus, we print as our answer.
 * 
 * @author mosesmanning
 *
 */
public class BeautifulDaysAtTheMovies {

	private static long y = 6;
	private static int count = 0;
	private static long x = 0;
	private static Scanner in;
	private static String input;

	public static void main(String[] args) {
		in = new Scanner(System.in);

		while (in.hasNextInt()) {
			x = in.nextInt();
			reverse(x);
			beautiful(x, reverse(x), y);
			if (in.hasNextInt() == false) {
				break;
			}
		}

		printCount(count);

	}

	private static void printCount(int count2) {

		System.out.println(count);

	}

	private static void beautiful(long x, long reverse, long y) {
		double ans = ((double) x - (double) reverse) / (double) y;
		Math.abs(ans);
		if ((ans % 1) == 0) {
			count++;
		}

	}

	private static long reverse(long x) {
		String reversedString = "";
		String answer = "";

		reversedString = Long.toString(x);

		for (int i = reversedString.length() - 1; i >= 0; i--) {
			answer += reversedString.charAt(i);
		}
		y = Integer.parseInt(answer);
		return y;
	}

}
