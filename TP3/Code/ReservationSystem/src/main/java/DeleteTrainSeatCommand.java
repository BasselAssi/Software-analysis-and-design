public class DeleteTrainSeatCommand extends Command {
	TrainSeat trainSeat;
	TrainSeat oldTrainSeat;
	public void execute() {
		 this.oldTrainSeat = trainSeat;
		this.receiver.deleteTrainSeat(trainSeat);
	}

	public void unexecute() {
		this.trainSeat = this.oldTrainSeat;
	}

}