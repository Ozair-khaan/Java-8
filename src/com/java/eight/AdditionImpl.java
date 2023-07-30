package com.java.eight;

public class AdditionImpl {
public static void main(String[] args) {
	Addition obj = (int a,int b)->{
		return (a+b);
	};
		System.out.println("--Addition of two numbers is "+obj.add(10, 20));
}
}
