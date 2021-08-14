package DemoappTest;

import org.testng.annotations.Test;

import DemoappPages.HomePage;
import DemoappPages.ManageClient;

public class ManageClientTest extends LoginTest {
	
	@Test
	public void manageClient()
	{
		
	HomePage homepage=new HomePage(driver);
	homepage.selectClient();
	
	ManageClient manageClient= new ManageClient(driver);
	manageClient.searchSelect();
	manageClient.clientList();
	}
}
