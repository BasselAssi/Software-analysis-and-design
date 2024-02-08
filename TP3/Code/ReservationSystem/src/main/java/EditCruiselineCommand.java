public class EditCruiselineCommand extends Command {
	Cruiseline cruiseline;
	public void execute() {
		this.receiver.editCruiseline(cruiseline);
	}

	public void unexecute() {
		this.receiver.deleteCruiseline(cruiseline);
		this.cruiseline = this.receiver.createCruiseline();
	}

}