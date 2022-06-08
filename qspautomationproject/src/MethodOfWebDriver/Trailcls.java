package MethodOfWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trailcls {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
		Thread.sleep(12000);
		//driver.findElement(By.xpath("//p[.='CHAT with our experts !']")).click();
		driver.switchTo().frame("CHAT with our experts !").getWindowHandle();
		

	}

}
