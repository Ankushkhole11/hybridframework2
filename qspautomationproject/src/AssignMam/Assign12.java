package AssignMam;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign12 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"denyBtn\"]")).click();
		WebElement tar = driver.findElement(By.xpath("//span[text()='Offers ']"));
		Actions act = new Actions(driver);
		act.moveToElement(tar).perform();
		driver.findElement(By.xpath("//span[text()='Upto 30% Off on Making Charges']")).click();

	}

}
