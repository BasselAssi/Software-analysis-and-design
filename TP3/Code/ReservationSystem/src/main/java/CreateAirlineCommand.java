public class CreateAirlineCommand extends Command {
	// Ceci est l'état qu'on veut sauvegarder
	Airline airline;
	// Dans cette méthode, on veut seulement appeler le controleur pour que lui fasse le travaille, on ne fait rien localement sauf sauvegarder l'état.
	public void execute() {
		this.airline = this.receiver.createAirline();
	}

	// L'action à exécuter si on veut faire un "Undo".
	public void unexecute() {
		this.receiver.deleteAirline(airline);
	}

}