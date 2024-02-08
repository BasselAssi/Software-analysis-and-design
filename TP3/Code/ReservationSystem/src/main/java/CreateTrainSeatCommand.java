public class CreateTrainSeatCommand extends Command {
	TrainSeat trainSeat;
	public void execute() {
		this.trainSeat = this.receiver.createTrainSeat();
	}

	public void unexecute() {
		this.receiver.deleteTrainSeat(trainSeat);
	}

}