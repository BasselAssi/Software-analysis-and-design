import java.util.*;

public class PlaneSection extends Section {
	private PlaneTrainType sectionType;

	public PlaneSection(DispositionType disposition, TravelEngine travelEngine, List<Seat> seats, PlaneTrainType sectionType) {
		super(disposition, travelEngine, seats);
		this.sectionType = sectionType;
	}


	public TravelEngine getTravelEngine() {
		return travelEngine;
	}

	public void setTravelEngine(Plane travelEngine) {
		this.travelEngine = travelEngine;
	}

	public PlaneTrainType getSectionType() {
		return sectionType;
	}

	public void setSectionType(PlaneTrainType sectionType) {
		this.sectionType = sectionType;
	}

	public List<Seat> getSeats() {
		return seats;
	}

	public void setSeats(List<Seat> seats) {
		this.seats = seats;
	}
}