package Org.Framework;

import java.awt.Window.Type;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class Automation {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\Administrator\\eclipse-workspace\\framework\\src\\Excel\\Excel.1.xlsx");

		FileInputStream stream = new FileInputStream(file);

		Workbook workbook = new XSSFWorkbook(stream);

		Sheet sheet = workbook.getSheet("Datas");

		Row row = sheet.getRow(1);
		Cell cell = row.getCell(1);

	System.out.println(cell);

		
		int count = row.getPhysicalNumberOfCells();
		System.out.println(count);
		
		int count1 = sheet.getPhysicalNumberOfRows();
		System.out.println(count1);

	for (int i = 0; i < row.getPhysicalNumberOfCells(); i++) {
			Cell cell1 = row.getCell(i);
			System.out.println(cell1);

			for (int j = 0; j < sheet.getPhysicalNumberOfRows(); j++) {
				Row row1 = sheet.getRow(j);
			 for (int k = 0; k <row.getPhysicalNumberOfCells(); k++) {

				Cell cell2 = row1.getCell(j);
				System.out.println(cell2);

			int type = cell.getCellType();
				if (type == 1) {
					String CellValue = cell.getStringCellValue();
					System.out.println(CellValue);
				
				if (type == 0) {
					double Value = cell.getNumericCellValue();
				long l = (long) Value;
					String valueOf = String.valueOf(l);
					System.out.println(valueOf);

				}
				}
			}

		}}}}