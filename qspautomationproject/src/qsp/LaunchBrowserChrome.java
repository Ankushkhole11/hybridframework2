package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserChrome{

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(4000);
		driver.close();
	}

}
