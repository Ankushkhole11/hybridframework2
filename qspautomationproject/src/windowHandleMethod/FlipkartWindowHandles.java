package windowHandleMethod;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartWindowHandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("samsung f12");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//div[@class='_4rR01T' and text()='SAMSUNG Galaxy F12 (Sea Green, 64 GB)']")).click();
		
		String parentW = driver.getWindowHandle();
		Set<String> allWindow = driver.getWindowHandles();
		for(String wh : allWindow)
		{
			if(!parentW.equals(wh))
			{
				driver.switchTo().window(wh);
			}
		
		
		else
		 {
			
		 }
	   }
		
		driver.findElement(By.xpath("//a[.='128 GB']")).click();
		driver.findElement(By.xpath("//li[@id='swatch-0-color']")).click();
		driver.findElement(By.xpath("//input[@id='pincodeInputId']")).clear();
		driver.findElement(By.xpath("//input[@id='pincodeInputId']")).sendKeys("411033");
		driver.findElement(By.xpath("//span[@class='_2P_LDn']")).click();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")).click();

		

	}

}
