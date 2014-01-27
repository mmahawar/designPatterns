package designPatterns.j2ee.frontcontroller;

public class FrontControllerPatternDemo {
	public static void main(String[] args) {
		FrontController frontController = new FrontController();
		frontController.dispatchRequest(VIEWS.HOME.toString());
		frontController.dispatchRequest(VIEWS.STUDENT.toString());
	}
}
