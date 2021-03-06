package DemoappTest;

import org.testng.annotations.Test;

import DemoappPages.CreateKnowledgeBase;
import DemoappPages.HomePage;

public class CreateKnowledgeBaseTest extends LoginTest {
	
	@Test
	public void knowledgeBaseTest()
	{
		HomePage homepage=new HomePage(driver);
		homepage.selectKnowledgeBase();
		homepage.selectCategory();
		
		CreateKnowledgeBase newCategory=new CreateKnowledgeBase(driver);
		newCategory.createNewCategory();
		newCategory.enterCategoryDetails("NewCategory test", "5");
		newCategory.isCategoryCreated("NewCategory test");
	}

}
