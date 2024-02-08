public class EditFlightCommand extends Command {
	Flight flight;
	public void execute() {
		this.receiver.editFlight(flight);
	}

	public void unexecute() {
		this.receiver.deleteFlight(flight);
		this.flight = this.receiver.createFlight();
	}

}