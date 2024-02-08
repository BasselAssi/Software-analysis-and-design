public class DeleteBoatItineraryCommand extends Command {
	BoatItinerary boatItinerary;
	public void execute() {
		this.receiver.deleteBoatItinerary(boatItinerary);
	}

	public void unexecute() {
		this.boatItinerary = this.receiver.createBoatItinerary();
	}

}