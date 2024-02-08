public class Cabin extends Seat {

	public Cabin(String id, double price, char column, int rowNumber, Section section, Reservation reservation, TravelEngine travelEngine, SeatState state) {
		super(id, price, column, rowNumber, section, reservation, travelEngine, state);
	}

	/**
	 * 
	 * @param SeatState
	 */
	public boolean setSeatState(int SeatState) {
		// TODO - implement Cabin.setSeatState
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param type
	 * @param price
	 */
	public double getSeatPrice(char type, double price) {
		// TODO - implement Cabin.getSeatPrice
		throw new UnsupportedOperationException();
	}

	public boolean isReserved() {
		// TODO - implement Cabin.isReserved
		throw new UnsupportedOperationException();
	}

	public void cancelReservation() {
		// TODO - implement Cabin.cancelReservation
		throw new UnsupportedOperationException();
	}

	public void reserveSeat() {
		// TODO - implement Cabin.reserveSeat
		throw new UnsupportedOperationException();
	}

	public void paySeat() {
		// TODO - implement Cabin.paySeat
		throw new UnsupportedOperationException();
	}


	@Override
	public TravelEngine getTravelEngine() {
		return travelEngine;
	}

	public void setTravelEngine(TravelEngine travelEngine) {
		this.travelEngine = travelEngine;
	}

	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}
}