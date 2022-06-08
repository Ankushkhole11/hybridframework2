package AssignMam;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign7 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"denyBtn\"]")).click();
		Thread.sleep(3000);
		WebElement target = driver.findElement(By.xpath("/html/body/header/div/div[2]/div/nav/ul/li[6]/a"));
		Actions act=new Actions(driver);
		act.moveToElement(target).perform();
		driver.findElement(By.xpath("/html/body/header/div/div[2]/div/nav/ul/li[6]/div/ul/li[1]/div/ul/li[6]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"product_list_ui\"]/li[2]/div[1]/div/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/div/div[1]/div[1]")).click();

	}

}
