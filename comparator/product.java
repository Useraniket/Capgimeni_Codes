package comparator;

public class product implements Comparable {
	int rollno;
	String name;
	double percentage;

	public product(int rollno2, String name2, double percentage2) {
		this.rollno = rollno2;
		this.name = name2;
		this.percentage = percentage2;
	}

	@Override
	public String toString() {
		return rollno + "  " + name + "  " + percentage;
	}

	@Override
	public int compareTo(Object o) {

		product e = (product) o;
		return this.rollno - e.rollno;

	}
}
