public class CreatePortCommand extends Command {
	Port port;
	public void execute() {
		this.port = this.receiver.createPort();
	}

	public void unexecute() {
		this.receiver.deletePort(port);
	}

}