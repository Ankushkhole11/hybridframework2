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

public class ReadData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	   FileInputStream fis = new FileInputStream("./Data/TestData.xlsx");	//provide the path of file
	   Workbook wb = WorkbookFactory.create(fis);
	   Sheet sh = wb.getSheet("Sheet1");
	   Row row = sh.getRow(1);
	   Cell cell = row.getCell(1);
	   String data = cell.getStringCellValue();
	   System.out.println(data);
	

	}

}
