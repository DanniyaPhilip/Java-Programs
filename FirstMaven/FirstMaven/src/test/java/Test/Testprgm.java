package Test;

import org.testng.Assert;
import org.testng.annotations.*;

public class Testprgm {
	@Test(dataProvider="datap2",dataProviderClass=Dataproviders.class)
	public void test1(int actual,int expected)
	{
		System.out.println(expected);
		System.out.println(actual);
		//int expected=16;
		//int actual=16;
		/*
		if(n>=10)
			System.out.println("Number above 10");
		else
			System.out.println("Numer below 10");
			*/
		Assert.assertEquals(expected, actual,"dddd");
		//Assert.assertEquals(expected, 17);
		//Assert.assertEquals(expected, 18, "My test case failed");
		//Assert.assertTrue(true, "ssss");
		//Assert.assertTrue(actual!=expected, "Test case failed");
		
	}
	@DataProvider(name="datap1")
	public Object[][] dataprovider()
	{
		Object ob[][]= {{87,87},{56,90}};
		return ob;
	}
	@BeforeMethod
	public void befmet()
	{
		System.out.println("Beginning of test");
	}
}
