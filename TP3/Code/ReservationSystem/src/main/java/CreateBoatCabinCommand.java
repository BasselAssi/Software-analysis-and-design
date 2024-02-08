public class CreateBoatCabinCommand extends Command {
	Cabin cabin;
	public void execute() {
		this.cabin = this.receiver.createBoatCabin();
	}

	public void unexecute() {
		this.receiver.deleteBoatCabin(cabin);
	}

}