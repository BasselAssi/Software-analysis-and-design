import java.util.ArrayList;
import java.util.Date;

public class PlaneFactory extends AbstractFactory {

	public Company createCompany() {
		return new Airline("0", new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
	}

	public Destination createDestination() {
		return new Airport("0", "default", "default", new ArrayList<>());
	}

	public Itinerary createItinerary() {
		return new Flight("AA", new Airline("0", new ArrayList<>(), new ArrayList<>(), new ArrayList<>()), "00", null, new ArrayList<>(), new Date(), new Date());
	}

	public Seat createSeat() {
		return new PlaneSeat("0", 9.99, 's', 5, null, new Reservation(), null, new Vacant());
	}

	public Section createSection() {
		return new PlaneSection(DispositionType.S, null , null, PlaneTrainType.A);
	}

	public TravelEngine createTravelEngine() {
		return new Plane("0", null, null, new ArrayList<>(), new ArrayList<>());
	}

}