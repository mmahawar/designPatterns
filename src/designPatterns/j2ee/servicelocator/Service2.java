package designPatterns.j2ee.servicelocator;

public class Service2 extends RealService {

	@Override
	public String getName() {
		return this.getClass().getName();
	}

	@Override
	public void execute() {
		System.out.println("Executing Service2");
	}

}