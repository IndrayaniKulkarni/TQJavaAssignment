package com.outputErrorResolveQs;

import java.util.PriorityQueue;

public class GuessOutputQueue {

	public static void main(String[] args) {
		PriorityQueue queue = new PriorityQueue();

		queue.add("Java");

		queue.add("Spring");

		queue.add("Angular");

		queue.add("Hibernate");

		queue.add("JavaScript");

		queue.add("Android");

//		System.out.println("\n" + queue);
		queue.peek(); //Retrieves, but does not remove, the head of this queue,or returns null if this queue is empty.

		queue.poll();//Retrieves and removes the head of this queue,or returns null if this queue is empty.

		queue.poll();

		queue.peek();

		System.out.println("\n" + queue);

	}
}
