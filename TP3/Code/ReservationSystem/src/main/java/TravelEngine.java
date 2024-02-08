import java.util.*;

public abstract class TravelEngine implements IVisitables {

	protected String id;
	protected Company company;
	protected Itinerary itinerary;
	protected List<Section> sections;
	protected List<Seat> seats;

	public TravelEngine(String id, Company company, Itinerary itinerary, List<Section> sections, List<Seat> seats) {
		this.id = id;
		this.company = company;
		this.itinerary = itinerary;
		this.sections = sections;
		this.seats = seats;
	}

	/**
	 * 
	 * @param type
	 * @param price
	 */
	public double getSeatPrice(char type, double price) {
		// TODO - implement TravelEngine.getSeatPrice
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param v
	 */
	public void accept(IVisitor v) {
		// TODO - implement TravelEngine.accept
		throw new UnsupportedOperationException();
	}

}