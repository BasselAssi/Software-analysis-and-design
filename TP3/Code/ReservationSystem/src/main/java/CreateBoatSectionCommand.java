public class CreateBoatSectionCommand extends Command {
	BoatSection boatSection;
	public void execute() {
		this.boatSection = this.receiver.createBoatSection();
	}

	public void unexecute() {
		this.receiver.deleteBoatSection(boatSection);
	}

}