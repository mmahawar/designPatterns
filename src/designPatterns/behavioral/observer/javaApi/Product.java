package designPatterns.behavioral.observer.javaApi;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Product extends Observable {

	private ArrayList<Observer> observers = new ArrayList<Observer>();

	private String name;
	private String type;
	private String availability;

	public Product(String name, String type, String availability) {
		super();
		this.name = name;
		this.type = type;
		this.availability = availability;
	}

	public void notifyObservers(Observable observable, String availability) {
		System.out
				.println("Notifying to all the subscribers when product became available");
		for (Observer ob : observers) {
			ob.update(observable, this.availability);
		}
	}

	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	public ArrayList<Observer> getObservers() {
		return observers;
	}

	public void setObservers(ArrayList<Observer> observers) {
		this.observers = observers;
	}

	public String getProductName() {
		return name;
	}

	public void setProductName(String productName) {
		this.name = productName;
	}

	public String getProductType() {
		return type;
	}

	public void setProductType(String productType) {
		this.type = productType;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		if (!(this.availability.equalsIgnoreCase(availability))) {
			this.availability = availability;
			setChanged();
			notifyObservers(this, availability);
		}
	}
	
	@Override
	public String toString() {
		return name;
	}
}