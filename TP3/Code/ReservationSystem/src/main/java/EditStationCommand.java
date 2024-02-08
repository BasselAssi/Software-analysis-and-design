public class EditStationCommand extends Command {
	Station station;
	public void execute() {
		this.receiver.editStation(station);
	}

	public void unexecute() {
		this.receiver.deleteStation(station);
		this.station = this.receiver.createStation();
	}

}