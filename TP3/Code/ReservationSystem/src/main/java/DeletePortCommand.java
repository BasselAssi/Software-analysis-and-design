public class DeletePortCommand extends Command {
	Port port;
	public void execute() {
		this.receiver.deletePort(port);
	}

	public void unexecute() {
		this.port = this.receiver.createPort();
	}

}