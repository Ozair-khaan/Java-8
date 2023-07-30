package com.java.eight;

public class IntroImpl {
	public static void main(String[] args) {
		Intro intro1 = (intro)->{
			String str1= "Myself ";
			String str2= str1 + intro;
			return str2;
		};
		System.out.println(intro1.introd("Ozair Khan"));
	}
}
