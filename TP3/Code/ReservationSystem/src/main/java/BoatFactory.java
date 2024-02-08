import java.util.ArrayList;
import java.util.Date;

public class BoatFactory extends AbstractFactory {

	public Company createCompany() {
		return new Cruiseline("0", new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
	}

	public Destination createDestination() {
		return new Port("0", "default", "default", new ArrayList<>());
	}

	public Itinerary createItinerary() {
		return new BoatItinerary("AA", new Cruiseline("0", new ArrayList<>(), new ArrayList<>(), new ArrayList<>()), "00", null, new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), 0);
	}

	public Seat createSeat() {
		return new Cabin("0", 9.99, 's', 5, null, new Reservation(), null, new Vacant());
	}

	public Section createSection() {
		return new BoatSection(DispositionType.S, null , null, BoatType.D);
	}

	public TravelEngine createTravelEngine() {
		return new Boat("0", null, null, new ArrayList<>(), new ArrayList<>());
	}

}