import java.util.*;

public class Cruiseline extends Company {
	public Cruiseline(String id, List<Reservation> reservations, List<TravelEngine> travelEngines, List<Itinerary> itineraries) {
		super(id, reservations, travelEngines, itineraries);
	}

	public List<TravelEngine> getTravelEngines() {
		return travelEngines;
	}

	public void setTravelEngines(List<TravelEngine> travelEngines) {
		this.travelEngines = travelEngines;
	}

	public List<Itinerary> getItineraries() {
		return itineraries;
	}

	public void setItineraries(List<Itinerary> itineraries) {
		this.itineraries = itineraries;
	}
}