public class DeleteTrainCommand extends Command {
	Train train;
	public void execute() {
		this.receiver.deleteTrain(train);
	}

	public void unexecute() {
		this.train = this.receiver.createTrain();
	}

}