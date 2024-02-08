public class CreateStationCommand extends Command {
	Station station;
	public void execute() {
		this.station = this.receiver.createStation();
	}

	public void unexecute() {
		this.receiver.deleteStation(station);
	}

}