public abstract class Seat {

	protected String id;
	protected double price;
	protected char column;
	protected int rowNumber;
	protected Section section;
	protected Reservation reservation;
	protected TravelEngine travelEngine;
	protected SeatState state;

	public Seat(String id, double price, char column, int rowNumber, Section section, Reservation reservation, TravelEngine travelEngine, SeatState state) {
		this.id = id;
		this.price = price;
		this.column = column;
		this.rowNumber = rowNumber;
		this.section = section;
		this.reservation = reservation;
		this.travelEngine = travelEngine;
		this.state = state;
	}

	public TravelEngine getTravelEngine() {
		return this.travelEngine;
	}

	public void setTravelEngine(TravelEngine travelEngine) {
		this.travelEngine = travelEngine;
	}

	/**
	 * 
	 * @param type
	 * @param price
	 */
	public double getSeatPrice(char type, double price) {
		// TODO - implement Seat.getSeatPrice
		throw new UnsupportedOperationException();
	}

	public boolean isReserved() {
		// TODO - implement Seat.isReserved
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param SeatState
	 */
	public boolean setSeatState(int SeatState) {
		// TODO - implement Seat.setSeatState
		throw new UnsupportedOperationException();
	}

	public void cancelReservation() {
		// TODO - implement Seat.cancelReservation
		throw new UnsupportedOperationException();
	}

	public void reserveSeat() {
		// TODO - implement Seat.reserveSeat
		throw new UnsupportedOperationException();
	}

	public void paySeat() {
		// TODO - implement Seat.paySeat
		throw new UnsupportedOperationException();
	}

}