import java.util.*;

public abstract class Destination {

	protected String id;
	protected String city;
	protected String country;
	protected List<Itinerary> itineraries;

	public Destination(String id, String city, String country, List<Itinerary> itineraries) {
		this.id = id;
		this.city = city;
		this.country = country;
		this.itineraries = itineraries;
	}

	public List<Itinerary> getItinerariesInformations() {
		// TODO - implement Destination.getItinerariesInformations
		throw new UnsupportedOperationException();
	}

}