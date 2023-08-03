package com.java.eight;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortedEx {

	public static void main(String[] args) {

		List<String> companies = Arrays.asList("Infosys", "Capgemini", "Hexaware", "LTI", "Accenture", "Cognizant");
		System.out.println("Before operation : " + companies);

		List<String> sortedList = companies.stream().sorted().collect(Collectors.toList());
		System.out.println("After operation : " + companies);
		System.out.println(sortedList);

		// Descending order
		System.out.println("Reverse order with Collections.riverseOrder() method");
		List<String> sortedList1 = companies.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortedList1);
		System.out.println("Reverse order with Comparator");
		List<String> sortedList2 = companies.stream().sorted((p1, p2) -> p2.compareTo(p1)).collect(Collectors.toList());
		System.out.println(sortedList2);
		

	}

}
