package DemoappTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import DemoappPages.CreateBugPage;
import DemoappPages.HomePage;
import DemoappPages.LoginPage;

public class CreateBugTest extends LoginTest{


	
	@Test
	public void bugsTest()
	{
		HomePage homepage=new HomePage(driver);
		homepage.selectBugIcon();
		CreateBugPage bugspage=new CreateBugPage(driver);
		bugspage.clickNewBugs();
		bugspage.giveIssueNo("Q18JUP");
		bugspage.giveBugTitle("Submit button not working");
		bugspage.clickSaveButton();
	}
	
}
	
	
	
	