import java.util.*;

public class TrainItinerary extends Itinerary {

	private List<Date> arrivalDates;
	private List<Date> departureDates;

	public TrainItinerary(String idCompany, Company company, String idItinerary, TravelEngine travelEngine, List<Destination> destinations, List<Date> arrivalDates, List<Date> departureDates) {
		super(idCompany, company, idItinerary, travelEngine, destinations);
		this.arrivalDates = arrivalDates;
		this.departureDates = departureDates;
	}

	public Date getItineraryTime() {
		// TODO - implement TrainItinerary.getItineraryTime
		throw new UnsupportedOperationException();
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Trainline company) {
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

	public TravelEngine getTravelEngine() {
		return travelEngine;
	}

	public void setTravelEngine(Train travelEngine) {
		this.travelEngine = travelEngine;
	}

	public List<Destination> getDestinations() {
		return destinations;
	}

	public void setDestinations(List<Destination> destinations) {
		this.destinations = destinations;
	}
}