package javaPortfolio;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class SolutionOne {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String w = in.next();
		// # Print 'Yes' if the word is beautiful or 'No' if it is not.
		String[] arr = w.split("(?!^)");
		boolean fact = false;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i].equals(arr[i + 1])) {
				System.out.println("No");
				fact = true;
				break;
			} else if ((arr[i].equals("a")|| arr[i].equals("e")|| arr[i].equals("i") || arr[i].equals("o") || arr[i].equals("u") || arr[i].equals("y")) && ((arr[i+1].equals("a")|| arr[i+1].equals("e")|| arr[i+1].equals("i") || arr[i+1].equals("o") || arr[i+1].equals("u") || arr[i+1].equals("y")))) {
				System.out.println("No");
				fact = true;
				break;
			} else if ((fact != true) && (i == arr.length - 2)) {
				System.out.println("Yes");

			}
		}

	}
}
