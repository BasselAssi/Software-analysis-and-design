import java.util.*;

public class Client {

	private String id;
	private String firstName;
	private String lastName;
	private String passport;
	private String email;
	private List<Reservation> reservations;
	private List<IPay> payments;

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

	/**
	 * 
	 * @param seat
	 * @param company
	 */
	public boolean reserveSeat(Seat seat, Company company) {
		// TODO - implement Client.reserveSeat
		throw new UnsupportedOperationException();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassport() {
		return passport;
	}

	public void setPassport(String passport) {
		this.passport = passport;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	public List<IPay> getPayments() {
		return payments;
	}

	public void setPayments(List<IPay> payments) {
		this.payments = payments;
	}
}