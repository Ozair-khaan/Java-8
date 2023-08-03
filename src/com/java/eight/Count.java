package com.java.eight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Employee1 {
	int empId;
	String empName;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Employee1(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}

}

public class Count {

	public static void main(String[] args) {
		/*
		 * List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); long
		 * count = numbers.stream().count();
		 */

		List<Employee1> list = new ArrayList<Employee1>();
		list.add(new Employee1(101, "Kamran"));
		list.add(new Employee1(102, "Vicky"));
		list.add(new Employee1(103, "Tom"));
		list.add(new Employee1(104, "Jack"));

		Predicate<Employee1> predicate = (p) -> {
			//System.out.println("Hi");
			if (p.getEmpName().startsWith("K"))
				return true;
			else
				return false;
		};
		System.out.println(list.stream().filter(predicate).count());

		// list.stream().filter(p)->p.get

	}

}
