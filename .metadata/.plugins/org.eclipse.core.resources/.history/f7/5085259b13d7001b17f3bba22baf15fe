package DemoappTest;
import org.testng.annotations.Test;
import DemoappPages.GetCalendarDataPage;
import DemoappPages.HomePage;

public class GetCalendarDataTest extends LoginTest  {

	@Test
	public void CalendarData()
	{
		HomePage homepage=new HomePage(driver);
		homepage.selectCalendar();
		
		GetCalendarDataPage calendarData=new GetCalendarDataPage(driver);
		calendarData.clickDay();
		calendarData.calendarDetails();
	}
}
