public class CreatePlaneSeatCommand extends Command {
	PlaneSeat planeSeat;
	public void execute() {
		this.planeSeat = this.receiver.createPlaneSeat();
	}

	public void unexecute() {
		this.receiver.deletePlaneSeat(planeSeat);
	}

}