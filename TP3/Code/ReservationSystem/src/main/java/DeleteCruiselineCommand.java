public class DeleteCruiselineCommand extends Command {
	Cruiseline cruiseline;
	public void execute() {
		this.receiver.deleteCruiseline(cruiseline);
	}

	public void unexecute() {
		this.cruiseline = this.receiver.createCruiseline();
	}

}