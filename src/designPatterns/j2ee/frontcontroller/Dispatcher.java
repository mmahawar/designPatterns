package designPatterns.j2ee.frontcontroller;

public class Dispatcher {
	private StudentView studentView;
	private HomeView homeView;

	public Dispatcher() {
		studentView = new StudentView();
		homeView = new HomeView();
	}

	public void dispatch(String requestedView) {
		if ("STUDENT".equalsIgnoreCase(requestedView)) {
			studentView.show();
		} else {
			homeView.show();
		}
	}
}
