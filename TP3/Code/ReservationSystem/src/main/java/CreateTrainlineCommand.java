public class CreateTrainlineCommand extends Command {
	Trainline trainline;

	public void execute() {
		this.trainline = this.receiver.createTrainline();
	}

	public void unexecute() {
		this.receiver.deleteTrainline(trainline);
	}

}