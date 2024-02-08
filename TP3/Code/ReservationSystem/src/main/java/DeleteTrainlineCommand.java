public class DeleteTrainlineCommand extends Command {
	Trainline trainline;
	public void execute() {
		this.receiver.deleteTrainline(trainline);
	}

	public void unexecute() {
		this.trainline = this.receiver.createTrainline();
	}

}