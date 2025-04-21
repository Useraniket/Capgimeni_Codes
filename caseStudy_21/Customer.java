package caseStudy_21;

public class Customer {
	private String name;
	private String password;
	private boolean LoggedIn;

	public Customer(String name, String password) {
		this.name = name;
		this.password = password;
		this.LoggedIn = false;
	}

	public boolean isLoggedIn() {
		return LoggedIn;
	}

	public String getName() {
		return name;
	}

	public boolean login(String enteredPassword) {
		if (this.password.equals(enteredPassword)) {
			this.LoggedIn = true;
			System.out.println(name + " has logged in successfully.");
			return true;
		} else {
			System.out.println("Invalid credentials!");
			return false;
		}
	}
}
