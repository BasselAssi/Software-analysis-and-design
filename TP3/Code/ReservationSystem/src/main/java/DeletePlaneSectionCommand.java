public class DeletePlaneSectionCommand extends Command {
	PlaneSection planeSection;
	public void execute() {
		this.receiver.deletePlaneSection(planeSection);
	}

	public void unexecute() {
		this.planeSection = this.receiver.createPlaneSection();
	}

}