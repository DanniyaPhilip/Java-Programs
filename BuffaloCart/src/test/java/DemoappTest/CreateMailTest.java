package DemoappTest;

import org.testng.annotations.Test;
import DemoappPages.HomePage;
import DemoappPages.CreateMailPage;

public class CreateMailTest extends LoginTest {
	
	@Test
	public void createMail()
	{
		HomePage homepage=new HomePage(driver);
		homepage.clickMail();
		
		CreateMailPage mailbox=new CreateMailPage(driver);
		mailbox.clickCompose();
		mailbox.giveRecipientName();
		mailbox.giveSubject("Demo Mail");
		mailbox.composeMail();
		mailbox.searchMail("Demo Mail");
	}

}
