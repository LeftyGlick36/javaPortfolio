package javaPortfolio.WeekOfCode27;

import java.util.Scanner;

/**
 * our submission will run against only preliminary test cases. Full test cases
 * will run at the end of the day. Brie’s Drawing teacher asks her class to open
 * their -page book to page number . Brie can either start turning pages from
 * the front of the book (i.e., page number ) or from the back of the book
 * (i.e., page number ), and she always turns pages one-by-one (as opposed to
 * skipping through multiple pages at once). When she opens the book, page is
 * always on the right side:
 * 
 * image
 * 
 * Each page in the book has two sides, front and back, except for the last page
 * which may only have a front side depending on the total number of pages of
 * the book (see the Explanation sections below for additional diagrams).
 * 
 * Given and , find and print the minimum number of pages Brie must turn in
 * order to arrive at page .
 * 
 * Input Format
 * 
 * The first line contains an integer, , denoting the number of pages in the
 * book. The second line contains an integer, , denoting the page that Brie's
 * teacher wants her to turn to.
 * 
 * 
 * @author mosesmanning
 *
 */
public class DrawingBook {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int p = in.nextInt();
		// your code goes here
		int frontCount = 0;
		int backCount = 0;

		int start = 1;
		int page = p;
		int end = n;
		int answer;

		// Starting page
		for (; start <= page; start++) {
			// If not equal on odd page counting up increase count
			if (start == page) {
				break;
			} else if (start % 2 == 1) {
				frontCount++;
			}

		}

		// Ending page
		for (; end >= page; end--) {
			// If n is even and page counting down increase count
			if (n % 2 == 0) {
				if (end % 2 == 1) {
					backCount++;
				}
			}
			if (n % 2 == 1) {
				if (end - 1 % 2 == 1) {
					backCount++;
				}
			}
		}

		if (frontCount < backCount) {
			answer = frontCount;
		} else {
			answer = backCount;
		}
		System.out.println(answer);

	}

}
