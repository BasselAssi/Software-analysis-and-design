public class DeleteFlightCommand extends Command {
	Flight flight;
	public void execute() {
		this.receiver.deleteFlight(flight);
	}

	public void unexecute() {
		this.flight = this.receiver.createFlight();
	}

}