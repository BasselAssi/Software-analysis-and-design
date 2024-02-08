public class DeletePlaneSeatCommand extends Command {
	PlaneSeat planeSeat;
	public void execute() {
		this.receiver.deletePlaneSeat(planeSeat);
	}

	public void unexecute() {
		this.planeSeat = this.receiver.createPlaneSeat();
	}

}