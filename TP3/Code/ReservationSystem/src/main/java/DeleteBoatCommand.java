public class DeleteBoatCommand extends Command {
	Boat boat;
	public void execute() {
		this.receiver.deleteBoat(boat);
	}

	public void unexecute() {
		this.boat = this.receiver.createBoat();
	}

}