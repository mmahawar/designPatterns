package designPatterns.creational.decorator;

public class SupportReport implements Report {

	@Override
	public Object[][] getReportData(String reportId) {
		return null;
	}

	@Override
	public String getFirstColumnData() {
		return "Support Data";
	}

}
