package AssignMam;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BluestoneAssign5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"denyBtn\"]")).click();
		WebElement target = driver.findElement(By.xpath("/html/body/header/div/div[2]/div/nav/ul/li[2]/a"));
		Actions act=new Actions(driver);
		act.moveToElement(target).perform();
		driver.findElement(By.xpath("//a[@title='Diamond Rings'or .='Diamond']")).click();
		Thread.sleep(3000);
		//WebElement tar =driver.findElement(By.xpath("//span[@class='title style-fill i-right']/descedent::i[@class='icon-ion-chevron-down']"));
		//WebElement tar =driver.findElement(By.xpath("//span[@class='title style-fill i-right' and .='Price']"));
		WebElement tar = driver.findElement(By.xpath("//*[@id=\"Price-form\"]/span"));
		act.moveToElement(tar).perform();
		//driver.findElement(By.xpath("//span[@class='prcs-dlh' and .=' 10,000 ']")).click();
		//driver.findElement(By.xpath("//span[@id='pchkbox' and .=' 10,000 ']")).click();
		driver.findElement(By.xpath("//*[@id=\"price\"]/div/div[2]")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
