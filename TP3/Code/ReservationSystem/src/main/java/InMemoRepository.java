import java.util.*;

public class InMemoRepository extends Repository {

	public InMemoRepository() {
		this.clients = new HashMap<>();
		this.companies = new HashMap<>();
		this.destinations = new HashMap<>();
		this.itineraries = new HashMap<>();
		this.payments = new HashMap<>();
		this.reservations = new HashMap<>();
		this.seats = new HashMap<>();
		this.sections = new HashMap<>();
		this.travelEngines = new HashMap<>();
		populate();
	}

	/*
	Lors de l'exécution, le système comprendra au moins trois vols, trois trajets et trois itinéraires par défaut
	On a besoin d'au moins 1 avion, 1 train, 1 bateau
	Des sièges et des sections, au moins 2 par transport
	Ainsi que de 2 aéroport, 2 station, 2 ports
	et de 1 Airline, 1 Trainline, 1 Cruiseline
	* */
	private void populate(){
		// Avions, Faire attentions aux NULL, il pourrait y avoir des null pointers exception.
		// J'ai tout de même essayé de les remplacer proprement par de vraies valeurs à la fin
		// Ici on n'utilise pas les factories, pour que ça soit plus controlé comme environnement. Éviter les bugs.
		// Et c'est plus rapide que d'instancier les objets par défaut et de les changer un par un ensuite.
		this.companies.get("Plane").add(new Airline("FlexAir", new ArrayList<>(), new ArrayList<>(), new ArrayList<>()));
		this.destinations.get("Plane").add(new Airport("69", "Knuckles", "Uganda", new ArrayList<>()));
		this.destinations.get("Plane").add(new Airport("420", "Queen", "ForDa", new ArrayList<>()));
		this.travelEngines.get("Plane").add(new Plane("111", this.companies.get("Plane").get(0), null, new ArrayList<>(), new ArrayList<>()));
		this.itineraries.get("Plane").add(new Flight("FlexAir-69", this.companies.get("Plane").get(0),"420-BL4Z3", this.travelEngines.get("Plane").get(0), this.destinations.get("Plane"), new Date(), new Date()));
		this.itineraries.get("Plane").add(new Flight("FlexAir-420", this.companies.get("Plane").get(0),"MOO-MILK", this.travelEngines.get("Plane").get(0), this.destinations.get("Plane"), new Date(), new Date()));
		this.itineraries.get("Plane").add(new Flight("FlexAir-9696", this.companies.get("Plane").get(0),"FULL-THROTTLE", this.travelEngines.get("Plane").get(0), this.destinations.get("Plane"), new Date(), new Date()));
		this.travelEngines.get("Plane").get(0).itinerary = this.itineraries.get("Plane").get(0);
		this.seats.get("Plane").add(new PlaneSeat("123", 34.99, 's', 5, null, new Reservation(), null, new Vacant()));
		this.seats.get("Plane").add(new PlaneSeat("123", 34.99, 's', 5, null, new Reservation(), null, new Vacant()));
		this.sections.get("Plane").add(new PlaneSection(DispositionType.S, this.travelEngines.get("Plane").get(0),this.seats.get("Plane") ,PlaneTrainType.A));
		this.seats.get("Plane").get(0).section = this.sections.get("Plane").get(0);
		this.seats.get("Plane").get(0).travelEngine = this.travelEngines.get("Plane").get(0);
		this.seats.get("Plane").get(1).section = this.sections.get("Plane").get(0);
		this.seats.get("Plane").get(1).travelEngine = this.travelEngines.get("Plane").get(0);
		this.travelEngines.get("Plane").get(0).sections = this.sections.get("Plane");
		this.travelEngines.get("Plane").get(0).seats = this.seats.get("Plane");


		//Trains
		this.companies.get("Train").add(FactoryConnector.getInstance().getTrainFactory().createCompany());
		this.destinations.get("Train").add(FactoryConnector.getInstance().getTrainFactory().createDestination());
		this.itineraries.get("Train").add(FactoryConnector.getInstance().getTrainFactory().createItinerary());
		this.seats.get("Train").add(FactoryConnector.getInstance().getTrainFactory().createSeat());
		this.sections.get("Train").add(FactoryConnector.getInstance().getTrainFactory().createSection());
		this.travelEngines.get("Train").add(FactoryConnector.getInstance().getTrainFactory().createTravelEngine());

		//Bateaux
		this.companies.get("Boat").add(FactoryConnector.getInstance().getBoatFactory().createCompany());
		this.destinations.get("Boat").add(FactoryConnector.getInstance().getBoatFactory().createDestination());
		this.itineraries.get("Boat").add(FactoryConnector.getInstance().getBoatFactory().createItinerary());
		this.seats.get("Boat").add(FactoryConnector.getInstance().getBoatFactory().createSeat());
		this.sections.get("Boat").add(FactoryConnector.getInstance().getBoatFactory().createSection());
		this.travelEngines.get("Boat").add(FactoryConnector.getInstance().getBoatFactory().createTravelEngine());
	}
	@Override
	public List<Destination> getDestinations() {
		// TODO - implement Reservation.reserveSeat
		throw new UnsupportedOperationException();
	}

