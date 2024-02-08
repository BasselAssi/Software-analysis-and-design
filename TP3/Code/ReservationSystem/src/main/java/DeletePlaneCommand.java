public class DeletePlaneCommand extends Command {
	Plane plane;
	public void execute() {
		this.receiver.deletePlane(plane);
	}

	public void unexecute() {
		this.plane = this.receiver.createPlane();
	}

}