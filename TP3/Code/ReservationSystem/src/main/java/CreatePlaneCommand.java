public class CreatePlaneCommand extends Command {
	Plane plane;
	public void execute() {
		this.plane = this.receiver.createPlane();
	}

	public void unexecute() {
		this.receiver.deletePlane(plane);
	}

}