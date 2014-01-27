package designPatterns.behavioral.command;

public class CommandPatternDemo {

	public static void main(String[] args) {
		Stock appleStock = new AppleStock();

		BuyStock buyStockOrder = new BuyStock(appleStock);
		SellStock sellStockOrder = new SellStock(appleStock);

		Broker broker = new Broker();
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(sellStockOrder);

		broker.placeOrders();

	}

}
