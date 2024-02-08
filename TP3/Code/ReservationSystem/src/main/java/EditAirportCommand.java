public class EditAirportCommand extends Command {

	Airport airport;
	public void execute() {
		this.receiver.editAirport(airport);
	}

	public void unexecute() {
		this.receiver.deleteAirport(airport);
		this.airport = this.receiver.createAirport();
	}

}