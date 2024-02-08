public class DeleteTrainItineraryCommand extends Command {
	TrainItinerary trainItinerary;
	public void execute() {
		this.receiver.deleteTrainItinerary(trainItinerary);
	}

	public void unexecute() {
		this.trainItinerary = this.receiver.createTrainItinerary();
	}

}