import java.util.*;

public abstract class Itinerary {

	protected String idCompany;
	protected Company company;
	protected String idItinerary;
	protected TravelEngine travelEngine;
	protected List<Destination> destinations;

	public Itinerary(String idCompany, Company company, String idItinerary, TravelEngine travelEngine, List<Destination> destinations) {
		this.idCompany = idCompany;
		this.company = company;
		this.idItinerary = idItinerary;
		this.travelEngine = travelEngine;
		this.destinations = destinations;
	}
}