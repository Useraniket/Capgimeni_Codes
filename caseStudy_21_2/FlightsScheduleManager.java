package caseStudy_21_2;

import java.util.ArrayList;
import java.util.List;

public class FlightsScheduleManager {
    private List<Flight> flights;

    public FlightsScheduleManager() {
        flights = new ArrayList<>();
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public boolean bookFlight(String id, int count) {
        for (Flight flight : flights) {
            if (flight.getFlightId().equals(id)) {
                return flight.bookSeats(count);
            }
        }
        return false;
    }

    public List<Flight> getAvailableFlight(String start, String end) {
        List<Flight> availableFlights = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.isAvailable() &&
                flight.getDepartureTime().compareTo(start) >= 0 &&
                flight.getArrivalTime().compareTo(end) <= 0) {
                availableFlights.add(flight);
            }
        }
        return availableFlights;
    }
}
