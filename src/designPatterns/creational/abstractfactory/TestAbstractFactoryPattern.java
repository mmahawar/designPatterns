package designPatterns.creational.abstractfactory;

import static org.junit.Assert.*;

import org.junit.Test;

/***
 * Few example of factory patter inside JDK 
 * 
 * DocumentBuilderFactory#newInstance()
 * TransformerFactory#newInstance()
 */
public class TestAbstractFactoryPattern {

	@Test
	public void testShouldCreateLuxuryCarFromAsia() {
		Car luxuryCar = CarFactory.buildCar(CarType.LUXURY);
		assertEquals(CarType.LUXURY, luxuryCar.getModel());
	}

	@Test
	public void testShouldCreateSedanCarFromAsia() {
		Car sedanCar = CarFactory.buildCar(CarType.SEDAN);
		assertEquals(CarType.SEDAN, sedanCar.getModel());
	}

	@Test
	public void testShouldCreateSmallCarFromAsia() {
		Car smallCar = CarFactory.buildCar(CarType.SMALL);
		assertEquals(CarType.SMALL, smallCar.getModel());
	}

}
