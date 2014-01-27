package designPatterns.j2ee.servicelocator;

public class NoService implements Service{

	@Override
	public String getName() {
		return "No Service in system available ";
	}

	@Override
	public void execute() {
		System.out.println("Nothing can be done this is an empty service");
	}

}
