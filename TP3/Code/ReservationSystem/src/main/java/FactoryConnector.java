import java.util.HashMap;
import java.util.Map;

public class FactoryConnector {

	private Map<String, AbstractFactory> factories;
	private static FactoryConnector instance;

	public static FactoryConnector getInstance() {
		if (instance == null)
			return instance = new FactoryConnector(new HashMap<>());
		return instance;
	}

	private FactoryConnector(Map<String, AbstractFactory> factories) {
		this.factories = factories;
	}

	public AbstractFactory getPlaneFactory() {
		if (!factories.containsKey("Plane")){
			factories.put("Plane", new PlaneFactory());
			return factories.get("Plane");
		}
		return factories.get("Plane");
	}

	public AbstractFactory getTrainFactory() {
		if (!factories.containsKey("Train")){
			factories.put("Train", new TrainFactory());
			return factories.get("Train");
		}
		return factories.get("Train");
	}

	public AbstractFactory getBoatFactory() {
		if (!factories.containsKey("Boat")){
			factories.put("Boat", new BoatFactory());
			return factories.get("Boat");
		}
		return factories.get("Boat");
	}

}