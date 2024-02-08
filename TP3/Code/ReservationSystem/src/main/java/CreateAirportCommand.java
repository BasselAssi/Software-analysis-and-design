public class CreateAirportCommand extends Command {
	Airport airport;
	public void execute() {
		this.airport = this.receiver.createAirport();
	}

	public void unexecute() {
		this.receiver.deleteAirport(airport);
	}

}