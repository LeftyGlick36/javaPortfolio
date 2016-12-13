package javaPortfolio.Algorithms;

public class ReversedLinkedList {

	/*
	 * Insert Node at the end of a linked list head pointer input could be NULL
	 * as well for empty list Node is defined as
	 */
	class Node {
		int data;
		Node next;
	}

	void ReversePrint(Node head) {
		// This is a "method-only" submission.
		// You only need to complete this method.
		Node prev = null;
		Node current = head;
		Node next = null;

		/**
		 * prev[]-> head[]-> tail[]->
		 */

		while (current.next != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current=next;
		}
		head = prev;
System.out.println(head.toString());
	}

}
