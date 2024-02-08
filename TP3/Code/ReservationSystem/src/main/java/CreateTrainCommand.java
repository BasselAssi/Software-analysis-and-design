public class CreateTrainCommand extends Command {
	Train train;
	public void execute() {
		this.train = this.receiver.createTrain();
	}

	public void unexecute() {
		this.receiver.deleteTrain(train);
	}

}