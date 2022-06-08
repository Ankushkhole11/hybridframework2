package Ask;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent_childwindow {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws AWTException, InterruptedException {
     System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
     driver.get("https://www.amazon.in");
     driver.manage().window().maximize();
    WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
     search.sendKeys("puma shoes");     
     
     Robot r= new Robot();
     r.keyPress(KeyEvent.VK_ENTER);
     r.keyRelease(KeyEvent.VK_ENTER);
    
     Thread.sleep(2000);
     
     driver.findElement(By.className("a-size-mini a-spacing-none a-color-base s-line-clamp-2"));
     

	}

}
