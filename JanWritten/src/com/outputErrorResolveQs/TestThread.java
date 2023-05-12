package com.outputErrorResolveQs;

public class TestThread extends Thread {

	public static void main(String args[]) {

		Thread t = new TestThread();
		System.out.println("Before starting thread");
		t.start();

		System.out.println("After starting thread");

	}

}
