package dataDrivenFrameWork;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	

	//Generic method to read data in excel 
		public String readExcelData(String path,String sheetname,int rowcount,int cellcount) throws EncryptedDocumentException, IOException {
			
			FileInputStream fis = new FileInputStream(path);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetname);
			Row row = sh.getRow(rowcount);
			Cell cell = row.getCell(cellcount);
			String data = cell.getStringCellValue();
			return data;
			
		}
		
		//Generic method to get rowcount from excel 
		public int getRowCount(String path,String sheetname) throws EncryptedDocumentException, IOException{
			FileInputStream fis = new FileInputStream(path);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetname);
			int rc = sh.getLastRowNum();
			return rc;
			
		}
		
		//Generic method to write data in excel 
		public void writeExcelData(String path, String sheetname,int rowct,int cellct,String data) throws EncryptedDocumentException, IOException {
			FileInputStream fis = new FileInputStream(path);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheetname);
			 Row row = sh.getRow(rowct);
			Cell cell = row.createCell(cellct);
			
			cell.setCellValue(data);
			
			FileOutputStream fos = new FileOutputStream(path);
			wb.write(fos);
			
		}

}
