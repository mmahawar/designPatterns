package designPatterns.behavioral.command;

public class SellStock implements Order {

	private Stock aStock;

	public SellStock(Stock aStock) {
		this.aStock = aStock;
	}

	@Override
	public void execute() {
		aStock.sell();
	}
}
