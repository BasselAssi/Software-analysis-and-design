public class Payment implements IPay {

	private Reservation reservation;

	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param passportID
	 * @param creditCard
	 * @param reservation
	 */
	public boolean payReservation(String firstName, String lastName, String email, String passportID, String creditCard, Reservation reservation) {
		// TODO - implement Payment.payReservation
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param creditCard
	 */
	private boolean confirmCredit(String creditCard) {
		// TODO - implement Payment.confirmCredit
		throw new UnsupportedOperationException();
	}

}