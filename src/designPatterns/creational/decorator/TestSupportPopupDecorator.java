package designPatterns.creational.decorator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSupportPopupDecorator {

	@Test
	public void testShoulPopupClientReport() {
		SupportPopupDecorator supportPopupDecoratored = new SupportPopupDecorator(new SupportLinkDecorator(new SupportReport()));
        assertEquals("Support Data - support link -  - support popup - ", supportPopupDecoratored.getFirstColumnData());
	}

}
