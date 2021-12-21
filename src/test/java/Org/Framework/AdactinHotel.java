package Org.Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinHotel {
	WebDriver driver;

	public void Browserlaunch(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);

	}

	public void Login(String userx, String passx, String user, String pass) {

		WebElement txtuser = driver.findElement(By.id(userx));
		txtuser.sendKeys(user);

		WebElement txtpass = driver.findElement(By.id(passx));
		txtpass.sendKeys(pass);

		WebElement btnlogin = driver.findElement(By.id("login"));
		btnlogin.click();
		
	}

	public void Searchhotel(String location, String hotel, String searchhotel) {

		WebElement clklocation = driver.findElement(By.xpath(location));
		clklocation.click();

		WebElement srchhotl = driver.findElement(By.xpath(hotel));
		srchhotl.click();

		WebElement clksearch = driver.findElement(By.xpath(searchhotel));
		clksearch.click();
	}

	public void Bookinghotel(String button, String continuee) {
		WebElement clkbutton = driver.findElement(By.xpath(button));
		clkbutton.click();
		WebElement clkcontinuee = driver.findElement(By.xpath(continuee));
		clkcontinuee.click();
	}

	public void Bookingconfirmation(String fname, String lname, String addrs, String cc, String cct, String exdate,
			String exyr, String cvv, String book) {

		WebElement firstname = driver.findElement(By.xpath(fname));
		firstname.sendKeys("murugan");

		WebElement lastname = driver.findElement(By.xpath(lname));
		lastname.sendKeys("raj");

		WebElement address = driver.findElement(By.xpath(addrs));
		address.sendKeys("No.7 omr chennai");

		WebElement crecard = driver.findElement(By.xpath(cc));
		crecard.sendKeys("8234569598563217");

		WebElement cctype = driver.findElement(By.xpath(cct));
		cctype.click();

		WebElement exd = driver.findElement(By.xpath(exdate));
		exd.click();
		WebElement exyear = driver.findElement(By.xpath(exyr));
		exyear.click();

		WebElement ccvn = driver.findElement(By.xpath(cvv));
		ccvn.sendKeys("345");

		WebElement bk = driver.findElement(By.id(book));
		bk.click();
	}

	public String Orderid(String printid) throws InterruptedException {
		Thread.sleep(5000);
		WebElement print = driver.findElement(By.xpath(printid));

		String attribute = print.getAttribute("value");

		System.out.println(attribute);
		return attribute;

	}

}
