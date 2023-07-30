package com.java.eight;

public class LambdaExp {
	public static void main(String[] args) {

		Drawable d = (name) -> {
			return "Hello," + name;
		};
		System.out.print(d.draw("Ozair,"));
		
		Drawable d2 = (lastname)->{
			return " and your last name is : "+lastname;
		};
		System.out.print(d2.draw("Khan"));
	}
}
