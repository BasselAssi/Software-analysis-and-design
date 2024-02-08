public abstract class AbstractFactory {

	public abstract Company createCompany();

	public abstract Destination createDestination();

	public abstract Itinerary createItinerary();

	public abstract Seat createSeat();

	public abstract Section createSection();

	public abstract TravelEngine createTravelEngine();

}