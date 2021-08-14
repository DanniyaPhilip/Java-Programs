package DemoappTest;
import java.io.IOException;

import org.testng.annotations.Test;
import DemoappPages.GetCalendarDataPage;
import DemoappPages.HomePage;

public class GetCalendarDataTest extends LoginTest  {

	@Test
	public void CalendarData() throws IOException
	{
		HomePage homepage=new HomePage(driver);
		homepage.selectCalendar();
		
		GetCalendarDataPage calendarData=new GetCalendarDataPage(driver);
		calendarData.clickDay();
		calendarData.calendarDetails();
	}
}
