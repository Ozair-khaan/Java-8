package com.java.eight;

import java.util.Arrays;
import java.util.List;

/**
 * @author Ozair Khan
 *
 */
public class PrintingEvenUsingLambda {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		numbers.stream().filter(i -> i % 2 == 0).forEach(num -> System.out.println("Even Numbers : " + num));

	}

}
