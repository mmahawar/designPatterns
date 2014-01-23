package designPatterns.creational.abstractfactory;

public class LuxuryCar extends Car {

	LuxuryCar(Location location) {
		super(CarType.LUXURY, location);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Building luxury car");
	}
	
	@Override
	public String toString() {
		return "Luxury Car";
	}
}
