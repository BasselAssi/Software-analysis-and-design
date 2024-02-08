public class EditBoatSectionCommand extends Command {
	BoatSection boatSection;
	public void execute() {
		this.receiver.editBoatSection(boatSection);
	}

	public void unexecute() {
		this.receiver.deleteBoatSection(boatSection);
		this.boatSection = this.receiver.createBoatSection();
	}

}