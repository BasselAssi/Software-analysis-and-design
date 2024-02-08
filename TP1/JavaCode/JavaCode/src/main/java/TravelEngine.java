import java.util.List;

public abstract class TravelEngine {

	private String id;
	private Company company;
	private List<Section> sections;
	private List<Seat> seats;
	private Itinerary itinerary;

	/**
	 * 
	 * @param type
	 * @param price
	 */
	public double getSeatPrice(char type, double price) {
		// TODO - implement TravelEngine.getSeatPrice
		throw new UnsupportedOperationException();
	}

}