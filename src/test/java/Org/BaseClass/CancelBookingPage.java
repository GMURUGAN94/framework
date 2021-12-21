package Org.BaseClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.interactions.ClickAndHoldAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelBookingPage extends LibGlobal {
	public CancelBookingPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "/html/body/table[2]/tbody/tr[1]/td[2]/a[2]")
	private WebElement clkbookit;

	@FindBy(xpath = "//*[@id=\"order_id_text\"]")
	private WebElement searchbox;

	@FindBy(name = "search_hotel_id")
	private WebElement gobtn;

//	@FindBy(xpath = "//input[@value='0C9BO0RX87']")
//	private WebElement chkbox;
//
	@FindBy(id = "check_all")
	private WebElement clkchkbox;

	@FindBy(id = "cancelall")
	private WebElement clkcancel;

	
	
	public WebElement getClkbookit() {
		return clkbookit;
	}

	public WebElement getSearchbox() {
		return searchbox;
	}

	public WebElement getGobtn() {
		return gobtn;
	}

//	public WebElement getChkbox() {
//		return chkbox;
//	}

	public WebElement getClkchkbox() {
		return clkchkbox;
}

	public WebElement getClkcancel() {
		return clkcancel;
	}

	public void cancelBooking(String orderid) throws InterruptedException {
		click(clkbookit);
		enterText(getSearchbox(), orderid);

		click(getGobtn());
//		click(chkbox);
	click(getClkchkbox());
		click(getClkcancel());
		toSimpleAlert();

	}

}
