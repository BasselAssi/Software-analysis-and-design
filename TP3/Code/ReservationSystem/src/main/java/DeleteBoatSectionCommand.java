public class DeleteBoatSectionCommand extends Command {
	BoatSection boatSection;
	public void execute() {
		this.receiver.deleteBoatSection(boatSection);
	}

	public void unexecute() {
		this.boatSection = this.receiver.createBoatSection();
	}

}