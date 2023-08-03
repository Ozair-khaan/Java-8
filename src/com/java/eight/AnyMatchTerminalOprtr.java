package com.java.eight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class AnyMatchTerminalOprtr {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("IBM");
		list.add("Capgeimini");
		list.add("NSE");
		list.add("BSE");

		Stream<String> stream = list.stream();
		boolean anyMatch = stream.anyMatch((value) -> {
			return value.endsWith("E");
		});

		System.out.println(anyMatch);
	}

}
