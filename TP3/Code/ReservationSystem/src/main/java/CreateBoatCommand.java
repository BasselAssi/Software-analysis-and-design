public class CreateBoatCommand extends Command {
	Boat boat;
	public void execute() {
		this.boat = this.receiver.createBoat();
	}

	public void unexecute() {
		this.receiver.deleteBoat(boat);
	}

}