package SetCaseStudy2;

import java.util.Objects;

public class Books {
	private int id;
	private String title;
	private double price;

	public Books(int id, String title, double price) {
		this.id = id;
		this.title = title;
		this.price = price;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "[" + this.id + ", " + this.title + ", " + this.price + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Books book = (Books) obj;
		return id == book.id &&
				Double.compare(book.price, price) == 0 &&
				Objects.equals(title, book.title);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, title, price);
	}

//	@Override
//	public int compareTo(Books other) {
//		return Integer.compare(this.id, other.id); // natural ordering by ID
//	}

}


