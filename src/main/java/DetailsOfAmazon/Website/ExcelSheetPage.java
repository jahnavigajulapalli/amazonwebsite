package DetailsOfAmazon.Website;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;

public class ExcelSheetPage 
{
	
public String getusername(WebDriver driver) throws EncryptedDocumentException, IOException {
		
			
		FileInputStream f1= new FileInputStream("C:\\Users\\quali\\eclipse-workspace\\Website\\ExcelSheet\\usernameandpassword.xlsx");
		Workbook wb=	WorkbookFactory.create(f1);
		return NumberToTextConverter.toText(wb.getSheet("login").getRow(1).getCell(0).getNumericCellValue());
		
	}
public  String getPwd(WebDriver driver) throws IOException
{
	
	FileInputStream f1= new FileInputStream("C:\\Users\\quali\\eclipse-workspace\\Website\\ExcelSheet\\usernameandpassword.xlsx");
	Workbook wb=	WorkbookFactory.create(f1);
	return wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();
	
}
public ExcelSheetPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}



