public class CreateFlightCommand extends Command {
	Flight flight;
	public void execute() {
		this.flight = this.receiver.createFlight();
	}

	public void unexecute() {
		this.receiver.deleteFlight(flight);
	}

}