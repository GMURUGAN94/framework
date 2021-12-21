package framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcel {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\Administrator\\eclipse-workspace\\framework\\src\\Excel\\Excel.1.xlsx");

		FileInputStream stream = new FileInputStream(file);

		Workbook workbook = new XSSFWorkbook(stream);

		Sheet sheet = workbook.getSheet("Datas");
		Row row = sheet.getRow(3);
		Cell cell = row.getCell(1);

		String cellValue = cell.getStringCellValue();

		if (cellValue.equals("TRICHY")) {

			cell.setCellValue("THANJAVUR");

			FileOutputStream o = new FileOutputStream(file);
			workbook.write(o);
			System.out.println("Done...");

		}
	}
}