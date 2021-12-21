package Org.Webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskAlternateRows {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.seleniumeasy.com/test/table-data-download-demo.html");
		List<WebElement> tRows = driver.findElements(By.xpath("//tbody//tr"));

		for (int i = 0; i < tRows.size(); i = i + 2) {
			
			WebElement currentRow = tRows.get(i);
			
			List<WebElement> datas = currentRow.findElements(By.tagName("td"));
			
			for (int j = 0; j < datas.size(); j++) {
				WebElement element = datas.get(j);
				String text = element.getText();
				System.out.println(text);

			}

		}
	}
}
