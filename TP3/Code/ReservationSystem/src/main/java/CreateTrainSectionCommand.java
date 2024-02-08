public class CreateTrainSectionCommand extends Command {
	TrainSection trainSection;
	public void execute() {
		this.trainSection = this.receiver.createTrainSection();
	}

	public void unexecute() {
		this.receiver.deleteTrainSection(trainSection);
	}

}