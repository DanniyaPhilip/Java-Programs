package DemoappTest;
import org.testng.annotations.Test;
import DemoappPages.CreateFolderPage;
import DemoappPages.HomePage;

public class CreateFolderTest extends LoginTest{

	@Test(enabled=true)
	public void createFile()
	{
		HomePage homepage=new HomePage(driver);
		homepage.fileManager();	
		
		CreateFolderPage createfolder=new CreateFolderPage(driver);
		createfolder.createFolder("FOLDERNKG");
		createfolder.createFile("FOLDERNKG","filenew");
	}
}
