package com.mario;

import java.util.*;
import java.lang.Object;
import java.util.stream.Collectors;

//this file is where i answer all the questions/complete all the tasks for the Employee assignment
public class AssignmentJava8 {

	public static void main(String[] args) {
		List<Emp> employeeList = new ArrayList<Emp>();
		employeeList.add(new Emp(111, "Mario", 21, "Male", "CS", 2021, 40000));
		employeeList.add(new Emp(112, "Bob", 40, "Male", "CS", 2010, 90375));
		employeeList.add(new Emp(113, "Chris", 22, "Male", "CS", 2018, 47500));
		employeeList.add(new Emp(114, "Emily", 34, "Female", "Mechanical", 2021, 84500));
		employeeList.add(new Emp(115, "Kyle", 25, "Male", "HR", 2020, 32500));
		employeeList.add(new Emp(116, "Erica", 30, "Female", "HR", 2015, 41500));
		employeeList.add(new Emp(117, "Miley", 29, "Female", "Accounting", 2017, 52750));
		employeeList.add(new Emp(118, "Alan", 27, "Male", "Mechanical", 2012, 64250));
		employeeList.add(new Emp(119, "Sebastian", 24, "Male", "Mechanical", 2021, 50500));
		employeeList.add(new Emp(120, "Cindy", 32, "Female", "CS", 2019, 58000));

		// i) How many male and female employees are there?
		System.out.println("Task 1: ");
		getEmpCountByGender(employeeList);
		System.out.println();

		// * ii) Find out average age of male and female employees?
		System.out.println("Task 2: ");
		getEmpAverageAge(employeeList);
		System.out.println();

		// * iii) Find the highest paid employee in this employee class?
		System.out.println("Task 3: ");
		getHighestPaid(employeeList);
		System.out.println();

		// * iv) List all the names of employees who have joined after 2016?
		System.out.println("Task 4: ");
		getEmpJoinedAfterYear(employeeList, 2016);
		System.out.println();

		// * v)Find out most senior employee in this emp class?
		System.out.println("Task 5: ");
		getMostSenior(employeeList);
		System.out.println();

		// * vi) Count the number of employees in each dept?
		System.out.println("Task 6: ");
		getEmpCountByDept(employeeList);
		System.out.println();

		// * vii) Find male and female employees in the CS dept and Mechanical dept
		System.out.println("Task 7: ");
		getEmpInDepts(employeeList, "CS");
		getEmpInDepts(employeeList, "Mechanical");
		System.out.println();

		// * viii) Find the average salary of male and female employees?
		System.out.println("Task 8: ");
		getAvgSalaryByGender(employeeList);
		System.out.println();

		// * ix) Differentiate the employess who are younger or equal to 30yrs from
		System.out.println("Task 9: ");
		getEmpByAge(employeeList, 30);
		// those employees who are older than 25 yrs?
		getEmpByAge(employeeList, 25);
		System.out.println();

		// * x)List down the names of all employees in each dept?
		System.out.println("Task 10: ");
		getEmpInAllDept(employeeList);
	}

	// * i) How many male and female employees are there?
	public static void getEmpCountByGender(List<Emp> employeeList) {
		Map<Object, Integer> m = employeeList.stream()
				.collect(Collectors.toMap(e -> e.getGender(), count -> 1, Integer::sum));

		System.out.println("Number of Male Employees: " + m.get("Male"));
		System.out.println("Number of Female Employees: " + m.get("Female"));
	}

	// * ii) Find out average age of male and female employees?
	public static void getEmpAverageAge(List<Emp> employeeList) {
		Map<String, Double> m = employeeList.stream()
				.collect(Collectors.groupingBy(Emp::getGender, Collectors.averagingDouble(Emp::getAge)));

		System.out.println("Average age of Male Employees: " + m.get("Male"));
		System.out.println("Average age of Female Employees: " + m.get("Female"));
	}

	// * iii) Find the highest paid employee in this employee class?
	public static void getHighestPaid(List<Emp> employeeList) {
		Optional<Emp> o = employeeList.stream().sorted(Comparator.comparingDouble(Emp::getSalary).reversed())
				.findFirst();
		Emp highestPaid = o.get();

		System.out.println("Highest Paid Employee is " + highestPaid.getName());
		System.out.println(highestPaid.getName() + "'s Salary: " + highestPaid.getSalary());
		System.out.println(highestPaid.getName() + "'s Department: " + highestPaid.getDepartment());
	}

	// * iv) List all the names of employees who have joined after 2016?
	public static void getEmpJoinedAfterYear(List<Emp> employeeList, int year) {
		List<String> names = new ArrayList<>();
		employeeList.stream().filter(e -> e.getYearOfJoining() >= year).forEach(e -> {
			names.add(e.getName() + " " + e.getYearOfJoining());
		});

		System.out.println("Joined after " + year + ": ");
		System.out.println(names);
	}

	// * v)Find out most senior employee in this emp class?
	public static void getMostSenior(List<Emp> employeeList) {
		Optional<Emp> o = employeeList.stream().sorted(Comparator.comparingInt(Emp::getYearOfJoining)).findFirst();
		Emp senior = o.get();

		System.out.println("Most Senior Employee is: " + senior.getName() + " joined in " + senior.getYearOfJoining());
	}

	// * vi) Count the number of employees in each dept?
	public static void getEmpCountByDept(List<Emp> employeeList) {
		Map<String, Integer> m = employeeList.stream()
				.collect(Collectors.toMap(e -> e.getDepartment(), count -> 1, Integer::sum));

		System.out.print("Number of Employees per Department: ");
		System.out.println(m);
	}

	// * vii) Find male and female employees in the CS dept and Mechanical dept
	public static void getEmpInDepts(List<Emp> employeeList, String dept) {
		List<String> names = new ArrayList<>();
		employeeList.stream().filter(e -> e.getDepartment() == dept).forEach(e -> {
			names.add(e.getName());
		});

		System.out.println("Employees in " + dept + ": ");
		System.out.println(names);
	}

	// * viii) Find the average salary of male and female employees?
	public static void getAvgSalaryByGender(List<Emp> employeeList) {
		Map<String, Double> m = employeeList.stream()
				.collect(Collectors.groupingBy(Emp::getGender, Collectors.averagingDouble(Emp::getSalary)));

		System.out.println("Average Salary of Male Employees: " + m.get("Male"));
		System.out.println("Average Salary Female Employees: " + m.get("Female"));
	}

	// * ix) Differentiate the employess who are younger or equal to 30yrs from
	public static void getEmpByAge(List<Emp> employeeList, int age) {
		List<String> names = new ArrayList<>();
		employeeList.stream().filter(e -> e.getAge() < age).forEach(e -> {
			names.add(e.getName() + " " + e.getAge());
		});

		System.out.println("Under the age of " + age + ": ");
		System.out.println(names);
	}

	// * x)List down the names of all employees in each dept?
	public static void getEmpInAllDept(List<Emp> employeeList) {
		Map<String, List<String>> m = employeeList.stream().collect(
				Collectors.groupingBy(Emp::getDepartment, Collectors.mapping(Emp::getName, Collectors.toList())));

		System.out.print("Names of Employees per Department: ");
		System.out.println(m);
	}
}