package pageobjectmodel;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	public void openBrowser() throws EncryptedDocumentException, IOException
	{
		WebDriver driver;
		Flib flib=new Flib();
		String browservalue = flib.readPropertyFile("./Data/config.properties","browser");
		
		String url = flib.readPropertyFile("./Data/config.properties","url");
		
		if(browservalue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);	
		}
		
		else if (browservalue.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);	
		}
		
		else
		{
			System.out.println("enter the correct choice");
		}
	}
	
	//method to close the browsers
	public void closeBrowser()
	{
		driver.quit();
	}
	

}
