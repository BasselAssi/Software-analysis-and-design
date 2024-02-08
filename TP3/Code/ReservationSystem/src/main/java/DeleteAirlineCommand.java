public class DeleteAirlineCommand extends Command {
	Airline airline;
	public void execute() {
		this.receiver.deleteAirline(airline);
	}

	public void unexecute() {
		this.airline = this.receiver.createAirline();
	}

}