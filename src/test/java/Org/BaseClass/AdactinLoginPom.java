package Org.BaseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Ordering;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinLoginPom extends LibGlobal {

	public static void main(String[] args) throws InterruptedException {
		LibGlobal global = new LibGlobal();
		WebDriver driver = global.getDriver();
		global.url("https://adactinhotelapp.com/");

		AdactinLoginPage loginpage = new AdactinLoginPage();
		loginpage.loginpage("MURUGANG94", "12494612");

		SearchHotelPage searchpage = new SearchHotelPage();
		searchpage.searchHotel("Sydney", "Hotel Creek", "Double", "3 - Three", "18/08/2021", "18/08/2021", "3 - Three",
				"3 - Three");

		AdactinSelectHotelPage selecthotel = new AdactinSelectHotelPage();
		selecthotel.AdactinSelectHotelPage();

		BookingPage bookpage = new BookingPage();

		bookpage.BookingPage("murugan", "g", "omr chennai", "9632587412589632", "American Express", "January", "2018",
				"235");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		AdactinBookingConfirmpage confirmpage=new AdactinBookingConfirmpage();
		String id = confirmpage.AdactinBookingConfirmpage();
		
		CancelBookingPage Cancelpage=new CancelBookingPage();
		Cancelpage.cancelBooking(id);
		
				
//		global.closeallwindows();
	}
}
