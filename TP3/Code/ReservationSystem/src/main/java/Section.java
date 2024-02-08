import java.util.*;

public abstract class Section {

	protected DispositionType disposition;
	protected TravelEngine travelEngine;
	protected List<Seat> seats;

	public Section(DispositionType disposition, TravelEngine travelEngine, List<Seat> seats) {
		this.disposition = disposition;
		this.travelEngine = travelEngine;
		this.seats = seats;
	}

	/**
	 * nullAssociation Type = Seat
	 */


	/**
	 * 
	 * @param price
	 */
	public double getSectionPrice(double price) {
		// TODO - implement Section.getSectionPrice
		throw new UnsupportedOperationException();
	}

}