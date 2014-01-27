package designPatterns.j2ee.businessdelegate;

public class BusinessDelegatePatternDemo {

	public static void main(String[] args) {

		BusinessDelegate businessDelegate = new BusinessDelegate();
		businessDelegate.setServiceType(ServiceType.EJB);

		Client client = new Client(businessDelegate);
		client.doTask();

		// Reference is still there 
		businessDelegate.setServiceType(ServiceType.JMS);
		client.doTask();
	}

}
