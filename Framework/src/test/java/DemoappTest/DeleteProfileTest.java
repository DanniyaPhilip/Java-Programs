package DemoappTest;

import org.testng.annotations.Test;

import DemoappPages.DeleteProfile;
import DemoappPages.HomePage;
import UtilsPackage.ExcelRead;

public class DeleteProfileTest extends LoginTest {

	@Test(dataProvider="data1")
	public void deleteProfile(String a,String b)
	{
		
		HomePage homepage=new HomePage(driver);
		homepage.clickUser(); 
		
		DeleteProfile deleteUser= new DeleteProfile(driver);
		//ExcelRead ob=new ExcelRead();
		//ob.getExcelData("C:\\Users\\danniyax\\Documents\\DeleteProfile.xlsx", 2);
		deleteUser.deleteUserProfile("Mary123");
	}
	
}
