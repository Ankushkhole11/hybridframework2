package readExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.Flow;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeInvalidLoginCreds {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.do;jsessionid=3tsh1c1lg5g99");
		driver.manage().window().maximize();
		
		GenericMethodReadData flib=new GenericMethodReadData();
		
		int rowcount = flib.getRowCount("./Data/actiinvalidcreds.xlsx","Sheet1");	
		
		for(int i=1;i<rowcount;i++)
		{
			String username = flib.ReadData("./Data/actiinvalidcreds.xlsx","Sheet1",i,0);
			String passw = flib.ReadData("./Data/actiinvalidcreds.xlsx","Sheet1",i,1);
			
			Thread.sleep(1000);
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(passw);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(1000);
			driver.findElement(By.name("username")).clear();
		}
		
		
		

	}

}
