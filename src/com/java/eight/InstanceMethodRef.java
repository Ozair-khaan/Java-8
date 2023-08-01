package com.java.eight;

interface B {
	public void add(int a, int b);
}

class Additionn {
	public void sum(int x, int y) {
		System.out.println("The sum is : " + (x + y));
	}
}

public class InstanceMethodRef {

	public static void main(String[] args) {

		Additionn additionn= new Additionn();
		
		B b1=(a,b)-> System.out.println("The sum of two value is : "+(a+b));
		b1.add(10, 90);////The sum of two value is : 100
		
		B b2=additionn::sum;
		b2.add(19, 11); //The sum is : 30
		
	}

}
