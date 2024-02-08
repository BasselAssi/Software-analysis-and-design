import java.util.*;

public class Plane extends TravelEngine {

	public Plane(String id, Company company, Itinerary itinerary, List<Section> sections, List<Seat> seats) {
		super(id, company, itinerary, sections, seats);
	}

	/**
	 * 
	 * @param v
	 */
	public void accept(IVisitor v) {
		// TODO - implement Plane.accept
		throw new UnsupportedOperationException();
	}


	public Company getCompany() {
		return company;
	}

	public void setCompany(Airline company) {
		this.company = company;
	}

	public Itinerary getItinerary() {
		return itinerary;
	}

	public void setItinerary(Flight itinerary) {
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