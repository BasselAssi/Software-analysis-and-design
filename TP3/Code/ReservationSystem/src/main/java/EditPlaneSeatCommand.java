public class EditPlaneSeatCommand extends Command {
	PlaneSeat planeSeat;
	public void execute() {
		this.receiver.editPlaneSeat(planeSeat);
	}

	public void unexecute() {
		this.receiver.deletePlaneSeat(planeSeat);
		this.planeSeat = this.receiver.createPlaneSeat();
	}

}