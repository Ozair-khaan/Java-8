package com.java.eight;

import java.time.LocalDateTime;
import java.util.Optional;

/**
 * @author Ozair Khan
 *
 */
public class OptionalDemo {

	public static Optional<String> m1() {
		System.out.println("Package Demo class m1 method ");
		return Optional.ofNullable(null);
	}

	public static void main(String[] args) {

		String m2 = m1().orElseGet(() -> "Value from orElseGet");
		System.out.println(m2);

		LocalDateTime ldt = LocalDateTime.of(2021, 12, 23, 10, 00, 00);
		System.out.println(ldt);

	}

}
