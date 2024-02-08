import java.util.List;

public class Client {

	private String id;
	private String firstName;
	private String lastName;
	private String email;
	private List<Reservation> reservations;
	private List<Payment> payments;

	/**
	 * @param seat
	 * @param company
	 */
	public boolean reserveSeat(Seat seat, Company company) {
		Reservation reservation = new Reservation();
		reservation.setCompany(company);
		reservation.reserveSeat(seat);
		reservations.add(reservation);
		return true;
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
		// TODO - implement Client.payReservation
		throw new UnsupportedOperationException();
	}

}