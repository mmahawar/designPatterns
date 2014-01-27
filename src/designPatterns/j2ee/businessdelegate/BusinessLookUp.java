package designPatterns.j2ee.businessdelegate;

public class BusinessLookUp {
	public BusinessService getBusinessService(ServiceType serviceType) {
		if (serviceType.toString().equalsIgnoreCase(ServiceType.EJB.toString())) {
			return new EJBService();
		} else {
			return new JMSService();
		}
	}
}
