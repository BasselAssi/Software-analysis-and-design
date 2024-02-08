public class EditTrainItineraryCommand extends Command {
	TrainItinerary trainItinerary;
	public void execute() {
		this.receiver.editTrainItinerary(trainItinerary);
	}

	public void unexecute() {
		this.receiver.deleteTrainItinerary(trainItinerary);
		this.trainItinerary = this.receiver.createTrainItinerary();
	}
}