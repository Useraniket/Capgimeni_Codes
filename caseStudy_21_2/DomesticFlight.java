package caseStudy_21_2;

public class DomesticFlight extends Flight {
	private String stateCode;

	public DomesticFlight(String flightId, String departureTime, String arrivalTime, int availableSeats,
			String stateCode) {
		super(flightId, departureTime, arrivalTime, availableSeats);
		this.stateCode = stateCode;
	}

	@Override
	public String getFlightInfo() {
		return "Domestic Flight ID: " + getFlightId() + ", Departure: " + getDepartureTime() + ", Arrival: "
				+ getArrivalTime() + ", Seats: " + getAvailableSeats() + ", State Code: " + stateCode;
	}
}