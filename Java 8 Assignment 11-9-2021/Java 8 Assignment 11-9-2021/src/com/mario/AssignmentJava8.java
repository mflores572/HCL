package com.mario;

import java.util.*;
import java.util.stream.Stream;

public class AssignmentJava8 {

	public static void main(String[] args) {
		List<Emp> employeeList = new ArrayList<Emp>();
		employeeList.add(new Emp(111, "Mario", 21, "Male", "CS", 2021, 40000));
		employeeList.add(new Emp(112, "Bob", 40, "Male", "CS", 2010, 90250));
		employeeList.add(new Emp(113, "Chris", 22, "Male", "CS", 2018, 47500));
		employeeList.add(new Emp(114, "Emily", 24, "Female", "Mechanical", 2021, 50500));
		employeeList.add(new Emp(115, "Kyle", 25, "Male", "HR", 2020, 32500));
		employeeList.add(new Emp(116, "Erica", 30, "Female", "HR", 2015, 41500));
		employeeList.add(new Emp(117, "Miley", 29, "Female", "Accounting", 2017, 42750));
		employeeList.add(new Emp(118, "Alan", 25, "Male", "Mechanical", 2012, 64250));
		employeeList.add(new Emp(119, "Sebastian", 34, "Male", "Mechanical", 2021, 84500));
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
		GetMostSenior(employeeList);
		System.out.println();

		// * vi) Count the number of employees in each dept?
		System.out.println("Task 6: ");
		getEmpCountByDept(employeeList);
		System.out.println();

		// * vii) Find male and female employees are there in the CS dept and Mechanical
		// dept?
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
		int femaleCount = 0;
		int maleCount = 0;

		for (int i = 0; i < employeeList.size(); i++) {
			if (employeeList.get(i).getGender() == "Male")
				maleCount++;
			else if (employeeList.get(i).getGender() == "Female")
				femaleCount++;

		}
		System.out.println("Number of Male Employees: " + maleCount);
		System.out.println("Number of Female Employees: " + femaleCount);

	}

	// * ii) Find out average age of male and female employees?
	public static void getEmpAverageAge(List<Emp> employeeList) {
		int femaleCount = 0;
		int femaleAge = 0;
		int maleCount = 0;
		int maleAge = 0;

		for (int i = 0; i < employeeList.size(); i++) {
			if (employeeList.get(i).getGender() == "Male") {
				maleCount++;
				maleAge += employeeList.get(i).getAge();
			} else if (employeeList.get(i).getGender() == "Female") {
				femaleCount++;
				femaleAge += employeeList.get(i).getAge();
			}
		}
		System.out.println("Average age of Male Employees: " + (double) maleAge / maleCount);
		System.out.println("Average age Female Employees: " + (double) femaleAge / femaleCount);
	}

	// * iii) Find the highest paid employee in this employee class?
	public static void getHighestPaid(List<Emp> employeeList) {
		Stream<Emp> s = employeeList.stream().sorted(Comparator.comparingDouble(Emp::getSalary).reversed());
		Emp highestPaid = s.findFirst().get();

		System.out.println("Highest Paid Employee: ");
		System.out.println("Name: " + highestPaid.getName());
		System.out.println("Salary: " + highestPaid.getSalary());
		System.out.println("Gender: " + highestPaid.getGender());
		System.out.println("Department: " + highestPaid.getDepartment());
		System.out.println("Join Year: " + highestPaid.getYearOfJoining());
		System.out.println("ID: " + highestPaid.getId());
		System.out.println("Age: " + highestPaid.getAge());
	}

	// * iv) List all the names of employees who have joined after 2016?
	public static void getEmpJoinedAfterYear(List<Emp> employeeList, int year) {
		List<String> names = new ArrayList<>();
		for (int i = 0; i < employeeList.size(); i++) {
			if (employeeList.get(i).getYearOfJoining() >= year)
				names.add(employeeList.get(i).getName());
		}

		System.out.println("Joined after " + year + ": ");
		System.out.println(names);
	}

	// * v)Find out most senior employee in this emp class?
	public static void GetMostSenior(List<Emp> employeeList) {
		Stream<Emp> s = employeeList.stream().sorted(Comparator.comparingInt(Emp::getYearOfJoining));
		Emp senior = s.findFirst().get();
		System.out.print("Most Senior Employee: ");
		System.out.println(senior.getName());
	}

	// * vi) Count the number of employees in each dept?
	public static void getEmpCountByDept(List<Emp> employeeList) {
		Map<String, Integer> m = new HashMap<>();
		for (int i = 0; i < employeeList.size(); i++) {
			Integer count = m.get(employeeList.get(i).getDepartment());
			if (count == null)
				m.put(employeeList.get(i).getDepartment(), 1);
			else
				m.put(employeeList.get(i).getDepartment(), count + 1);
		}
		System.out.print("Number of Employees per Dept: ");
		System.out.println(m);

	}

	// * vii) Find male and female employees are there in the CS dept and Mechanical
	// dept
	public static void getEmpInDepts(List<Emp> employeeList, String dept) {
		List<String> names = new ArrayList<>();
		for (int i = 0; i < employeeList.size(); i++) {
			if (employeeList.get(i).getDepartment() == dept)
				names.add(employeeList.get(i).getName());
		}

		System.out.println("Employees in " + dept + ": ");
		System.out.println(names);
	}

	// * viii) Find the average salary of male and female employees?
	public static void getAvgSalaryByGender(List<Emp> employeeList) {
		int femaleCount = 0;
		int femaleSalary = 0;
		int maleCount = 0;
		int maleSalary = 0;

		for (int i = 0; i < employeeList.size(); i++) {
			if (employeeList.get(i).getGender() == "Male") {
				maleCount++;
				maleSalary += employeeList.get(i).getSalary();
			} else if (employeeList.get(i).getGender() == "Female") {
				femaleCount++;
				femaleSalary += employeeList.get(i).getSalary();
			}
		}
		System.out.println("Average Salary of Male Employees: " + (double) maleSalary / maleCount);
		System.out.println("Average Salary Female Employees: " + (double) femaleSalary / femaleCount);
	}

	// * ix) Differentiate the employess who are younger or equal to 30yrs from
	public static void getEmpByAge(List<Emp> employeeList, int age) {
		List<String> names = new ArrayList<>();
		for (int i = 0; i < employeeList.size(); i++) {
			if (employeeList.get(i).getAge() <= age)
				names.add(employeeList.get(i).getName() + " " + employeeList.get(i).getAge());
		}

		System.out.println("Under the age of " + age + ": ");
		System.out.println(names);
	}

	// * x)List down the names of all employees in each dept?
	public static void getEmpInAllDept(List<Emp> employeeList) {
		Map<String, List<String>> m = new HashMap<>();
		for (int i = 0; i < employeeList.size(); i++) {
			if (m.containsKey(employeeList.get(i).getDepartment()) == false) {
				m.put(employeeList.get(i).getDepartment(), new ArrayList<>());
			}
			m.get(employeeList.get(i).getDepartment()).add(employeeList.get(i).getName());

		}
		System.out.print("Employee Names by Dept: ");
		System.out.println(m);
	}
}
