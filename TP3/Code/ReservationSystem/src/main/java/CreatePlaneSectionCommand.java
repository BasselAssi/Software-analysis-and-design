public class CreatePlaneSectionCommand extends Command {
	PlaneSection planeSection;
	public void execute() {
		this.planeSection = this.receiver.createPlaneSection();
	}

	public void unexecute() {
		this.receiver.deletePlaneSection(planeSection);
	}

}