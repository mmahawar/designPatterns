package designPatterns.structural.decorator;

public class ColumnDecorator implements Report {

	private Report decoratedReport;

	public ColumnDecorator(Report report) {
		decoratedReport = report;
	}

	@Override
	public Object[][] getReportData(String reportId) {
		return decoratedReport.getReportData(reportId);
	}

	@Override
	public String getFirstColumnData() {
		return decoratedReport.getFirstColumnData();
	}

}
