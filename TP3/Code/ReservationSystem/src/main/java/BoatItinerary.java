import java.util.Date;
import java.util.List;

public class BoatItinerary extends Itinerary {

	private List<Date> arrivalDates;
	private List<Date> departureDates;
	private int duration;

	public BoatItinerary(String idCompany, Company company, String idItinerary, TravelEngine travelEngine, List<Destination> destinations, List<Date> arrivalDates, List<Date> departureDates, int duration) {
		super(idCompany, company, idItinerary, travelEngine, destinations);
		this.arrivalDates = arrivalDates;
		this.departureDates = departureDates;
		this.duration = duration;
	}

	public Date getItineraryTime() {
		// TODO - implement BoatItinerary.getItineraryTime
		throw new UnsupportedOperationException();
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Cruiseline company) {
		this.company = company;
	}

	public List<Date> getArrivalDates() {
		return arrivalDates;
	}

	public void setArrivalDates(List<Date> arrivalDates) {
		this.arrivalDates = arrivalDates;
	}

	public List<Date> getDepartureDates() {
		return departureDates;
	}

	public void setDepartureDates(List<Date> departureDates) {
		this.departureDates = departureDates;
	}

	public List<Destination> getDestinations() {
		return destinations;
	}

	public void setDestinations(List<Destination> destinations) {
		this.destinations = destinations;
	}

	public TravelEngine getTravelEngine() {
		return travelEngine;
	}

	public void setTravelEngine(Boat travelEngine) {
		this.travelEngine = travelEngine;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
}