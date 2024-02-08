public class EditBoatItineraryCommand extends Command {
	BoatItinerary boatItinerary;
	public void execute() {
		this.receiver.editBoatItinerary(boatItinerary);
	}

	public void unexecute() {
		this.receiver.deleteBoatItinerary(boatItinerary);
		this.boatItinerary = this.receiver.createBoatItinerary();
	}

}