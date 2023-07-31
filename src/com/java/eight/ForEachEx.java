package com.java.eight;

import java.util.ArrayList;
import java.util.List;

class Employee {
	private String name;
	private int empId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public Employee(String name, int empId) {
		super();
		this.name = name;
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + "]";
	}

}

public class ForEachEx {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("Anand", 11));
		list.add(new Employee("Azeem", 12));
		list.add(new Employee("Suresh", 13));
		list.add(new Employee("Tim", 15));

		// without using forEach
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Emp name is : " + list.get(i).getName() + " and Id is : " + list.get(i).getEmpId());
		}

		// Using forEach
		list.forEach((e) -> System.out.println("Employee name is : " + e.getName() + " and Id is : " + e.getEmpId()));

		System.out.println("Removed object which predicate is S : "+list.removeIf(p->p.getName().startsWith("S")));
		System.out.println(list);
		
	}

}
