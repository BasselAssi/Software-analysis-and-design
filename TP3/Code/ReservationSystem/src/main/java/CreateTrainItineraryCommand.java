public class CreateTrainItineraryCommand extends Command {
	TrainItinerary trainItinerary;
	public void execute() {
		this.trainItinerary = this.receiver.createTrainItinerary();
	}

	public void unexecute() {
		this.receiver.deleteTrainItinerary(trainItinerary);
	}

}