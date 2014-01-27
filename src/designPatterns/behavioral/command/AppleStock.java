package designPatterns.behavioral.command;

public class AppleStock implements Stock{
	private String name = "Apple Inc";
	private int quantity = 10;

	@Override
	public void buy() {
		System.out.println("Stock [ Name: " + name + ", Quantity: " + quantity
				+ " ] bought");
	}

	@Override
	public void sell() {
		System.out.println("Stock [ Name: " + name + ", Quantity: " + quantity
				+ " ] sold");
	}
}