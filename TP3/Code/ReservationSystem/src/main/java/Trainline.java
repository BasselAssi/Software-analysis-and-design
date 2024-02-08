import java.util.*;

public class Trainline extends Company {

	public Trainline(String id, List<Reservation> reservations, List<TravelEngine> travelEngines, List<Itinerary> itineraries) {
		super(id, reservations, travelEngines, itineraries);
	}

	public List<Itinerary> getItineraries() {
		return itineraries;
	}

	public void setItineraries(List<Itinerary> itineraries) {
		this.itineraries = itineraries;
	}

	public List<TravelEngine> getTravelEngines() {
		return travelEngines;
	}

	public void setTravelEngines(List<TravelEngine> travelEngines) {
		this.travelEngines = travelEngines;
	}
}