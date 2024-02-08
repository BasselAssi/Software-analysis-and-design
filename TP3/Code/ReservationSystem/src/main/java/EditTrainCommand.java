public class EditTrainCommand extends Command {
	Train train;
	public void execute() {
		this.receiver.editTrain(train);
	}

	public void unexecute() {
		this.receiver.deleteTrain(train);
		this.train = this.receiver.createTrain();
	}
}