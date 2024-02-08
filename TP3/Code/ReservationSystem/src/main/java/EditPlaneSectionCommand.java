public class EditPlaneSectionCommand extends Command {
	PlaneSection planeSection;
	public void execute() {
		this.receiver.editPlaneSection(planeSection);
	}

	public void unexecute() {
		this.receiver.deletePlaneSection(planeSection);
		this.planeSection = this.receiver.createPlaneSection();
	}

}