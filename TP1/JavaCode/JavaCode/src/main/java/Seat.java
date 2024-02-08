import java.util.Calendar;
import java.util.Date;

public abstract class Seat {

	private String id;
	private char column;
	private int rowNumber;


	private TravelEngine travelEngine;
	private Section section;
	private Reservation reservation;

	/**
	 * 
	 * @param type
	 * @param price
	 */
	public double getSeatPrice(char type, double price) {
		// TODO - implement Seat.getSeatPrice
		throw new UnsupportedOperationException();
	}

	public TravelEngine getTravelEngine() {
		return travelEngine;
	}

	public void setTravelEngine(TravelEngine travelEngine) {
		this.travelEngine = travelEngine;
	}

	public boolean isReserved(){

		if (reservation != null){
			Calendar nextDay = Calendar.getInstance();
			nextDay.setTime(reservation.getTimeReserved());
			nextDay.add(Calendar.DAY_OF_MONTH, 1);
			Calendar currentDay = Calendar.getInstance();
			currentDay.setTime(new Date());
			return currentDay.before(nextDay); //It is already reserved, and it has been less than 24h
		}
		return false; //If there is no reservations currently for this seat, we return false
	}
}