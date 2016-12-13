package javaPortfolio.basicJava;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Consider a staircase of size :
 * 
 *    # 
 *   ## 
 *  ### 
 * ####
 * 
 * Observe that its base and height are both equal to , and the image is drawn
 * using # symbols and spaces. The last line is not preceded by any spaces.
 * 
 * Write a program that prints a staircase of size .
 * 
 * Input Format
 * 
 * A single integer, , denoting the size of the staircase.
 * 
 * Output Format
 * 
 * Print a staircase of size using # symbols and spaces.
 * 
 * Note: The last line must have spaces in it.
 * 
 * Sample Input
 * 
 * 6 Sample Output
 * 
 *      # 
 *     ## 
 *    ### 
 *   #### 
 *  ##### 
 * ###### 
 * 
 * Explanation
 * 
 * The staircase is right-aligned, composed of # symbols and spaces, and has a
 * height and width of .
 * 
 * @author mosesmanning
 *
 */
public class Staircase {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int counter = 1;

		for (int i = 0; i < n; i++) {
			for (int var = n; var > 0; var--) {

				if (var > counter) {
					System.out.print(" ");
				}
				
				if (var <= counter) {
					System.out.print("#");
				}

			}
			System.out.println();
			counter++;
		}

	}
}
