import java.util.*;

public abstract class Company {

	protected String id;
	protected List<Reservation> reservations;
	protected List<TravelEngine> travelEngines;
	protected List<Itinerary> itineraries;

	public Company(String id, List<Reservation> reservations, List<TravelEngine> travelEngines, List<Itinerary> itineraries) {
		this.id = id;
		this.reservations = reservations;
		this.travelEngines = travelEngines;
		this.itineraries = itineraries;
	}

	public List<Itinerary> getItinerariesInformations() {
		// TODO - implement Company.getItinerariesInformations
		throw new UnsupportedOperationException();
	}

}