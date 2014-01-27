package designPatterns.behavioral.command;

public class BuyStock implements Order {

	private Stock aStock;

	public BuyStock(Stock aStock) {
		this.aStock = aStock;
	}

	@Override
	public void execute() {
		aStock.buy();
	}
}
