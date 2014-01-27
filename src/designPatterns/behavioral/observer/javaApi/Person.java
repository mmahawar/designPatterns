package designPatterns.behavioral.observer.javaApi;

import java.util.Observable;
import java.util.Observer;

public class Person implements Observer {

	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void update(Observable o, Object availability) {
		System.out.println("Hello " + name + ", " + o + " is now " + availability
				+ " on amazon");

	}

}
