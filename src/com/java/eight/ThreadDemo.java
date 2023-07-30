package com.java.eight;

public class ThreadDemo {

	public static void display() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(() -> display());// here i am using lambda expression
		Thread t2 = new Thread(ThreadDemo::display);// here i am using method reference
		t1.start();
		t2.start();
	}

}
