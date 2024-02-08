import java.util.Date;

public class Reservation {

	private static int nb_reservation = 0;
	private String id;

	private Date timeReserved;

	private boolean confirmed;
	private Company company;


	private Seat seat;
	private Payment payment;

	public Reservation() {
		id = "res-" + nb_reservation;
		nb_reservation++;
	}

	/**
	 * 
	 * @param seat
	 */
	public void reserveSeat(Seat seat) {
		if (!seat.isReserved()){
			this.seat = seat;
			this.timeReserved = new Date();
		}
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Seat getSeat() {
		return seat;
	}

	public Date getTimeReserved() {
		return timeReserved;
	}

	public boolean isConfirmed() {
		return confirmed;
	}

	public void setConfirmed(boolean confirmed) {
		this.confirmed = confirmed;
	}
}