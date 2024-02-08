import java.util.List;

public class AdminController implements Receiver {

	public Airport createAirport() {
		DatabaseConnector.getInstance().getRepository().destinations.get("Plane").add(FactoryConnector.getInstance().getPlaneFactory().createDestination());
		return (Airport) DatabaseConnector.getInstance().getRepository().destinations.get("Plane").get(DatabaseConnector.getInstance().getRepository().destinations.get("Plane").size()-1);
	}

	/**
	 * 
	 * @param airport
	 */
	public boolean editAirport(Airport airport) {
		DatabaseConnector.getInstance().getRepository().setDestinations(DatabaseConnector.getInstance().getRepository().destinations.get("Plane"));
		return true;
	}

	/**
	 * 
	 * @param airport
	 */
	public boolean deleteAirport(Airport airport) {
		return DatabaseConnector.getInstance().getRepository().destinations.get("Plane").remove(airport);
	}

	public Flight createFlight() {
		DatabaseConnector.getInstance().getRepository().itineraries.get("Plane").add(FactoryConnector.getInstance().getPlaneFactory().createItinerary());
		return (Flight) DatabaseConnector.getInstance().getRepository().itineraries.get("Plane").get(DatabaseConnector.getInstance().getRepository().itineraries.get("Plane").size()-1);
	}

	/**
	 * 
	 * @param flight
	 */
	public boolean editFlight(Flight flight) {
		DatabaseConnector.getInstance().getRepository().setItineraries(DatabaseConnector.getInstance().getRepository().itineraries.get("Plane"));
		return true;
	}

	/**
	 * 
	 * @param flight
	 */
	public boolean deleteFlight(Flight flight) {
		return DatabaseConnector.getInstance().getRepository().itineraries.get("Plane").remove(flight);
	}

	// We have to save the Airline into the database for ulterior uses
	public Airline createAirline() {
		DatabaseConnector.getInstance().getRepository().companies.get("Plane").add(FactoryConnector.getInstance().getPlaneFactory().createCompany());
		return (Airline) DatabaseConnector.getInstance().getRepository().companies.get("Plane").get(DatabaseConnector.getInstance().getRepository().companies.get("Plane").size()-1);
	}

	/**
	 * 
	 * @param airline
	 */
	public boolean editAirline(Airline airline) {
		DatabaseConnector.getInstance().getRepository().setCompanies(DatabaseConnector.getInstance().getRepository().companies.get("Plane"));
		return true;
	}

	/**
	 * 
	 * @param airline
	 */
	public boolean deleteAirline(Airline airline) {
		return DatabaseConnector.getInstance().getRepository().companies.get("Plane").remove(airline);
	}

	public PlaneSection createPlaneSection() {
		DatabaseConnector.getInstance().getRepository().sections.get("Plane").add(FactoryConnector.getInstance().getPlaneFactory().createSection());
		return (PlaneSection) DatabaseConnector.getInstance().getRepository().sections.get("Plane").get(DatabaseConnector.getInstance().getRepository().sections.get("Plane").size()-1);
	}

	/**
	 * 
	 * @param planeSection
	 */
	public boolean editPlaneSection(PlaneSection planeSection) {
		DatabaseConnector.getInstance().getRepository().setSections(DatabaseConnector.getInstance().getRepository().sections.get("Plane"));
		return true;
	}

	/**
	 * 
	 * @param planeSection
	 */
	public boolean deletePlaneSection(PlaneSection planeSection) {
		return DatabaseConnector.getInstance().getRepository().sections.get("Plane").remove(planeSection);
	}

	public PlaneSeat createPlaneSeat() {
		DatabaseConnector.getInstance().getRepository().seats.get("Plane").add(FactoryConnector.getInstance().getPlaneFactory().createSeat());
		return (PlaneSeat) DatabaseConnector.getInstance().getRepository().seats.get("Plane").get(DatabaseConnector.getInstance().getRepository().seats.get("Plane").size()-1);
	}

	/**
	 * 
	 * @param planeSeat
	 */
	public boolean editPlaneSeat(PlaneSeat planeSeat) {
		DatabaseConnector.getInstance().getRepository().setSeats(DatabaseConnector.getInstance().getRepository().seats.get("Plane"));
		return true;
	}

