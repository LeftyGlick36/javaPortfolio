package javaPortfolio.Booking;

import java.util.Scanner;

public class DestinationTogether {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] num = new int[3];
		long answer = 0;

		if (in.hasNextInt() != false) {
			for (int i = 0; i < num.length; i++) {
				num[i] = in.nextInt();
			}
		}
		int n = num[0];
		int m = num[1];
		int c = num[2];
		long collective = n + m - c;

		System.out.println(calc(collective - 1));

	}

	public static long calc(long poss) {
		long ans = 1;
		while (poss > 1) {
			ans *= poss;
			poss--;
		}
		return ans;

	}

}
