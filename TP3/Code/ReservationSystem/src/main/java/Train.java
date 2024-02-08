import java.util.*;

public class Train extends TravelEngine {

	public Train(String id, Company company, Itinerary itinerary, List<Section> sections, List<Seat> seats) {
		super(id, company, itinerary, sections, seats);
	}

	/**
	 * 
	 * @param v
	 */
	public void accept(IVisitor v) {
		// TODO - implement Train.accept
		throw new UnsupportedOperationException();
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Trainline company) {
		this.company = company;
	}

	public Itinerary getItinerary() {
		return itinerary;
	}

	public void setItinerary(TrainItinerary itinerary) {
		this.itinerary = itinerary;
	}

	public List<Section> getSections() {
		return sections;
	}

	public void setSections(List<Section> sections) {
		this.sections = sections;
	}

	public List<Seat> getSeats() {
		return seats;
	}

	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}
}