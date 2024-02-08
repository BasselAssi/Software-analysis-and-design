public class EditTrainSectionCommand extends Command {
	TrainSection trainSection;
	TrainSection oldTrainSection;
	public void execute() {
		this.oldTrainSection = trainSection;
		this.receiver.editTrainSection(trainSection);
	}

	public void unexecute() {
		this.trainSection = this.oldTrainSection;
	}

}