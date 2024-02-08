public class DeleteBoatCabinCommand extends Command {
	Cabin cabin;
	public void execute() {
		this.receiver.deleteBoatCabin(cabin);
	}

	public void unexecute() {
		this.cabin = this.receiver.createBoatCabin();
	}

}