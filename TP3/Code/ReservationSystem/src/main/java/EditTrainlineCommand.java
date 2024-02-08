public class EditTrainlineCommand extends Command {
	Trainline trainline;
	public void execute() {
		this.receiver.editTrainline(trainline);
	}

	public void unexecute() {
		this.receiver.deleteTrainline(trainline);
		this.trainline = this.receiver.createTrainline();
	}

}