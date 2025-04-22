package streamAPI;

import java.util.*;

public class operation {
	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();
		l1 = Arrays.asList("Apple", "Bannana", "Orange", "dog", "cat", "Aniket");

		List<String> rem = l1.stream().map(String::toUpperCase).toList();
		System.out.println(rem);

		Optional<String> rem2 = l1.stream().filter(s -> s.charAt(0) == 'A').findFirst();

		rem2.ifPresent(System.out::println);

	}
}