	/**
	 * 
	 * @param planeSeat
	 */
	public boolean deletePlaneSeat(PlaneSeat planeSeat) {
		return DatabaseConnector.getInstance().getRepository().seats.get("Plane").remove(planeSeat);
	}

	public Plane createPlane() {
		DatabaseConnector.getInstance().getRepository().travelEngines.get("Plane").add(FactoryConnector.getInstance().getPlaneFactory().createTravelEngine());
		return (Plane) DatabaseConnector.getInstance().getRepository().travelEngines.get("Plane").get(DatabaseConnector.getInstance().getRepository().travelEngines.get("Plane").size()-1);
	}

	/**
	 * 
	 * @param plane
	 */
	public boolean editPlane(Plane plane) {
		DatabaseConnector.getInstance().getRepository().setTravelEngines(DatabaseConnector.getInstance().getRepository().travelEngines.get("Plane"));
		return true;
	}

	/**
	 * 
	 * @param plane
	 */
	public boolean deletePlane(Plane plane) {
		return DatabaseConnector.getInstance().getRepository().travelEngines.get("Plane").remove(plane);
	}

	public Train createTrain() {
		DatabaseConnector.getInstance().getRepository().travelEngines.get("Train").add(FactoryConnector.getInstance().getTrainFactory().createTravelEngine());
		return (Train) DatabaseConnector.getInstance().getRepository().travelEngines.get("Train").get(DatabaseConnector.getInstance().getRepository().travelEngines.get("Train").size()-1);
	}

	/**
	 * 
	 * @param train
	 */
	public boolean editTrain(Train train) {
		DatabaseConnector.getInstance().getRepository().setTravelEngines(DatabaseConnector.getInstance().getRepository().travelEngines.get("Train"));
		return true;
	}

	/**
	 * 
	 * @param train
	 */
	public boolean deleteTrain(Train train) {
		return DatabaseConnector.getInstance().getRepository().travelEngines.get("Train").remove(train);
	}

	public Boat createBoat() {
		DatabaseConnector.getInstance().getRepository().travelEngines.get("Boat").add(FactoryConnector.getInstance().getBoatFactory().createTravelEngine());
		return (Boat) DatabaseConnector.getInstance().getRepository().travelEngines.get("Boat").get(DatabaseConnector.getInstance().getRepository().travelEngines.get("Boat").size()-1);
	}

	/**
	 * 
	 * @param boat
	 */
	public boolean editBoat(Boat boat) {
		DatabaseConnector.getInstance().getRepository().setTravelEngines(DatabaseConnector.getInstance().getRepository().travelEngines.get("Boat"));
		return true;
	}

	/**
	 * 
	 * @param boat
	 */
	public boolean deleteBoat(Boat boat) {
		return DatabaseConnector.getInstance().getRepository().travelEngines.get("Boat").remove(boat);
	}

	public Trainline createTrainline() {
		DatabaseConnector.getInstance().getRepository().companies.get("Train").add(FactoryConnector.getInstance().getTrainFactory().createCompany());
		return (Trainline) DatabaseConnector.getInstance().getRepository().companies.get("Train").get(DatabaseConnector.getInstance().getRepository().companies.get("Train").size()-1);
	}

	/**
	 * 
	 * @param trainLine
	 */
	public boolean editTrainline(Trainline trainLine) {
		DatabaseConnector.getInstance().getRepository().setCompanies(DatabaseConnector.getInstance().getRepository().companies.get("Train"));
		return true;
	}

	/**
	 * 
	 * @param trainLine
	 */
	public boolean deleteTrainline(Trainline trainLine) {
		return DatabaseConnector.getInstance().getRepository().companies.get("Train").remove(trainLine);
	}

	public Cruiseline createCruiseline() {
		DatabaseConnector.getInstance().getRepository().companies.get("Boat").add(FactoryConnector.getInstance().getBoatFactory().createCompany());
		return (Cruiseline) DatabaseConnector.getInstance().getRepository().companies.get("Boat").get(DatabaseConnector.getInstance().getRepository().companies.get("Boat").size()-1);
	}

	/**
	 * 
	 * @param boatLine
	 */
	public boolean editCruiseline(Cruiseline boatLine) {
		DatabaseConnector.getInstance().getRepository().setCompanies(DatabaseConnector.getInstance().getRepository().companies.get("Boat"));
		return true;
	}

