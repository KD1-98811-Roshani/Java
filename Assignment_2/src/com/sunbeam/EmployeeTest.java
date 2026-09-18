package com.sunbeam;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee emp1 = new Employee("Sandhya", "Mandlik", 30000);
		Employee emp2 = new Employee("Rahul", "Patil", 40000);

		System.out.println("Employee 1");
		System.out.println("First Name : " + emp1.getF_name());
		System.out.println("Last Name : " + emp1.getL_name());
		System.out.println("Monthly Salary : " + emp1.getSalary());
		System.out.println("Yearly Salary : " + emp1.getYearlySalary());

		System.out.println("\nEmployee 2");
		System.out.println("First Name : " + emp2.getF_name());
		System.out.println("Last Name : " + emp2.getL_name());
		System.out.println("Monthly Salary : " + emp2.getSalary());
		System.out.println("Yearly Salary : " + emp2.getYearlySalary());

	
		emp1.setSalary(emp1.getSalary() * 1.10);
		emp2.setSalary(emp2.getSalary() * 1.10);

		System.out.println("\nAfter 10% Raise");

		System.out.println("Employee 1 Yearly Salary : " + emp1.getYearlySalary());
		System.out.println("Employee 2 Yearly Salary : " + emp2.getYearlySalary());
	}
}