public class ClientController {

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
		// TODO - implement ClientController.payReservation
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
		// TODO - implement ClientController.getAllAvailableFlights
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
		// TODO - implement ClientController.getAllAvailableTrainItineraries
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param date
	 * @param sectionType
	 * @param homePort
	 */
	public java.util.List<BoatItinerary> getAllAvailableBoatItineraries(java.util.Date date, BoatType sectionType, Port homePort) {
		// TODO - implement ClientController.getAllAvailableBoatItineraries
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param client
	 * @param seat
	 * @param company
	 */
	public boolean reserveSeat(Client client, Seat seat, Company company) {
		// TODO - implement ClientController.reserveSeat
		throw new UnsupportedOperationException();
	}

}