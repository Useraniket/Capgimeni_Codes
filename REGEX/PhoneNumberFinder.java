package REGEX;

import java.util.regex.*;
import java.util.*;

public class PhoneNumberFinder {
	public static void main(String[] args) {
		// Sample text to search for phone numbers
		String text = "You can reach me at (555) 555-5555, 555.555.5555, or 555-555-5555.";

		// Regular expression for matching phone numbers
		String regex = "(\\(?\\d{3}\\)?[-.\\s]?\\d{3}[-.\\s]?\\d{4})";

		// Create a pattern from the regular expression
		Pattern pattern = Pattern.compile(regex);

		// Create a matcher to find phone numbers in the text
		Matcher matcher = pattern.matcher(text);

		// Find all matching phone numbers
		while (matcher.find()) {
			String s = matcher.group();
			System.out.println(s);
		}

	}
}