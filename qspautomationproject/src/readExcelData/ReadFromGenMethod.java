package readExcelData;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadFromGenMethod {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.do;jsessionid=3tsh1c1lg5g99");
		driver.manage().window().maximize();
		
		GenericMethodReadData A=new GenericMethodReadData();
		String username = A.ReadData("./Data/","activalidcreds", 1, 0);
		String password = A.ReadData("./Data/","activalidcreds", 1, 1);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();

	}

}
