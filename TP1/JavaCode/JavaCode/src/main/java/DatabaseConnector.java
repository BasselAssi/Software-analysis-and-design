public class DatabaseConnector {

	private static DatabaseConnector instance;
	private IRepository repository;

	public static DatabaseConnector getInstance() {
		return this.instance;
	}

}