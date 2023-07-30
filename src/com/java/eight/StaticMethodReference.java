package com.java.eight;

interface A {
	public boolean checkSingleDigit(int x);
}

class Digit {
	public static boolean isSingleDigit(int x) {
		return x > -10 && x < 10;
	}
}

public class StaticMethodReference {

	public static void main(String[] args) {
		A a1 = (x) -> {
			return x > -10 && x < 10;
		};
		System.out.println(a1.checkSingleDigit(9));

		A a2 = Digit::isSingleDigit;
		System.out.println(a2.checkSingleDigit(9));
	}

}
