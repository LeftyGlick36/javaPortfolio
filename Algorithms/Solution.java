package javaPortfolio.Algorithms;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        int count = 0;
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        Arrays.sort(height);
        int max = height[n-1];
        
        for (int i = 0; i < n; i++) {
			if (height[i]==max) {
				count++;
			}
		}
        System.out.println(count);
    }
}
