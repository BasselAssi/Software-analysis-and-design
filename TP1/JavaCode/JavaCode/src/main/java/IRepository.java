public interface IRepository {
    public List<Client> getClients();

    /**
     *
     * @param clients
     */
    public void setClients(List<Client> clients);

    public List<Company> getCompanies();

    /**
     *
     * @param companies
     */
    public void setCompanies(List<Company> companies);

    public List<Itinerary> getItineraries();

    /**
     *
     * @param Itineraries
     */
    public void setItineraries(List<Itinerary> Itineraries);

    public List<Destinations> getDestinations();

    /**
     *
     * @param destinations
     */
    public void setDestinations(List<Destinations> destinations);

    public List<TravelEngine> getTravelEngines();

    /**
     *
     * @param travelEngines
     */
    public void setTravelEngines(List<TravelEngine> travelEngines);

    public List<Section> getSections();

    /**
     *
     * @param sections
     */
    public void setSections(List<Section> sections);

    public List<Seat> getSeats();

    /**
     *
     * @param seats
     */
    public void setSeats(List<Seat> seats);

    public List<Payment> getPayments();

    /**
     *
     * @param payments
     */
    public void setPayments(List<Payment> payments);

    public List<Reservation> getReservations();

    /**
     *
     * @param reservations
     */
    public void setReservations(List<Reservation> reservations);

    /**
     *
     * @param airport
     */
    public List<Airport> listAllFlightsByAirport(Airport airport);

    /**
     *
     * @param port
     */
    public List<Port> listAllCruisesByPort(Port port);

    /**
     *
     * @param station
     */
    public List<Station> listAllTrainItineraryByStation(Station station);

    /**
     *
     * @param airline
     */
    public List<Airline> listAllFlightsByAirline(Airline airline);

    /**
     *
     * @param cruiseline
     */
    public List<Cruiseline> listAllCruisesByCruiseline(Cruiseline cruiseline);

    /**
     *
     * @param trainline
     */
    public List<Trainline> listAllTrainItineraryByTrainLine(Trainline trainline);

}