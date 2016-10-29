package javaPortfolio;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int answer = 0;
		int prime = 0;
		int second = 0;
		int pi1 = 0;
		int si1 = 0;
		
		int n = in.nextInt();
		int a[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = in.nextInt();
				
				if(i==j){
				pi1 += a[i][j];
				}
				
				if((j==(n-1)&&i==0)||i==(n-1)&&j==0){
				si1 += a[i][j];
				}
				if((i!=(n-1) && j!=(n-1) && (i!=0 && j!=0)) && i==j){
					si1 += a[i][j];
				}
			}
		}
		prime = pi1;
		second = si1;

		answer = Math.abs(prime - second);
		System.out.println(answer);
	}
}
