import java.util.*;

public class Airport extends Destination {


	public Airport(String id, String city, String country, List<Itinerary> itineraries) {
		super(id, city, country, itineraries);
	}

	public List<Itinerary> getItineraries() {
		return itineraries;
	}

	public void setItineraries(List<Itinerary> itineraries) {
		this.itineraries = itineraries;
	}
}