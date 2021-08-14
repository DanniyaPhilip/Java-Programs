package Test;

import org.testng.Assert;
import org.testng.annotations.*;
//import org.testng.annotations.Test;

import Progrms.PalinString;
public class Palin_Test2 {
	@BeforeTest
	public void beforetest() {
		System.out.println("Before Test");
	}
	@AfterTest
public void aftertest() {
		System.out.println("After Test");
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Before Class");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("After Class");
	}
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("Before Suite");
	}
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("After Suite");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before Method");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("After Method");
	}
	@Test(priority=3)
	public void test6()
	{
		PalinString ob=new PalinString();
		String k=ob.palin("Java");
		Assert.assertEquals(k, "No");
		System.out.println("Test6");
		
	}
	@Test(priority=1)
	public void test4()
	{
		PalinString ob=new PalinString();
		String k=ob.palin("Radar");
		Assert.assertEquals(k, "Yes");
		System.out.println("Test4");
	}
	
	
	@Test(priority=2,enabled=true)
	public void test5()
	{
		PalinString ob=new PalinString();
		String k=ob.palin("Selenium");
		Assert.assertEquals(k, "No");
		System.out.println("Test5");
	}
	

}
