public class ClientView extends Observer {

	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param passportID
	 * @param creditCard
	 * @param reservationId
	 */
	public boolean payReservation(String firstName, String lastName, String email, String passportID, String creditCard, String reservationId) {
		// TODO - implement ClientView.payReservation
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param date
	 * @param sectionType
	 * @param destinationAirport
	 * @param homeAirport
	 */
	public java.util.List<Flight> getAllAvailableFlights(java.util.Date date, PlaneTrainType sectionType, Airport destinationAirport, Airport homeAirport) {
		// TODO - implement ClientView.getAllAvailableFlights
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param date
	 * @param sectionType
	 * @param homeStation
	 * @param destinationStation
	 */
	public java.util.List<TrainItinerary> getAllAvailableTrainItineraries(java.util.Date date, PlaneTrainType sectionType, Station homeStation, Station destinationStation) {
		// TODO - implement ClientView.getAllAvailableTrainItineraries
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param date
	 * @param sectionType
	 * @param homePort
	 */
	public java.util.List<BoatItinerary> getAllAvailableBoatItineraries(java.util.Date date, BoatType sectionType, Port homePort) {
		// TODO - implement ClientView.getAllAvailableBoatItineraries
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param client
	 * @param seat
	 * @param company
	 */
	public boolean reserveSeat(Client client, Seat seat, Company company) {
		// TODO - implement ClientView.reserveSeat
		throw new UnsupportedOperationException();
	}

}