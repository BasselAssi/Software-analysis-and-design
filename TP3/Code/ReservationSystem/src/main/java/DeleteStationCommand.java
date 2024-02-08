public class DeleteStationCommand extends Command {
	Station station;
	public void execute() {
		this.receiver.deleteStation(station);
	}

	public void unexecute() {
		this.station = this.receiver.createStation();
	}

}