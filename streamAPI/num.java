package streamAPI;

import java.util.*;

public class num {
	public static void main(String[] args) {

		List<Integer> l1 = Arrays.asList(7, 2, 3, 9, 0, 6, 1, 2, 4, 8);
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		for (Integer i : l1) {
//			if (i % 2 == 0) {
//				arr.add(i);
//			}
		System.out.println("Original list:" + l1);
		// 1. Even numbers
        List<Integer> evens = l1.stream().filter(num -> num % 2 == 0).toList();
        System.out.println("Even numbers: " + evens);

        // 2. Map: Multiply by 2
        List<Integer> res = l1.stream().map(i -> i * 2).toList();
        System.out.println("Mapped elements (*2): " + res);

        // 3. Skip first 2 elements
        List<Integer> res2 = l1.stream().skip(2).toList();
        System.out.println("Skipped first 2: " + res2);

        // 4. Limit to first 2 elements
        List<Integer> res3 = l1.stream().limit(2).toList();
        System.out.println("Limit 2 elements: " + res3);

        // 5. Sorted
        List<Integer> res4 = l1.stream().sorted().toList();
        System.out.println("Sorted: " + res4);

        // 6. Reverse sorted
        List<Integer> res5 = l1.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("Sorted descending: " + res5);

        // 7. Remove duplicates
        List<Integer> res6 = l1.stream().distinct().toList();
        System.out.println("Distinct: " + res6);

        // 8. Find sum
        int sum = l1.stream().mapToInt(i -> i).sum();
        System.out.println("Sum: " + sum);

        // 9. Count elements > 5
        long count = l1.stream().filter(i -> i > 5).count();
        System.out.println("Count > 5: " + count);

        // 10. Find max
        int max = l1.stream().max(Integer::compare).orElse(-1);
        System.out.println("Max: " + max);

        // 11. Find min
        int min = l1.stream().min(Integer::compare).orElse(-1);
        System.out.println("Min: " + min);

        // 12. Square and filter odd results
        List<Integer> squareOdds = l1.stream().map(i -> i * i).filter(i -> i % 2 != 0).toList();
        System.out.println("Square & odd: " + squareOdds);

        // 13. All match even?
        boolean allEven = l1.stream().allMatch(i -> i % 2 == 0);
        System.out.println("All even? " + allEven);

        // 14. Any match divisible by 3?
        boolean anyDiv3 = l1.stream().anyMatch(i -> i % 3 == 0);
        System.out.println("Any divisible by 3? " + anyDiv3);

        // 15. None match < 0?
        boolean noneNegative = l1.stream().noneMatch(i -> i < 0);
        System.out.println("No negative numbers? " + noneNegative);
    

		System.out.println("                                        ");
		System.out.println("----------------------------------------");
		System.out.println("                                        ");

		List<String> l2 = Arrays.asList("Apple", "Bannana", "Orrange", "dog","cat","Aniket");
		System.out.println("Original list: " + l2);

		// 1. Length greater than 3
		List<String> resLength = l2.stream().filter(s -> s.length() > 3).toList();
		System.out.println("Length > 3: " + resLength);

		// 2. Starting with 'a' (case-insensitive)
		List<String> startsWithA = l2.stream().filter(s -> s.toLowerCase().startsWith("a")).toList();
		System.out.println("Starts with 'a': " + startsWithA);

		// 3. Convert to uppercase
		List<String> upperCase = l2.stream().map(String::toUpperCase).toList();
		System.out.println("Uppercase: " + upperCase);

		// 4. Contains 'n' (case-insensitive)
		List<String> containsN = l2.stream().filter(s -> s.toLowerCase().contains("n")).toList();
		System.out.println("Contains 'n': " + containsN);

		// 5. Alphabetically sorted
		List<String> sorted = l2.stream().sorted().toList();
		System.out.println("Sorted: " + sorted);

		// 6. Reverse sorted
		List<String> reverseSorted = l2.stream().sorted(Comparator.reverseOrder()).toList();
		System.out.println("Reverse sorted: " + reverseSorted);

		// 7. Ends with 'e' (case-insensitive)
		List<String> endsWithE = l2.stream().filter(s -> s.toLowerCase().endsWith("e")).toList();
		System.out.println("Ends with 'e': " + endsWithE);

		// 8. Capitalize first letter, rest lowercase
		List<String> capitalized = l2.stream().map(s -> s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase())
				.toList();
		System.out.println("Capitalized words: " + capitalized);

		// 9. Combo: Filter length > 3, sort, capitalize
		List<String> combo = l2.stream().filter(s -> s.length() > 3).sorted()
				.map(s -> s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase()).toList();
		System.out.println("Combo (len>3 → sorted → capitalized): " + combo);
		
		

	}}