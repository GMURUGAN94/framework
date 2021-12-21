package Org.Sample;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookVerify {

	static WebDriver driver;

	@BeforeClass

	public static void loginpage() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
	}

	@AfterClass
	public static void afterclass() {
		driver.quit();
	}

	@Before

	public void before() {

		Date d = new Date();

		System.out.println("start time" + d);

	}

	@After

	public void after() {
		Date d = new Date();
		System.out.println("end time" + d);
	}

@Test

public void test() {
 String currentUrl = driver.getCurrentUrl();
boolean b = currentUrl.contains("com");
Assert.assertTrue("verify url", b);
WebElement txtuser = driver.findElement(By.id("email"));
 txtuser.sendKeys("murugan");
 String user = txtuser.getAttribute("value");
 Assert.assertEquals("verify username", "murugan", user);
 
}
@Test

public void test1() throws InterruptedException {
	WebElement txtpass = driver.findElement(By.id("pass"));
	 txtpass.sendKeys("murugan");
	 Thread.sleep(2000);
	String pass = txtpass. getAttribute("value");
	Assert.assertEquals("verify password","murugan",pass);
	

}








}