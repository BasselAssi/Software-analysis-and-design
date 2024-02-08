import java.util.Date;
import java.util.List;

public class ClientController {

	/**
	 * 
	 * @param date
	 * @param sectionType
	 * @param destinationAirport
	 * @param homeAirport
	 */
	public List<Flight> getAllAvailableFlights(Date date, PlaneTrainType sectionType, Airport destinationAirport, Airport homeAirport) {
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
	public List<TrainItinerary> getAllAvailableTrainItineraries(Date date, PlaneTrainType sectionType, Station homeStation, Station destinationStation) {
		// TODO - implement ClientController.getAllAvailableTrainItineraries
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param date
	 * @param sectionType
	 * @param homePort
	 */
	public List<BoatItinerary> getAllAvailableBoatItinerary(Date date, BoatType sectionType, Port homePort) {
		// TODO - implement ClientController.getAllAvailableBoatItinerary
		throw new UnsupportedOperationException();
	}

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
	 * @param client
	 * @param seat
	 * @param company
	 */
	public boolean reserveSeat(Client client, Seat seat, Company company) {
		return client.reserveSeat(seat, company);
	}

}