package winddowpopuphandle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFilesPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.do;jsessionid=3tsh1c1lg5g99");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[13]/a/div[2]/img")).click();
		driver.findElement(By.partialLinkText("Logo")).click();
		
		

	}

}
