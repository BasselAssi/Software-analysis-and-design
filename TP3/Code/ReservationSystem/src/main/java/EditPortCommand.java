public class EditPortCommand extends Command {
	Port port;
	public void execute() {
		this.receiver.editPort(port);
	}

	public void unexecute() {
		this.receiver.deletePort(port);
		this.port = this.receiver.createPort();
	}

}