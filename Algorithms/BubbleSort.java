package javaPortfolio.Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	static int[] array = { 2, 4, 6, 8, 3 };

	/**
	 * 5 2 4 6 8 3
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		bubbleSortArray(array);

	}

	public static void bubbleSortArray(int[] ar) {
		// Fill up this function

		Scanner scan = new Scanner(System.in);
		int n = 0;

		if (scan.hasNextLine() != false) {
			if (scan.hasNextInt()) {
				n = scan.nextInt();
			}

			if (scan.hasNextInt()) {
				ar = new int[n];
				for (int i = 0; i < n; i++) {
					ar[i] = scan.nextInt();
				}
			}
		}

		int temp;
		for (int i = 0; i < ar.length - 1; i++) {
			for (int j = 0; j <= ar.length - 2; j++) {
				if (ar[j] > ar[j + 1]) {
					temp = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(ar));
	}

}
