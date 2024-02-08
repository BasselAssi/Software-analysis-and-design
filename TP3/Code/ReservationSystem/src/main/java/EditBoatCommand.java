public class EditBoatCommand extends Command {
	Boat boat;
	public void execute() {
		this.receiver.editBoat(boat);
	}

	public void unexecute() {
		this.receiver.deleteBoat(boat);
		this.boat = this.receiver.createBoat();
	}

}