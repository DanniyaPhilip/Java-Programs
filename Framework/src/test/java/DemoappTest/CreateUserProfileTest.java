package DemoappTest;

import org.testng.annotations.Test;
import DemoappPages.CreateProfilePage;
import DemoappPages.HomePage;
import DemoappPages.UserProfilesPage;
import UtilsPackage.ExcelRead;

public class CreateUserProfileTest extends LoginTest {

	@Test
	public void createProfile()
	{
	HomePage homepage=new HomePage(driver);
	homepage.clickUser();	
		
	UserProfilesPage userProfiles=new UserProfilesPage(driver);
    userProfiles.clickNewUser();
    
    CreateProfilePage createProfile= new CreateProfilePage(driver);
    createProfile.enterFullName("Mary Philip");
    createProfile.enterEmploymentID("IS12455");
    createProfile.enterUserName("Mary123");
    createProfile.enterPassword("Tyuiop891");
    createProfile.confirmPassword("Tyuiop891");
    createProfile.enterEmailaddress("mapyp@uyit.com");
    createProfile.uploadImage(driver);
    createProfile.selectUsertype("Admin");
    createProfile.selectDesignation();
    createProfile.createUser();
	}
}