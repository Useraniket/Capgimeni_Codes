package caseStudyRegardingStreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class driver {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "abc", 28, 123, "F", "HR", "Blore", 2020));
		empList.add(new Employee(2, "xyz", 29, 120, "F", "HR", "Hyderabad", 2015));
		empList.add(new Employee(3, "efg", 30, 115, "M", "HR", "Chennai", 2014));
		empList.add(new Employee(4, "def", 32, 125, "F", "HR", "Chennai", 2013));
		empList.add(new Employee(5, "ijk", 22, 150, "F", "IT", "Noida", 2013));
		empList.add(new Employee(6, "mno", 27, 140, "M", "IT", "Gurugram", 2017));
		empList.add(new Employee(7, "uvw", 26, 130, "F", "IT", "Pune", 2016));
		empList.add(new Employee(8, "pqr", 23, 145, "M", "IT", "Trivandam", 2015));
		empList.add(new Employee(9, "stv", 25, 160, "M", "IT", "Blore", 2010));

//		empList.forEach(System.out::println);
//
//		// Grouping by city
//		Map<String, List<Employee>> groupByCity = empList.stream().collect(Collectors.groupingBy(Employee::getCity));
//		System.out.println("\nGrouped by City:");
//		for (Map.Entry<String, List<Employee>> entry : groupByCity.entrySet()) {
//			System.out.println("City: " + entry.getKey());
//			for (Employee e : entry.getValue()) {
//				System.out.println("  " + e);
//			}
//		}
		empList.stream().map(Employee::getDeptName).distinct().forEach(System.out::println);

		empList.stream().filter(e -> e.getAge() > 28).forEach(System.out::println);

		Employee maxEmp = empList.stream().max(Comparator.comparing(Employee::getAge)).get();
		System.out.println(maxEmp);

		Optional<Employee> youngestFemale = empList.stream().filter(e -> e.getGender().equals("F"))
				.min(Comparator.comparing(Employee::getAge));

		youngestFemale.ifPresent(emp -> System.out.println("Youngest Female Employee: " + emp));

	}
}
