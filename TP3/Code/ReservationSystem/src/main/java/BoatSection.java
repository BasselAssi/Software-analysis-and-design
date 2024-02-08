import java.util.List;

public class BoatSection extends Section {

	private BoatType sectionType;

	public BoatSection(DispositionType disposition, TravelEngine travelEngine, List<Seat> seats, BoatType sectionType) {
		super(disposition, travelEngine, seats);
		this.sectionType = sectionType;
	}

	public List<Seat> getSeats() {
		return seats;
	}

	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}

	public TravelEngine getTravelEngine() {
		return travelEngine;
	}

	public void setTravelEngine(TravelEngine travelEngine) {
		this.travelEngine = travelEngine;
	}

	public BoatType getSectionType() {
		return sectionType;
	}

	public void setSectionType(BoatType sectionType) {
		this.sectionType = sectionType;
	}
}