package Org.Sample;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinHotel {
	static WebDriver driver;

	@BeforeClass

	public static void loginpage() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
	}

	@AfterClass
	public static void afterclass() {
//		driver.quit();
	}

	@Before

	public void before() {

		Date d=new Date();

		System.out.println("start time"+d);

	}

	@After

	public void after() {
		Date d = new Date();
		System.out.println("end time" + d);
	}
//		@Ignore

	@Test

	public void test() {
		WebElement txtuser = driver.findElement(By.id("username"));
		txtuser.sendKeys("MURUGANG94");
		WebElement txtpass = driver.findElement(By.id("password"));
		txtpass.sendKeys("12494612");
		WebElement btnlogin = driver.findElement(By.id("login"));
		btnlogin.click();
	}
	@Test
	public void test1() {
		driver.findElement(By.xpath("//*[@id=\"location\"]/option[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"hotels\"]/option[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"room_type\"]/option[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"room_nos\"]/option[4]")).click();
	    driver.findElement(By.xpath("//*[@id=\"datepick_in\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"datepick_out\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"adult_room\"]/option[4]")).click();
	    driver.findElement(By.xpath("//*[@id=\"child_room\"]/option[4]")).click();
	    driver.findElement(By.xpath("//*[@id=\"Submit\"]")).click();
	}
	
	@Test
	public void test2() {
		
		 driver.findElement(By.xpath("//*[@id=\"radiobutton_0\"]")).click();
		 driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		
		
	}
	
	@Test
	public void test3() {
	
	 driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("murugan");
	 driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("G");
	 driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys("OMR chennai");
	 driver.findElement(By.xpath("//*[@id=\"cc_num\"]")).sendKeys("9875632147852369");
	 driver.findElement(By.xpath("//*[@id=\"cc_type\"]/option[2]")).click();
	 driver.findElement(By.xpath("//*[@id=\"cc_exp_month\"]/option[3]")).click();
	 driver.findElement(By.xpath("//*[@id=\"cc_exp_year\"]/option[13]")).click();
	 driver.findElement(By.xpath("//*[@id=\"cc_cvv\"]")).sendKeys("568");
	 driver.findElement(By.xpath("//*[@id=\"book_now\"]")).click();
	} 
	
//	@Test
//	public void test4() {
//		
//		 WebElement getvalue = driver.findElement(By.xpath("//*[@id=\"order_no\"]"));
//		 String attribute = getvalue.getAttribute("value");
//		
//	}	
		
	@Test
	public void test5() {
		
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"booked_form\"]/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"booked_form\"]/table/tbody/tr[3]/td/input[1]")).click();
//		driver.findElement(By.xpath("//*[@id=\"btn_id_443627\"]")).click();
		driver.switchTo().alert().accept();
		
	}
	
		
		
	}
	
	



	
	




	

