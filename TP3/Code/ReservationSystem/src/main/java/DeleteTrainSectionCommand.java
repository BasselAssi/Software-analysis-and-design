public class DeleteTrainSectionCommand extends Command {
	TrainSection trainSection;
	public void execute() {
		this.receiver.deleteTrainSection(trainSection);
	}

	public void unexecute() {
		this.trainSection = this.receiver.createTrainSection();
	}

}