	@Override
	public List<Client> getClients() {
		// TODO - implement Reservation.reserveSeat
		throw new UnsupportedOperationException();
	}

	@Override
	public List<Company> getCompanies() {
		// TODO - implement Reservation.reserveSeat
		throw new UnsupportedOperationException();
	}

	@Override
	public List<TravelEngine> getTravelEngines() {
		// TODO - implement Reservation.reserveSeat
		throw new UnsupportedOperationException();
	}

	@Override
	public List<Section> getSections() {
		// TODO - implement Reservation.reserveSeat
		throw new UnsupportedOperationException();
	}

	@Override
	public List<Seat> getSeats() {
		// TODO - implement Reservation.reserveSeat
		throw new UnsupportedOperationException();
	}

	@Override
	public List<Payment> getPayments() {
		// TODO - implement Reservation.reserveSeat
		throw new UnsupportedOperationException();
	}

	@Override
	public List<Reservation> getReservations() {
		// TODO - implement Reservation.reserveSeat
		throw new UnsupportedOperationException();
	}

	@Override
	public List<Itinerary> getItineraries() {
		// TODO - implement Reservation.reserveSeat
		throw new UnsupportedOperationException();
	}

	@Override
	public List<Airport> listAllFlightsByAirport(Airport airport) {
		// TODO - implement Reservation.reserveSeat
		throw new UnsupportedOperationException();
	}

	@Override
	public List<Port> listAllCruisesByPort(Port port) {
		// TODO - implement Reservation.reserveSeat
		throw new UnsupportedOperationException();
	}

	@Override
	public List<Station> listAllTrainItineraryByStation(Station station) {
		// TODO - implement Reservation.reserveSeat
		throw new UnsupportedOperationException();
	}

	@Override
	public List<Airline> listAllFlightsByAirline(Airline airline) {
		// TODO - implement Reservation.reserveSeat
		throw new UnsupportedOperationException();
	}

	@Override
	public List<Cruiseline> listAllCruisesByCruiseline(Cruiseline cruiseline) {
		// TODO - implement Reservation.reserveSeat
		throw new UnsupportedOperationException();
	}

	@Override
	public List<Trainline> listAllTrainItineraryByTrainline(Trainline trainline) {
		// TODO - implement Reservation.reserveSeat
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param destinations
	 */
	@Override
	public void setDestinations(List destinations) {
		// TODO - implement InMemoRepository.setDestinations
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param clients
	 */
	@Override
	public void setClients(List clients) {
		// TODO - implement InMemoRepository.setClients
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param companies
	 */
	@Override
	public void setCompanies(List companies) {
		// TODO - implement InMemoRepository.setCompanies
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param travelEngines
	 */
	@Override
	public void setTravelEngines(List travelEngines) {
		// TODO - implement InMemoRepository.setTravelEngines
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param sections
	 */
	@Override
	public void setSections(List sections) {
		// TODO - implement InMemoRepository.setSections
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param seats
	 */
	@Override
	public void setSeats(List seats) {
		// TODO - implement InMemoRepository.setSeats
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param payments
	 */
	@Override
	public void setPayments(List payments) {
		// TODO - implement InMemoRepository.setPayments
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param reservations
	 */
	@Override
	public void setReservations(List reservations) {
		// TODO - implement InMemoRepository.setReservations
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param itineraries
	 */
	@Override
	public void setItineraries(List itineraries) {
		// TODO - implement InMemoRepository.setItineraries
		throw new UnsupportedOperationException();
	}
}