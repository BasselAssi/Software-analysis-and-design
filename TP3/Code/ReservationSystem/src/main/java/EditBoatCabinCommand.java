public class EditBoatCabinCommand extends Command {
	Cabin cabin;
	public void execute() {
		this.receiver.editBoatCabin(cabin);
	}

	public void unexecute() {
		this.receiver.deleteBoatCabin(cabin);
		this.cabin = this.receiver.createBoatCabin();
	}

}