package designPatterns.behavioral.observer.own;

import org.junit.Test;

public class TestObserverPattern {

	@Test
	public void testShouldRunEntireLifeCycleOfObserver() {
		Person arpitPerson = new Person("Arpit");
		Person johnPerson = new Person("John");

		Product scalaInActionBook = new Product("Scala In Action", "Book",
				"Not available");

		// Imagine Arpit and John both clicked "Notify Me" Button 
		scalaInActionBook.registerObserver(arpitPerson);
		scalaInActionBook.registerObserver(johnPerson);

		// Publisher has made the available again.. 
		scalaInActionBook.setAvailability("Available");
	}
}
