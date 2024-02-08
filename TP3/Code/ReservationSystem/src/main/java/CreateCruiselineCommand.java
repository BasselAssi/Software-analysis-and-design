public class CreateCruiselineCommand extends Command {
	Cruiseline cruiseline;
	public void execute() {
		this.cruiseline = this.receiver.createCruiseline();
	}

	public void unexecute() {
		this.receiver.deleteCruiseline(cruiseline);
	}

}