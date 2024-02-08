public interface IPay {

	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param passportID
	 * @param creditCard
	 * @param reservation
	 */
	boolean payReservation(String firstName, String lastName, String email, String passportID, String creditCard, Reservation reservation);

	/**
	 * 
	 * @param creditCard
	 */
	boolean confirmCredit(String creditCard);

}