	/**
	 * 
	 * @param boatLine
	 */
	public boolean deleteCruiseline(Cruiseline boatLine) {
		return DatabaseConnector.getInstance().getRepository().companies.get("Boat").remove(boatLine);
	}

	public BoatItinerary createBoatItinerary() {
		DatabaseConnector.getInstance().getRepository().itineraries.get("Boat").add(FactoryConnector.getInstance().getBoatFactory().createItinerary());
		return (BoatItinerary) DatabaseConnector.getInstance().getRepository().itineraries.get("Boat").get(DatabaseConnector.getInstance().getRepository().itineraries.get("Boat").size()-1);
	}

	/**
	 * 
	 * @param boatItinerary
	 */
	public boolean editBoatItinerary(BoatItinerary boatItinerary) {
		DatabaseConnector.getInstance().getRepository().setItineraries(DatabaseConnector.getInstance().getRepository().itineraries.get("Boat"));
		return true;
	}

	/**
	 * 
	 * @param boatItinerary
	 */
	public boolean deleteBoatItinerary(BoatItinerary boatItinerary) {
		return DatabaseConnector.getInstance().getRepository().itineraries.get("Boat").remove(boatItinerary);
	}

	public TrainItinerary createTrainItinerary() {
		DatabaseConnector.getInstance().getRepository().itineraries.get("Train").add(FactoryConnector.getInstance().getTrainFactory().createItinerary());
		return (TrainItinerary) DatabaseConnector.getInstance().getRepository().itineraries.get("Train").get(DatabaseConnector.getInstance().getRepository().itineraries.get("Train").size()-1);
	}

	/**
	 * 
	 * @param trainItinerary
	 */
	public boolean editTrainItinerary(TrainItinerary trainItinerary) {
		DatabaseConnector.getInstance().getRepository().setItineraries(DatabaseConnector.getInstance().getRepository().itineraries.get("train"));
		return true;
	}

	/**
	 * 
	 * @param trainItinerary
	 */
	public boolean deleteTrainItinerary(TrainItinerary trainItinerary) {
		return DatabaseConnector.getInstance().getRepository().seats.get("Train").remove(trainItinerary);
	}

	public TrainSeat createTrainSeat() {
		DatabaseConnector.getInstance().getRepository().seats.get("Train").add(FactoryConnector.getInstance().getTrainFactory().createSeat());
		return (TrainSeat) DatabaseConnector.getInstance().getRepository().seats.get("Train").get(DatabaseConnector.getInstance().getRepository().seats.get("Train").size()-1);
	}

	/**
	 *
	 * @param trainSeat
	 */
	public boolean editTrainSeat(TrainSeat trainSeat) {
		DatabaseConnector.getInstance().getRepository().setSeats(DatabaseConnector.getInstance().getRepository().seats.get("train"));
		return true;
	}

	/**
	 *
	 * @param trainSeat
	 */
	public boolean deleteTrainSeat(TrainSeat trainSeat) {
		return DatabaseConnector.getInstance().getRepository().seats.get("Train").remove(trainSeat);
	}

	public Port createPort() {
		DatabaseConnector.getInstance().getRepository().destinations.get("Boat").add(FactoryConnector.getInstance().getBoatFactory().createDestination());
		return (Port) DatabaseConnector.getInstance().getRepository().destinations.get("Boat").get(DatabaseConnector.getInstance().getRepository().destinations.get("Boat").size()-1);
	}

	/**
	 * 
	 * @param port
	 */
	public boolean editPort(Port port) {
		DatabaseConnector.getInstance().getRepository().setDestinations(DatabaseConnector.getInstance().getRepository().destinations.get("Boat"));
		return true;
	}

	/**
	 * 
	 * @param port
	 */
	public boolean deletePort(Port port) {
		return DatabaseConnector.getInstance().getRepository().destinations.get("Boat").remove(port);
	}

	public Station createStation() {
		DatabaseConnector.getInstance().getRepository().destinations.get("Train").add(FactoryConnector.getInstance().getTrainFactory().createDestination());
		return (Station) DatabaseConnector.getInstance().getRepository().destinations.get("Train").get(DatabaseConnector.getInstance().getRepository().destinations.get("Train").size()-1);
	}

