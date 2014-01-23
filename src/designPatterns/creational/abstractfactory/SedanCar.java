package designPatterns.creational.abstractfactory;

public class SedanCar extends Car {

	SedanCar(Location location) {
		super(CarType.SEDAN, location);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Building sedan car");
	}
	
	@Override
	public String toString() {
		return "Sedan Car";
	}
}
