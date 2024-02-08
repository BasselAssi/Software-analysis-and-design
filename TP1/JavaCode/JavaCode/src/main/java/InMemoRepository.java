public class InMemoRepository implements IRepository {

	private List<Client> clients;
	private List<Company> companies;
	private List<Itinerary> Itineraries;
	private List<Destinations> destinations;
	private List<TravelEngine> travelEngines;
	private List<Section> sections;
	private List<Seat> seats;
	private List<Payment> payments;
	private List<Reservation> reservations;

	public List<Client> getClients() {
		return this.clients;
	}

	/**
	 * 
	 * @param clients
	 */
	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	public List<Company> getCompanies() {
		return this.companies;
	}

	/**
	 * 
	 * @param companies
	 */
	public void setCompanies(List<Company> companies) {
		this.companies = companies;
	}

	public List<Itinerary> getItineraries() {
		// TODO - implement InMemoRepository.getItineraries
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Itineraries
	 */
	public void setItineraries(List<Itinerary> Itineraries) {
		// TODO - implement InMemoRepository.setItineraries
		throw new UnsupportedOperationException();
	}

	public List<Destinations> getDestinations() {
		return this.destinations;
	}

	/**
	 * 
	 * @param destinations
	 */
	public void setDestinations(List<Destinations> destinations) {
		this.destinations = destinations;
	}

	public List<TravelEngine> getTravelEngines() {
		return this.travelEngines;
	}

	/**
	 * 
	 * @param travelEngines
	 */
	public void setTravelEngines(List<TravelEngine> travelEngines) {
		this.travelEngines = travelEngines;
	}

	public List<Section> getSections() {
		return this.sections;
	}

	/**
	 * 
	 * @param sections
	 */
	public void setSections(List<Section> sections) {
		this.sections = sections;
	}

	public List<Seat> getSeats() {
		return this.seats;
	}

	/**
	 * 
	 * @param seats
	 */
	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}

	public List<Payment> getPayments() {
		return this.payments;
	}

	/**
	 * 
	 * @param payments
	 */
	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}

	public List<Reservation> getReservations() {
		return this.reservations;
	}

	/**
	 * 
	 * @param reservations
	 */
	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	/**
	 * 
	 * @param airport
	 */
	public List<Airport> listAllFlightsByAirport(Airport airport) {
		// TODO - implement InMemoRepository.listAllFlightsByAirport
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param port
	 */
	public List<Port> listAllCruisesByPort(Port port) {
		// TODO - implement InMemoRepository.listAllCruisesByPort
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param station
	 */
	public List<Station> listAllTrainItineraryByStation(Station station) {
		// TODO - implement InMemoRepository.listAllTrainItineraryByStation
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param airline
	 */
	public List<Airline> listAllFlightsByAirline(Airline airline) {
		// TODO - implement InMemoRepository.listAllFlightsByAirline
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param cruiseline
	 */
	public List<Cruiseline> listAllCruisesByCruiseline(Cruiseline cruiseline) {
		// TODO - implement InMemoRepository.listAllCruisesByCruiseline
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param trainline
	 */
	public List<Trainline> listAllTrainItineraryByTrainLine(Trainline trainline) {
		// TODO - implement InMemoRepository.listAllTrainItineraryByTrainLine
		throw new UnsupportedOperationException();
	}

}