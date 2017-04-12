package model.airport;

import java.util.ArrayList;
import java.util.HashMap;

public class Flight{
	private static int flightNo = 1;
	private int id;
	private String flightId;
	private ArrayList<Seat> seatList;
	private HashMap<String, ArrayList<Seat>> seatMap;
	private String flightDetails;
	private ArrayList<Seat> listOfAvailableSeats;
	
	public Flight() {
	}

	public Flight(String flightId, String flightDetails){
		this.id = flightNo++;
		setFlightId(flightId);
		setFlightDetails(flightDetails);
		this.seatList = new ArrayList<>(10);
		seatMap = new HashMap<>();		
		seatMap.put(this.getFlightId(), seatList);

		for(int i = 0;i < 5; i++){
			seatList.add(new Seat(i+1, false, Section.First));
			seatList.get(i).setSeatNumber(i+1);
		}

		for(int i= 5;i < 10; i ++){
			seatList.add(new Seat(i+1, false, Section.Second));
			seatList.get(i).setSeatNumber(i+1);
		}
		this.listOfAvailableSeats = seatList;
	}

	public String getSeatMap() {
		return seatMap.keySet().toString() + " " + flightDetails;
	}
	
	public int getId() {
		return id;
	}
	
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	
	public String getFlightId() {
		return flightId;
	}

	public void setFlightDetails(String flightDetails) {
		this.flightDetails = flightDetails;
	}
	
	public String getFlightDetails() {
		return flightDetails;
	}

	public boolean displaySeatMap(Section seatClass){

		if(seatClass == Section.First){
			if(this.haveASeatInFirstClass()){			
				System.out.println("In first class we have following available seats:");	
				for(int j =0; j < 5;j++){
					if(seatList.get(j).isBooked() == false){
						listOfAvailableSeats.add(this.seatList.get(j));
						System.out.print(this.seatList.get(j).getSeatNumber() + ", ");
					}
				}
				return true;
			} else {
				return false; }
		}

		else if(seatClass == Section.Second){
			if(this.haveASeatInSecondClass()) {
				System.out.println("In second class we have following available seats:");
				for(int i = 5; i < 10; i++){
					if(seatList.get(i).isBooked() == false){
						listOfAvailableSeats.add(this.seatList.get(i));
						System.out.print(this.seatList.get(i).getSeatNumber() + ", ");
					}
				}
				return true;
			} else {
				return false; }
		}
		return false;
	}
	
	public Section swapSection(Section section) {
		if(section == Section.First ) {
			section = Section.Second;
		} else { section = Section.First; }
		return section;
	}

	public Seat bookASeat(int seatNumberToBeBooked){
		for(;;){
			Seat seatBeingBooked = (seatList.get(seatNumberToBeBooked-1));
			if (seatBeingBooked.isBooked() == false) {
				return seatBeingBooked;
			}
		}
	}

	public boolean checkIfSeatIsAvailable(int seatNumberToCheck){
		for(Seat seatToFind: this.seatList)

			if(seatToFind.findASeatBySeatNumber(seatNumberToCheck) && (!seatToFind.isBooked())) { 
				return true; }
		return false;
	}

	public boolean haveASeatInFirstClass(){
		for(int i =0; i < 5;i++){
			if(!seatList.get(i).isBooked()) {
				return true;
			}
		}
		return false;
	}

	public boolean haveASeatInSecondClass(){
		for(int i =5; i < 10;i++){
			if(!seatList.get(i).isBooked()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		if(!Seat.bookedFlag)
			return "You have booked the Flight: " + seatMap.keySet() + "Available seats are" + seatMap.values();
		else
			return null;
	}

}
