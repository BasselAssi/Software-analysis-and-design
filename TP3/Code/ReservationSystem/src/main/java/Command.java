public abstract class Command {
	protected Receiver receiver;
	public abstract void execute();

	public abstract void unexecute();

}