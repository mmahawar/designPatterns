package designPatterns.structural.composite;

public class CompositePatternDemo {

	public static void main(String[] args) {
		Employee CEO = new Employee("BOB", "CEO", 30000);

		Employee headSales = new Employee("Chris", "Head Sales", 20000);

		Employee headMarketing = new Employee("Vineet", "Head Marketing", 20000);

		Employee clerk1 = new Employee("Manisha", "Marketing", 10000);
		Employee clerk2 = new Employee("Sachin", "Marketing", 10000);

		Employee salesExecutive1 = new Employee("Akta", "Sales", 10000);
		Employee salesExecutive2 = new Employee("Emily", "Sales", 10000);

		CEO.addSubordinate(headSales);
		CEO.addSubordinate(headMarketing);

		headSales.addSubordinate(salesExecutive1);
		headSales.addSubordinate(salesExecutive2);

		headMarketing.addSubordinate(clerk1);
		headMarketing.addSubordinate(clerk2);

		// print all employees of the organization
		System.out.println(CEO);
		for (Employee headEmployee : CEO.getSubordinates()) {
			System.out.println(headEmployee);
			for (Employee employee : headEmployee.getSubordinates()) {
				System.out.println(employee);
			}
		}
	}

}
