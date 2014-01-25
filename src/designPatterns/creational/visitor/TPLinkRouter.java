package designPatterns.creational.visitor;

public class TPLinkRouter implements Router{

	@Override
	public void sendData(char[] data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void acceptData(char[] data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void accept(RouterVisitor v) {
		v.visit(this);
	}

}
