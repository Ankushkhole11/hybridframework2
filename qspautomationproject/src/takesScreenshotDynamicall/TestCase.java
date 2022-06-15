package takesScreenshotDynamicall;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase extends BaseTest {
	@BeforeMethod
	public void setUp()
	{
		initialization();
	}
	
	@Test
	public void validLogin() throws InterruptedException
	{
		SoftAssert sa=new SoftAssert();
		String actualLoginPageTitle = driver.getTitle();
		sa.assertEquals(actualLoginPageTitle,"OrangeHRM");
		
		driver.findElement(By.name("txtUsername")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("ankush");
		driver.findElement(By.id("btnLogin")).click();
		
		WebElement Dashboard = driver.findElement(By.xpath("//h1[.='Dashboard']"));
		boolean statusOfDashboard = Dashboard.isDisplayed();
		Assert.assertEquals(statusOfDashboard,true);
		Thread.sleep(4000);
	}
	
	@Test
	public void testCase2()
	{
		Assert.fail();
	}
	
	@Test
	public void testCase3()
	{
		Assert.fail();
	}
	
	@Test
	public void testCase4()
	{
		Assert.fail();
	}
	
	@Test
	public void testCase5()
	{
		Assert.fail();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
