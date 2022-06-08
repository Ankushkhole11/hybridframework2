package KeywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;


public class ActitimevalidLoginTest extends BaseTest {


	public static void main(String[] args) throws IOException, InterruptedException {
		
		//object creation
		BaseTest bt = new BaseTest();
		Flib flib = new Flib();
		
		
		//read the data from property file use the generic method
		
		String username = flib.readPropertyFile("./Data/config.properties","username");
		String password = flib.readPropertyFile("./Data/config.properties","password");
		
		//open browser
		bt.openBrowser();
		Thread.sleep(3000);
		
		//perform login
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		
		
		Thread.sleep(2000);
		
		//close browser
		bt.closeBrowser();
		

	}

}
