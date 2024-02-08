public class DatabaseConnector {

	private Repository repository;
	private static DatabaseConnector instance;

	public static DatabaseConnector getInstance() {
		if (instance == null)
			return instance = new DatabaseConnector();
		return instance;
	}

	public Repository getRepository() {
		if (repository == null)
			return repository = new InMemoRepository();
		return repository;
	}
}