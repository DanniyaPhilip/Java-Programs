package Test;

import org.testng.annotations.DataProvider;

public class Dataproviders {

	@DataProvider(name="datap1")
	public Object[][] dataprovider()
	{
		Object ob[][]= {{87,87},{56,90}};
		return ob;
	}
	@DataProvider(name="datap2")
	public Object[][] dataprovider2()
	{
		Object ob[][]= {{17,17},{78,95}};
		return ob;
	}
}
