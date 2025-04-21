package caseStudy_21_2;

public abstract class Flight {
	private String flightId;
	private String departureTime;
	private String arrivalTime;
	private int availableSeats;

	public Flight(String flightId, String departureTime, String arrivalTime, int availableSeats) {
		this.flightId = flightId;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.availableSeats = availableSeats;
	}

	public boolean bookSeats(int count) {
		if (availableSeats >= count) {
			availableSeats -= count;
			return true;
		}
		return false;
	}

	public boolean isAvailable() {
		return availableSeats > 0;
	}

	public abstract String getFlightInfo();

	public String getFlightId() {
		return flightId;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}
}
