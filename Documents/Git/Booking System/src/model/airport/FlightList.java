package model.airport;

import java.util.ArrayList;

public class FlightList {
	private ArrayList<Flight> flightList;
	
	public FlightList() {
		flightList = new ArrayList<Flight>();
	}
	
	public void addFlight(Flight flight) {
		flightList.add(flight);
	}
	
	public ArrayList<Flight> getFlightList() {
		return flightList;
	}
	
	public Flight getFlight(int id) {
		for (Flight flight : flightList) {
			if((flight.getId() == id)) {
				return flight;
			}
		}
		return null;
	}	

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		String NEW_LINE = System.getProperty("line.separator");
		for (Flight flight : flightList) {
			result.append(String.format("%1$-3s", " " +flight.getId() + ". "));
			result.append(String.format("%1$-5s", flight.getFlightId()) + " ");
			result.append(String.format("%1$-50s", "- next " + flight.getFlightDetails()) + NEW_LINE );
		}	
		return result.toString();
	}
	
}
