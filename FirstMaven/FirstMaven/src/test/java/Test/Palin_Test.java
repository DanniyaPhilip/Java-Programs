package Test;


import org.testng.Assert;
import org.testng.annotations.Test;

import Progrms.PalinString;
public class Palin_Test {
	@Test(priority=1)
	public void test3()
	{
		PalinString ob=new PalinString();
		String k=ob.palin("Java");
		Assert.assertEquals(k, "No");
		System.out.println("Test3 Palin1");
	}
	//private static final String enabled = null;
	@Test(priority=2,enabled=false)
	public void test1()
	{
		PalinString ob=new PalinString();
		String k=ob.palin("Java");
		Assert.assertEquals(k, "No");
		System.out.println("Test1 Palin1");
	}
	@Test(priority=3)
	public void test2()
	{
		PalinString ob=new PalinString();
		String k=ob.palin("malayalam");
		Assert.assertEquals(k, "Yes");
		System.out.println("Test2 Palin1");
	}

}
