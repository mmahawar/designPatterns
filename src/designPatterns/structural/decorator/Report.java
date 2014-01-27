package designPatterns.structural.decorator;

public interface Report {

	public Object[][] getReportData(final String reportId);

	public String getFirstColumnData();
}
