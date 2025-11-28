package com.mphasis.MavenProj6;

import java.util.Scanner;

public class Mystack {

	private static Node top = null;

	public static boolean isEmpty() {
		return top == null;
	}

	public static Node createNode() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert a data");
		int data = sc.nextInt();
		return new Node(data);
	}

	public static void push() {
		Node newNode = createNode();
		if (top == null)
			top = newNode;
		else {
			newNode.setNext(top);
			top = newNode;

		}
		System.out.println("node with " + newNode.getData() + " inserted into stack Successfully");
	}

	public static void pop() {
		if (isEmpty())
			System.out.println("stack underflow");
		else {
			System.out.println(top.getData() + " is popped");
			Node temp = top;
			
			top = top.getNext();
			temp.setNext(null);
		}
	}

	public static void display() {
		if (isEmpty())
			System.out.println("no stack exists");
		else {
			Node temp = top;
			while (temp!= null) {
				System.out.println(temp.getData());
			    temp = temp.getNext();
			}
		}
	}
}
