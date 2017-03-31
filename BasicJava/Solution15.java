package javaPortfolio.BasicJava;

import java.util.Scanner;

import org.junit.experimental.theories.Theories;

public class Solution15 {
	public static Node insert(Node head, int data) {
		// Create new Node
		Node temp = new Node(data);
		// Assign head to temp
		temp.next = head.next;

		// If temp.next == null
		if (head.next == null) {
			// Assign head to temp
			temp.next = head.next;
			// Assign temp.next == null
		}
		return temp;
		// Complete this method

	}

	public static void display(Node head) {
		Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Node head = null;
		int N = sc.nextInt();

		while (N-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		display(head);
		sc.close();
	}
}