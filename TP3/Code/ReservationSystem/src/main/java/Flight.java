import java.util.*;

public class Flight extends Itinerary {

	private Date departure;
	private Date arrival;

	public Flight(String idCompany, Company company, String idItinerary, TravelEngine travelEngine, List<Destination> destinations, Date departure, Date arrival) {
		super(idCompany, company, idItinerary, travelEngine, destinations);
		this.departure = departure;
		this.arrival = arrival;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Airline company) {
		this.company = company;
	}

	public TravelEngine getTravelEngine() {
		return travelEngine;
	}

	public void setTravelEngine(Plane travelEngine) {
		this.travelEngine = travelEngine;
	}

	public Date getDeparture() {
		return departure;
	}

	public void setDeparture(Date departure) {
		this.departure = departure;
	}

	public Date getArrival() {
		return arrival;
	}

	public void setArrival(Date arrival) {
		this.arrival = arrival;
	}

	public List<Destination> getDestinations() {
		return destinations;
	}

	public void setDestinations(List<Destination> destinations) {
		this.destinations = destinations;
	}
}