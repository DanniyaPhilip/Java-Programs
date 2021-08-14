package DemoappTest;
import org.testng.annotations.Test;
import DemoappPages.FolderPage;
import DemoappPages.HomePage;

public class CreateFolderTest extends LoginTest{

	@Test(enabled=true)
	public void createFile()
	{
		HomePage homepage=new HomePage(driver);
		homepage.fileManager();	
		
		FolderPage createfolder=new FolderPage(driver);
		createfolder.createFolder("FOLDERNKG");
		createfolder.createFile("FOLDERNKG","filenew");
	}
}
