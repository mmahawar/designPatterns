package designPatterns.creational.abstractfactory;

public class SmallCar extends Car {

	SmallCar(Location location) {
		super(CarType.SMALL, location);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Building small car");
	}
	
	@Override
	public String toString() {
		return "Small Car";
	}
}