	/**
	 * 
	 * @param station
	 */
	public boolean editStation(Station station) {
		DatabaseConnector.getInstance().getRepository().setDestinations(DatabaseConnector.getInstance().getRepository().destinations.get("train"));
		return true;
	}

	/**
	 * 
	 * @param station
	 */
	public boolean deleteStation(Station station) {
		return DatabaseConnector.getInstance().getRepository().destinations.get("Train").remove(station);
	}

	public BoatSection createBoatSection() {
		DatabaseConnector.getInstance().getRepository().sections.get("Boat").add(FactoryConnector.getInstance().getBoatFactory().createSection());
		return (BoatSection) DatabaseConnector.getInstance().getRepository().sections.get("Boat").get(DatabaseConnector.getInstance().getRepository().sections.get("Boat").size()-1);
	}

	/**
	 * 
	 * @param boatSection
	 */
	public boolean editBoatSection(BoatSection boatSection) {
		DatabaseConnector.getInstance().getRepository().setSections(DatabaseConnector.getInstance().getRepository().sections.get("Boat"));
		return true;
	}

	/**
	 * 
	 * @param boatSection
	 */
	public boolean deleteBoatSection(BoatSection boatSection) {
		return DatabaseConnector.getInstance().getRepository().sections.get("Boat").remove(boatSection);
	}

	public TrainSection createTrainSection() {
		DatabaseConnector.getInstance().getRepository().sections.get("Train").add(FactoryConnector.getInstance().getTrainFactory().createSection());
		return (TrainSection) DatabaseConnector.getInstance().getRepository().sections.get("Train").get(DatabaseConnector.getInstance().getRepository().sections.get("Train").size()-1);
	}

	/**
	 * 
	 * @param trainSection
	 */
	public boolean editTrainSection(TrainSection trainSection) {
		DatabaseConnector.getInstance().getRepository().setSections(DatabaseConnector.getInstance().getRepository().sections.get("Train"));
		return true;
	}

	/**
	 * 
	 * @param trainSection
	 */
	public boolean deleteTrainSection(TrainSection trainSection) {
		return DatabaseConnector.getInstance().getRepository().sections.get("Train").remove(trainSection);
	}

	public Cabin createBoatCabin() {
		DatabaseConnector.getInstance().getRepository().seats.get("Boat").add(FactoryConnector.getInstance().getBoatFactory().createSeat());
		return (Cabin) DatabaseConnector.getInstance().getRepository().seats.get("Boat").get(DatabaseConnector.getInstance().getRepository().seats.get("Boat").size()-1);
	}

	/**
	 * 
	 * @param cabin
	 */
	public boolean editBoatCabin(Cabin cabin) {
		DatabaseConnector.getInstance().getRepository().setSeats(DatabaseConnector.getInstance().getRepository().seats.get("Boat"));
		return true;
	}

	/**
	 * 
	 * @param cabin
	 */
	public boolean deleteBoatCabin(Cabin cabin) {
		return DatabaseConnector.getInstance().getRepository().seats.get("Boat").remove(cabin);
	}

	/**
	 * 
	 * @param airport
	 */
	public List listAllFlightsByAirport(Airport airport) {
		// TODO - implement AdminController.listAllFlightsByAirport
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param port
	 */
	public List<BoatItinerary> listAllCruisesByPort(Port port) {
		// TODO - implement AdminController.listAllCruisesByPort
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param station
	 */
	public List<TrainItinerary> listAllTrainItineraryByStation(Station station) {
		// TODO - implement AdminController.listAllTrainItineraryByStation
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param airline
	 */
	public List<Flight> listAllFlightsByAirline(Airline airline) {
		// TODO - implement AdminController.listAllFlightsByAirline
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param cruiseline
	 */
	public List<BoatItinerary> listAllCruisesByCruiseline(Cruiseline cruiseline) {
		// TODO - implement AdminController.listAllCruisesByCruiseline
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param trainline
	 */
	public List<TrainItinerary> listAllTrainItineraryByTrainline(Trainline trainline) {
		// TODO - implement AdminController.listAllTrainItineraryByTrainline
		throw new UnsupportedOperationException();
	}

}