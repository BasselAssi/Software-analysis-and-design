public class DeleteAirportCommand extends Command {
	Airport airport;
	public void execute() {
		this.receiver.deleteAirport(airport);
	}

	public void unexecute() {
		this.airport = this.receiver.createAirport();
	}

}