package Org.BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;

import com.google.common.collect.Table.Cell;

public class AdactinHotelCall {

		
		
		public static void main(String[] args) throws IOException, Exception {
			LibGlobal b=new LibGlobal();	
			b.getDriver();

			b.url("https://adactinhotelapp.com/");
			WebElement txtUser = b.elementLocator("username");
			b.enterText(txtUser, b.excelGetdata(1, 0));
			WebElement txtPass = b.elementLocator("password");
			b.enterText(txtPass, b.excelGetdata(1, 1));
			b.elementLocator("login").click();
			b.elementLocatorByXpath("//*[@id=\"location\"]/option[3]").click();
			b.elementLocatorByXpath("//*[@id=\"hotels\"]/option[3]").click();
			b.elementLocatorByXpath("//*[@id=\"room_type\"]/option[5]").click();
			b.elementLocatorByXpath("//*[@id=\"room_nos\"]/option[11]").click();
			b.elementLocatorByXpath("//*[@id=\"adult_room\"]/option[3]").click();
			b.elementLocatorByXpath("//*[@id=\"child_room\"]/option[3]").click();
			b.elementLocator("Submit").click();
			b.elementLocator("radiobutton_0").click();
			b.elementLocator("continue").click();
			WebElement fName = b.elementLocator("first_name");
			b.enterText(fName, b.excelGetdata(1, 2));
			WebElement lName = b.elementLocator("last_name");
			b.enterText(lName, b.excelGetdata(1, 3));
			WebElement addres = b.elementLocator("address");
			b.enterText(addres, b.excelGetdata(1, 4));
			WebElement cc = b.elementLocator("cc_num");
			b.enterText(cc, b.excelGetdata(1, 5));
			b.elementLocatorByXpath("//*[@id=\"cc_type\"]/option[2]").click();
			b.elementLocatorByXpath("//*[@id=\"cc_exp_month\"]/option[13]").click();
			b.elementLocatorByXpath("//*[@id=\"cc_exp_year\"]/option[13]").click();	
			WebElement cvv = b.elementLocator("cc_cvv");
			b.enterText(cvv, b.excelGetdata(1, 6));
			b.elementLocator("book_now").click();
			Thread.sleep(5000);
			String attribute = b.elementLocator("order_no").getAttribute("value");
			b.writeoldExcel(1, 7, attribute);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		LibGlobal l=new LibGlobal();
		l.getDriver();
		l.url("https://adactinhotelapp.com/");
		l.elementLocator("username");
		l.enterText(1,0);
		
		
		
		
		
		
		
		
		
		
		
		
		

	File file=new File("C:\\Users\\Administrator\\eclipse-workspace\\framework\\src\\Excel\\BaseExcel adactin.xlsx");
		FileInputStream stram=new FileInputStream(file);
		Workbook workbook =new XSSFWorkbook();
		Sheet sheet =workbook.getSheet("Sheet1");
		Row row =sheet.getRow(1);
		
		
		
		
	}
	
}
