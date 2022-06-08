package dataDrivenFrameWork;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiInvalidCreds {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.do;jsessionid=qq2ddh754l0s");
		driver.manage().window().maximize();
		
		Flib flib = new Flib();
		int rc = flib.getRowCount("./Data/actiinvalidcreds.xlsx","sheet1");
		
		for(int i=1; i<rc;i++)
		{
			String username = flib.readExcelData("./Data/actiinvalidcreds.xlsx","Sheet1",i, 0);
			String password = flib.readExcelData("./Data/actiinvalidcreds.xlsx","Sheet1",i, 1);
			
			//login operation
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);
			driver.findElement(By.id("loginButton")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.name("username")).clear();
			
		}
	}

}
