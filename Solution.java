package javaPortfolio;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long[] arr = new long[5];
		long min = 0;
		long max = 0;

		long a = in.nextLong();
		arr[0] = a;
		long b = in.nextLong();
		arr[1] = b;
		long c = in.nextLong();
		arr[2] = c;
		long d = in.nextLong();
		arr[3] = d;
		long e = in.nextLong();
		arr[4] = e;

		Arrays.sort(arr);

		for (int i = 0; i < arr.length - 1; i++) {
			min += arr[i];
		}
		for (int i = 1; i < arr.length; i++) {
			max += arr[i];
		}

		System.out.println(min + " " + max);

	}

}
