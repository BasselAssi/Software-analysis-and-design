public class EditTrainSeatCommand extends Command {
	TrainSeat trainSeat;
	TrainSeat oldTrainSeat;
	public void execute() {
		this.oldTrainSeat = this.trainSeat;
		this.receiver.editTrainSeat(trainSeat);
	}

	public void unexecute() {
		this.trainSeat = this.oldTrainSeat;
	}

}