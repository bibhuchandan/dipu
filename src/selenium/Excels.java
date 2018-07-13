package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excels {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
	FileInputStream fis=new FileInputStream("E://dipu/dipu.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet s = wb.getSheet("sheet1");
	String value=s.getRow(1).getCell(1).getStringCellValue();
	System.out.println(value);
	
}
}
