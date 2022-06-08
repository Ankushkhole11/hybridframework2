package AssignMam;



	
		import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.By;
	
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.interactions.Actions;

		public class Assign3 {
			@SuppressWarnings("deprecation")
			public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				ChromeDriver driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				driver.get("http://jqueryui.com/droppable/webpage");
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//*[@id=\"global-nav\"]/nav/div/ul[1]/li[2]/a")).click();
				driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[2]/a")).click();
				Thread.sleep(3000);
				WebElement src1 = driver.findElement(By.xpath("//div[@id='draggable']"));
				WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
				Thread.sleep(3000);
				Actions act = new Actions(driver);
				act.dragAndDrop(src1,target).perform();
				Thread.sleep(3000);

	}

}
