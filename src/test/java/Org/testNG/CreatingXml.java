package Org.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatingXml {
	static WebDriver driver;

	@Test
	private void beforeclass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://mle.sunderland.ac.uk/compass-login/login.php");
		
	}
		
		@Test
		private void method1() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://pf1-prod-uk.engage2serve.com/#/login");	
	}
//
//	@Test
//
//	private void username() {
//		driver.findElement(By.id("email")).sendKeys("murugan.mech.902");
//	}
//
//	@Test(priority = -8)
//	private void password() {
//		driver.findElement(By.id("pass")).sendKeys("1249");
//	}
//
//	@Test
//	private void btnlogin() {
//		driver.findElement(By.name("login")).click();
//
//	}
//
//	@AfterClass
//	private void afterclass() {
//		driver.quit();
//
//	}

}
