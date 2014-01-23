package designPatterns.creational.factory;

import static org.junit.Assert.*;

import org.junit.Test;

/***
 * Few example of factory patter inside JDK
 * 
 * java.sql.DriverManager#getConnection() 
 * java.net.URL#openConnection()
 * java.lang.Class#newInstance() 
 * java.lang.Class#forName()
 */
public class TestFactoryPattern {

	@Test
	public void testShouldCreateLuxuryCar() {
		Car buildCar = CarFactory.buildCar(CarType.LUXURY);
		assertEquals(CarType.LUXURY, buildCar.getModel());
	}

	@Test
	public void testShouldCreateSedanCar() {
		Car buildCar = CarFactory.buildCar(CarType.SEDAN);
		assertEquals(CarType.SEDAN, buildCar.getModel());
	}

	@Test
	public void testShouldCreateSmallCar() {
		Car buildCar = CarFactory.buildCar(CarType.SMALL);
		assertEquals(CarType.SMALL, buildCar.getModel());
	}

}
