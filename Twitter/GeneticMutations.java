package javaPortfolio.Twitter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import javaPortfolio.BasicJava.introToConditionalStatements;

/**
 * An organism's DNA is responsible for how it looks, how it behaves as well as
 * its physiology. Figuring out how genes mutate can help us understand alien
 * evolution as well as treat earthly diseases better. It's the year 2056 &
 * you've obtained a motherload of sequenced genetic material from a research
 * laboratory on Mars. Interesting relationships can be found by studying how
 * genetic sequences are related to one another through mutations.
 * 
 * Your task is to write a method - findMutationDistance that takes in this
 * genetic data bank as a large collection of sequences (bank) and the 2
 * sequences (start & end) whose mutations distance needs to be calculated. This
 * method should return the shortest mutation distance between the two sequences
 * - start and end. If, for whatever reason such a mutation is not possible, the
 * method should return -1.
 * 
 * Constraints
 * 
 * 1. Martian biological material contains genetic sequences that are all 8
 * characters in length. The only allowed characters in the sequence are the 4
 * nucleotide bases of a DNA strand - Adenine, Cytosine, Guanine & Thymine,
 * represented by the letters 'A', 'C', 'T' & 'G'. For eg, 'AATIGGCC' represents
 * a possible genetic sequence in the data bank.
 * 
 * 2. For a sequence to be a part of the mutation distance, it must contain all
 * but 1 of the nucleotide bases as its preceding sequence in the same order AND
 * be present in the bank of valid sequences. For eg. 'AATIGGCC' -> 'AATIGGCA'
 * can be considered a valid mutation if 'AATIGGCA' is present in the bank.
 * Another example of a valid mutation can be 'AATIGGCC' -> 'TATIGGCC' -> 'I 11
 * I GGCC' -> 'I I 11 GGCA' if 'TATIGGCC', 'TTTTGGCC' & 'TTTTGGCA' are present
 * in the bank of valid genetic sequences. In this example, the mutation
 * distance is 3, as it took 3 mutations to go from 'AATIGGCC' to 'TTTTGGCA'.
 * 
 * 3. You can assume that the bank will contain unique sequences, and the start
 * sequence may or may not be a part of the bank.
 * 
 * @author mosesmanning
 *
 */
public class GeneticMutations {
	public static String start;
	public static String end;
	public static String[] bank;

	public GeneticMutations(String starter, String ender, String[] banker) {
		String end = ender;
		String start = starter;
		String[] bank = banker;

	}

	public static void main(String[] args) {
		/**
		 * Takes in genetic data bank as a large collection
		 * 
		 * @param start
		 * @param end
		 * @param bank
		 * @return
		 */
		findMutationDistance(start, end, bank);
	}

	static int findMutationDistance(String start, String end, String[] bank) {
		Scanner in = new Scanner(System.in);
		bank = new String[6];
		
		while (in.hasNextLine()!=false) {
			for (int i = 0; i < bank.length; i++) {
				bank[i] = in.nextLine();
			}
		}
		System.out.println(bank.toString());
		return 0;

	}

}
