public class PlaneSeat extends Seat {

	public PlaneSeat(String id, double price, char column, int rowNumber, Section section, Reservation reservation, TravelEngine travelEngine, SeatState state) {
		super(id, price, column, rowNumber, section, reservation, travelEngine, state);
	}

	/**
	 * 
	 * @param SeatState
	 */
	public boolean setSeatState(int SeatState) {
		// TODO - implement PlaneSeat.setSeatState
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param type
	 * @param price
	 */
	public double getSeatPrice(char type, double price) {
		// TODO - implement PlaneSeat.getSeatPrice
		throw new UnsupportedOperationException();
	}

	public boolean isReserved() {
		// TODO - implement PlaneSeat.isReserved
		throw new UnsupportedOperationException();
	}

	public void cancelReservation() {
		// TODO - implement PlaneSeat.cancelReservation
		throw new UnsupportedOperationException();
	}

	public void reserveSeat() {
		// TODO - implement PlaneSeat.reserveSeat
		throw new UnsupportedOperationException();
	}

	public void paySeat() {
		// TODO - implement PlaneSeat.paySeat
		throw new UnsupportedOperationException();
	}

	@Override
	public TravelEngine getTravelEngine() {
		return travelEngine;
	}

	public void setTravelEngine(Plane travelEngine) {
		this.travelEngine = travelEngine;
	}

	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}
}