package dataDrivenFrameWork;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeValidLogin {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.do;jsessionid=qq2ddh754l0s");
		driver.manage().window().maximize();
		
		//accessing the generic reusable method
		Flib flib = new Flib();
		//read username
		String username = flib.readExcelData("./Data/activalidcreds.xlsx","Sheet1",1, 0);
		//read password
		String password = flib.readExcelData("./Data/activalidcreds.xlsx","Sheet1",1, 1);
		
		//login operation
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		
	}
	

}
