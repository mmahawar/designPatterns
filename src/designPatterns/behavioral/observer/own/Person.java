package designPatterns.behavioral.observer.own;

public class Person implements Observer {

	private String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public void update(String availability) {
		System.out.println("Hello " + name + ", Product is now " + availability
				+ " on amazon");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
