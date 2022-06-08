package readExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeValidLoginCreds {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.do;jsessionid=3tsh1c1lg5g99");
		driver.manage().window().maximize();
		
		FileInputStream fis = new FileInputStream("./Data/activalidcreds.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		Row row = sh.getRow(1);
		Cell cell = row.getCell(0);
		String username = cell.getStringCellValue();
		
		FileInputStream fis2 = new FileInputStream("./Data/activalidcreds.xlsx");
		Workbook wb2 = WorkbookFactory.create(fis);
		Sheet sh2 = wb2.getSheet("Sheet1");
		Row row2 = sh2.getRow(1);
		Cell cell2 = row2.getCell(1);
		String password = cell.getStringCellValue();
		
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();

	}

}
