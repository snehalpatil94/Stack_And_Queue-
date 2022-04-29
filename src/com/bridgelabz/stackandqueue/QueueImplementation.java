package com.bridgelabz.stackandqueue;

import java.util.Scanner;

/**
 * Queue display and insert methods
 * 
 * @author : Snehal Patil 
 */
public class QueueImplementation {
	Node top;

	// Operation menu to take user choice of operation
	public void operationsMenu() {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;

		do {
			System.out.println("Operations menu : ");
			System.out.println("1. To display \n2. To insert Element \n3. To exit");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Display queue elements : ");
				display();
				System.out.println("------------------------------------------------------\n");
				break;
			case 2:
				System.out.println("Enter element to insert into the queue : ");
				int element = sc.nextInt();
				enQueue(element);
				System.out.println("------------------------------------------------------\n");
				break;
			default:
				flag = false;
				System.out.println("Thank you !");
				System.out.println("------------------------------------------------------\n");
				break;
			}
		} while (flag);
	}

	Node front = null;
	Node rear = null;

	// Display method
	public void display() {
		if (front == null)
			System.out.println("Queue is empty");
		else {
			Node temp = front;
			while (temp.next != null) {
				System.out.print(temp.data + "  ");
				temp = temp.next;
			}
			System.out.print(temp.data + "  ");
			System.out.println();
		}
	}

	// Inserting element method
	public void enQueue(int item) {
		Node node = new Node();
		node.data = item;
		if (front == null) {
			front = rear = node;
		} else {
			rear.next = node;
			rear = node;
		}
	}
}