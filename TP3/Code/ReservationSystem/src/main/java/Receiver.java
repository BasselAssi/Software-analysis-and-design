import java.util.List;

public interface Receiver {

	Airport createAirport();

	/**
	 * 
	 * @param airport
	 */
	boolean editAirport(Airport airport);

	/**
	 * 
	 * @param airport
	 */
	boolean deleteAirport(Airport airport);

	Flight createFlight();

	/**
	 * 
	 * @param flight
	 */
	boolean editFlight(Flight flight);

	/**
	 * 
	 * @param flight
	 */
	boolean deleteFlight(Flight flight);

	Airline createAirline();

	/**
	 * 
	 * @param airline
	 */
	boolean editAirline(Airline airline);

	/**
	 * 
	 * @param airline
	 */
	boolean deleteAirline(Airline airline);

	PlaneSection createPlaneSection();

	/**
	 * 
	 * @param planeSection
	 */
	boolean editPlaneSection(PlaneSection planeSection);

	/**
	 * 
	 * @param planeSection
	 */
	boolean deletePlaneSection(PlaneSection planeSection);

	PlaneSeat createPlaneSeat();

	/**
	 * 
	 * @param planeSeat
	 */
	boolean editPlaneSeat(PlaneSeat planeSeat);

	/**
	 * 
	 * @param planeSeat
	 */
	boolean deletePlaneSeat(PlaneSeat planeSeat);

	TrainSeat createTrainSeat();

	/**
	 *
	 * @param trainSeat
	 */
	boolean editTrainSeat(TrainSeat trainSeat);

	/**
	 *
	 * @param trainSeat
	 */
	boolean deleteTrainSeat(TrainSeat trainSeat);

	Plane createPlane();

	/**
	 * 
	 * @param plane
	 */
	boolean editPlane(Plane plane);

	/**
	 * 
	 * @param plane
	 */
	boolean deletePlane(Plane plane);

	Train createTrain();

	/**
	 * 
	 * @param train
	 */
	boolean editTrain(Train train);

	/**
	 * 
	 * @param train
	 */
	boolean deleteTrain(Train train);

	Boat createBoat();

	/**
	 * 
	 * @param boat
	 */
	boolean editBoat(Boat boat);

	/**
	 * 
	 * @param boat
	 */
	boolean deleteBoat(Boat boat);

	Trainline createTrainline();

	/**
	 * 
	 * @param trainLine
	 */
	boolean editTrainline(Trainline trainLine);

	/**
	 * 
	 * @param trainLine
	 */
	boolean deleteTrainline(Trainline trainLine);

	Cruiseline createCruiseline();

	/**
	 * 
	 * @param boatLine
	 */
	boolean editCruiseline(Cruiseline boatLine);

	/**
	 * 
	 * @param boatLine
	 */
	boolean deleteCruiseline(Cruiseline boatLine);

	BoatItinerary createBoatItinerary();

	/**
	 * 
	 * @param boatItinerary
	 */
	boolean editBoatItinerary(BoatItinerary boatItinerary);

	/**
	 * 
	 * @param boatItinerary
	 */
	boolean deleteBoatItinerary(BoatItinerary boatItinerary);

	TrainItinerary createTrainItinerary();

	/**
	 * 
	 * @param trainItinerary
	 */
	boolean editTrainItinerary(TrainItinerary trainItinerary);

	/**
	 * 
	 * @param trainItinerary
	 */
	boolean deleteTrainItinerary(TrainItinerary trainItinerary);

	Port createPort();

	/**
	 * 
	 * @param port
	 */
	boolean editPort(Port port);

	/**
	 * 
	 * @param port
	 */
	boolean deletePort(Port port);

	Station createStation();

	/**
	 * 
	 * @param station
	 */
	boolean editStation(Station station);

	/**
	 * 
	 * @param station
	 */
	boolean deleteStation(Station station);

	BoatSection createBoatSection();

	/**
	 * 
	 * @param boatSection
	 */
	boolean editBoatSection(BoatSection boatSection);

	/**
	 * 
	 * @param boatSection
	 */
	boolean deleteBoatSection(BoatSection boatSection);

	TrainSection createTrainSection();

	/**
	 * 
	 * @param trainSection
	 */
	boolean editTrainSection(TrainSection trainSection);

	/**
	 * 
	 * @param trainSection
	 */
	boolean deleteTrainSection(TrainSection trainSection);

	Cabin createBoatCabin();

	/**
	 * 
	 * @param cabin
	 */
	boolean editBoatCabin(Cabin cabin);

	/**
	 * 
	 * @param cabin
	 */
	boolean deleteBoatCabin(Cabin cabin);

	/**
	 * 
	 * @param airport
	 */
	List<Flight> listAllFlightsByAirport(Airport airport);

	/**
	 * 
	 * @param port
	 */
	List<BoatItinerary> listAllCruisesByPort(Port port);

	/**
	 * 
	 * @param station
	 */
	List<TrainItinerary> listAllTrainItineraryByStation(Station station);

	/**
	 * 
	 * @param airline
	 */
	List<Flight> listAllFlightsByAirline(Airline airline);

	/**
	 * 
	 * @param cruiseline
	 */
	List<BoatItinerary> listAllCruisesByCruiseline(Cruiseline cruiseline);

	/**
	 * 
	 * @param trainline
	 */
	List<TrainItinerary> listAllTrainItineraryByTrainline(Trainline trainline);

}