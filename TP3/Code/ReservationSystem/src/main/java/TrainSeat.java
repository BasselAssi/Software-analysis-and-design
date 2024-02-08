public class TrainSeat extends Seat {


	public TrainSeat(String id, double price, char column, int rowNumber, Section section, Reservation reservation, TravelEngine travelEngine, SeatState state) {
		super(id, price, column, rowNumber, section, reservation, travelEngine, state);
	}

	/**
	 * 
	 * @param SeatState
	 */
	public boolean setSeatState(int SeatState) {
		// TODO - implement TrainSeat.setSeatState
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param type
	 * @param price
	 */
	public double getSeatPrice(char type, double price) {
		// TODO - implement TrainSeat.getSeatPrice
		throw new UnsupportedOperationException();
	}

	public boolean isReserved() {
		// TODO - implement TrainSeat.isReserved
		throw new UnsupportedOperationException();
	}

	public void cancelReservation() {
		// TODO - implement TrainSeat.cancelReservation
		throw new UnsupportedOperationException();
	}

	public void reserveSeat() {
		// TODO - implement TrainSeat.reserveSeat
		throw new UnsupportedOperationException();
	}

	public void paySeat() {
		// TODO - implement TrainSeat.paySeat
		throw new UnsupportedOperationException();
	}

	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}

	@Override
	public TravelEngine getTravelEngine() {
		return travelEngine;
	}

	public void setTravelEngine(TravelEngine travelEngine) {
		this.travelEngine = travelEngine;
	}
}