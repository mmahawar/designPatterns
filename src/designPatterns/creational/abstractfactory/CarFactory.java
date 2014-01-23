package designPatterns.creational.abstractfactory;

public class CarFactory {

	private CarFactory() {
		// Prevent instantiation
	}

	public static Car buildCar(CarType type) {
		Car car = null;
		/**
		 * Read location property somewhere from configuration Use location
		 * specific car factory
		 */
		Location location = Location.ASIA;
		switch (location) {
		case USA:
			car = USACarFactory.buildCar(type);
			break;
		case ASIA:
			car = AsiaCarFactory.buildCar(type);
			break;
		default:
			car = DefaultCarFactory.buildCar(type);
		}
		return car;
	}
}
