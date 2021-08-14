package DemoappTest;

import org.testng.annotations.Test;
import DemoappPages.HomePage;
import DemoappPages.MailboxPage;

public class CreateMailTest extends LoginTest {
	
	@Test
	public void createMail()
	{
		HomePage homepage=new HomePage(driver);
		homepage.clickMail();
		
		MailboxPage mailbox=new MailboxPage(driver);
		mailbox.compose();
		mailbox.recipient();
		mailbox.giveSubject("Demo Mail");
	}

}
