package com.java.eight;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo {
public static void main(String[] args) {
	List<String> list = new ArrayList<String>();
	list.add("Ozair");
	list.add("Omair");
	list.add("Zaid");
	
	list.forEach(
			(n)->System.out.println("Iterating elements : "+n)
			);
}
}
