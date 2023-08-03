package com.java.eight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CaseUpperLower {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("tata");
		list.add("birla");
		list.add("adani");
		list.add("wipro");
		list.add("britania");

		List<String> upperCase = list.stream().map(value -> value.toUpperCase()).collect(Collectors.toList());
		System.out.println("Upper Case : " + upperCase);

		List<String> list1 = new ArrayList<String>();

		list1.add("New york");
		list1.add("Los Angelas");
		list1.add("New Jersey");
		list1.add("Delhi");
		list1.add("Kolkata");

		List<String> toLowerCase = list1.stream().map(val -> val.toLowerCase()).collect(Collectors.toList());
		System.out.println("Lower Case : " + toLowerCase);

	}

}
