import java.util.Date;

public class Reservation {

	private String id;
	private java.util.Date timeReserved;
	private boolean confirmed;
	private IPay payment;
	private static int nb_reservation = 0;
	private Company company;
	private Seat seat;

	public java.util.Date getTimeReserved() {
		return this.timeReserved;
	}

	public boolean isConfirmed() {
		return this.confirmed;
	}

	public void setConfirmed(boolean confirmed) {
		this.confirmed = confirmed;
	}

	public Company getCompany() {
		return this.company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Seat getSeat() {
		return this.seat;
	}

	/**
	 * 
	 * @param seat
	 */
	public void reserveSeat(Seat seat) {
		// TODO - implement Reservation.reserveSeat
		throw new UnsupportedOperationException();
	}

	public Reservation() {
		// TODO - implement Reservation.Reservation
		throw new UnsupportedOperationException();
	}

	public boolean isPaid() {
		// TODO - implement Reservation.isPaid
		throw new UnsupportedOperationException();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setTimeReserved(Date timeReserved) {
		this.timeReserved = timeReserved;
	}

	public IPay getPayment() {
		return payment;
	}

	public void setPayment(IPay payment) {
		this.payment = payment;
	}

	public static int getNb_reservation() {
		return nb_reservation;
	}

	public static void setNb_reservation(int nb_reservation) {
		Reservation.nb_reservation = nb_reservation;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}
}