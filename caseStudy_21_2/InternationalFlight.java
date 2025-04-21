package caseStudy_21_2;

public class InternationalFlight extends Flight {
	private String countryCode;

	public InternationalFlight(String flightId, String departureTime, String arrivalTime, int availableSeats,
			String countryCode) {
		super(flightId, departureTime, arrivalTime, availableSeats);
		this.countryCode = countryCode;
	}

	@Override
	public String getFlightInfo() {
		return "International Flight ID: " + getFlightId() + ", Departure: " + getDepartureTime() + ", Arrival: "
				+ getArrivalTime() + ", Seats: " + getAvailableSeats() + ", Country Code: " + countryCode;
	}
}
