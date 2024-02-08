import java.util.ArrayList;
import java.util.Date;

public class TrainFactory extends AbstractFactory {

	public Company createCompany() {
		return new Trainline("0", new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
	}

	public Destination createDestination() {
		return new Station("0", "default", "default", new ArrayList<>());
	}

	public Itinerary createItinerary() {
		return new TrainItinerary("AA", new Trainline("0", new ArrayList<>(), new ArrayList<>(), new ArrayList<>()), "00", null, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
	}

	public Seat createSeat() {
		return new TrainSeat("0", 9.99, 's',5, null, new Reservation(), null, new Vacant());
	}

	public Section createSection() {
		return new TrainSection(DispositionType.S, null , null, PlaneTrainType.A);
	}

	public TravelEngine createTravelEngine() {
		return new Train("0", null, null, new ArrayList<>(), new ArrayList<>());
	}

}