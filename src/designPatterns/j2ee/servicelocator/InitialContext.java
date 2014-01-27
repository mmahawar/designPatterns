package designPatterns.j2ee.servicelocator;


public class InitialContext {
	public Object lookup(String jndiName) {
		if (ServiceName.SERVICE1.toString().equalsIgnoreCase(jndiName)) {
			System.out.println("Looking up and creating a new Service1 object");
			return new Service1();
		} else if (ServiceName.SERVICE2.toString().equalsIgnoreCase(jndiName)) {
			System.out.println("Looking up and creating a new Service2 object");
			return new Service2();
		}
		return new NoService();
	}
}
