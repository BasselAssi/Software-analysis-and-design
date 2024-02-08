public class EditAirlineCommand extends Command {
	Airline airline;
	public void execute() {
		this.receiver.editAirline(airline);
	}

	public void unexecute() {
		this.receiver.deleteAirline(airline);
		this.airline = this.receiver.createAirline();
	}
}