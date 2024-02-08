public class EditPlaneCommand extends Command {
	Plane plane;
	public void execute() {
		this.receiver.editPlane(plane);
	}

	public void unexecute() {
		this.receiver.deletePlane(plane);
		this.plane = this.receiver.createPlane();
	}

}