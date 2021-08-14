package DemoappTest;

import org.testng.annotations.Test;
import DemoappPages.CreateBugPage;
import DemoappPages.HomePage;

public class CreateBugTest extends LoginTest{
    @Test
	public void bugsTest()
	{
		HomePage homepage=new HomePage(driver);
		homepage.selectBugIcon();
		CreateBugPage createBug=new CreateBugPage(driver);
		createBug.clickNewBugs();
		createBug.giveIssueNo("Q18JUP");
		String s="Submit button not working";
		createBug.giveBugTitle(s);
		createBug.clickSaveButton();
		createBug.checkBugIsCreated(s);
	}
	
}
	
	
	
	