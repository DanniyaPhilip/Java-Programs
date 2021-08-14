package DemoappTest;

import org.testng.annotations.Test;
import DemoappPages.HomePage;
import DemoappPages.IdentifyClient;

public class IdentifyClientTest extends LoginTest {
	
	@Test
	public void manageClient() 
	{
		
	HomePage homepage=new HomePage(driver);
	homepage.selectClient();
	
	IdentifyClient identifyClient= new IdentifyClient(driver);
	identifyClient.searchClient();
	identifyClient.identifyFromClientList();
	}
}
