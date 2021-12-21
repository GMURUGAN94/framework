package framework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ForkJoinTask;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateNewExcel {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\Administrator\\eclipse-workspace\\framework\\src\\Excel\\Excel.1.xlsx");

		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet();

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement countries = driver.findElement(By.id("countries"));
		Select s = new Select(countries);
		List<WebElement> options = s.getOptions();

		for (int i = 0; i < options.size(); i++) {

			WebElement all = options.get(i);
			String text = all.getText();
			System.out.println(text);
		

		for (int j = 0; j < options.size(); j++) {

			Row createRow = sheet.createRow(i);
			Cell createCell = createRow.createCell(0);
			createCell.setCellValue(text);
		}
		}

		FileOutputStream o = new FileOutputStream(file);
		workbook.write(o);
		System.out.println("Done..");

	}

}
