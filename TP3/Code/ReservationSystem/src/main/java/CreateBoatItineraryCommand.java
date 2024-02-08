public class CreateBoatItineraryCommand extends Command {
	BoatItinerary boatItinerary;
	public void execute() {
		this.boatItinerary = this.receiver.createBoatItinerary();
	}

	public void unexecute() {
		this.receiver.deleteBoatItinerary(boatItinerary);
	}

}