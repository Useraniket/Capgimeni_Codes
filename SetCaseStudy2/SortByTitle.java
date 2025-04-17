package SetCaseStudy2;

import java.util.Comparator;

public class SortByTitle implements Comparator<Books> {
	@Override
	public int compare(Books b1, Books b2) {
		return b1.getTitle().compareToIgnoreCase(b2.getTitle());
	}
}
