import java.util.*;

public abstract class Repository {

	//On fait des Hashmap pour pouvoir retrouver plus facilement les différents types d'objets abstraits
	protected Map<String, List<Destination>> destinations;
	protected Map<String, List<Client>> clients;
	protected Map<String, List<Company>> companies;
	protected Map<String, List<TravelEngine>> travelEngines;
	protected Map<String, List<Section>> sections;
	protected Map<String, List<Seat>> seats;
	protected Map<String, List<Payment>> payments;
	protected Map<String, List<Reservation>> reservations;
	protected Map<String, List<Itinerary>> itineraries;

	public abstract List<Destination> getDestinations();
	public abstract void setDestinations(List<Destination> destinations);

	public abstract List<Client> getClients();

	public abstract void setClients(List<Client> clients);

	public abstract List<Company> getCompanies();

	public abstract void setCompanies(List<Company> companies);

	public abstract List<TravelEngine> getTravelEngines();

	public abstract void setTravelEngines(List<TravelEngine> travelEngines);

	public abstract List<Section> getSections();

	public abstract void setSections(List<Section> sections);

	public abstract List<Seat> getSeats();

	public abstract void setSeats(List<Seat> seats);

	public abstract List<Payment> getPayments();

	public abstract void setPayments(List<Payment> payments);

	public abstract List<Reservation> getReservations();

	public abstract void setReservations(List<Reservation> reservations);

	public abstract List<Itinerary> getItineraries();

	public abstract void setItineraries(List<Itinerary> itineraries);

	/**
	 * 
	 * @param airport
	 */
	public abstract List<Airport> listAllFlightsByAirport(Airport airport);

	/**
	 * 
	 * @param port
	 */
	public abstract List<Port> listAllCruisesByPort(Port port);

	/**
	 * 
	 * @param station
	 */
	public abstract List<Station> listAllTrainItineraryByStation(Station station);

	/**
	 * 
	 * @param airline
	 */
	public abstract List<Airline> listAllFlightsByAirline(Airline airline);

	/**
	 * 
	 * @param cruiseline
	 */
	public abstract List<Cruiseline> listAllCruisesByCruiseline(Cruiseline cruiseline);

	/**
	 * 
	 * @param trainline
	 */
	public abstract List<Trainline> listAllTrainItineraryByTrainline(Trainline trainline);

}