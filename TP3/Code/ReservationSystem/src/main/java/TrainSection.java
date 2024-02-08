import java.util.*;

public class TrainSection extends Section {

	private PlaneTrainType sectionType;

	public TrainSection(DispositionType disposition, TravelEngine travelEngine, List<Seat> seats, PlaneTrainType sectionType) {
		super(disposition, travelEngine, seats);
		this.sectionType = sectionType;
	}

	public DispositionType getDisposition() {
		return disposition;
	}

	public void setDisposition(DispositionType disposition) {
		this.disposition = disposition;
	}

	public TravelEngine getTravelEngine() {
		return travelEngine;
	}

	public void setTravelEngine(TravelEngine travelEngine) {
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