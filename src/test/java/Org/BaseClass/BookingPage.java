package Org.BaseClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPage extends LibGlobal {
	public BookingPage () {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private WebElement txtfirstname;

	@FindBy(id = "last_name")
	private WebElement txtlastname;

	@FindBy(id = "address")
	private WebElement txtaddress;

	@FindBy(id = "cc_num")
	private WebElement txtccnumber;

	@FindBy(id = "cc_type")
	private WebElement txtcctype;

	@FindBy(id = "cc_exp_month")
	private WebElement txtccexpmnth;

	@FindBy(id = "cc_exp_year")
	private WebElement txtexpyr;

	@FindBy(id = "cc_cvv")
	private WebElement txtcvv;

	@FindBy(id = "book_now")
	private WebElement clkbook;

	public WebElement getTxtfirstname() {
		return txtfirstname;
	}

	public WebElement getTxtlastname() {
		return txtlastname;
	}

	public WebElement getTxtaddress() {
		return txtaddress;
	}

	public WebElement getTxtccnumber() {
		return txtccnumber;
	}

	public WebElement getTxtcctype() {
		return txtcctype;
	}

	public WebElement getTxtccexpmpnth() {
		return txtccexpmnth;
	}

	public WebElement getTxtexpyr() {
		return txtexpyr;
	}

	public WebElement getTxtcvv() {
		return txtcvv;
	}

	public WebElement getClkbook() {
		return clkbook;
	}

	public void BookingPage(String firstname, String lastname, String address, String ccnum, String cctype,
			String expmnth, String expyr, String cvv) {

		enterText(getTxtfirstname(), firstname);
		enterText(getTxtlastname(), lastname);
		enterText(getTxtaddress(), address);
		enterText(getTxtccnumber(), ccnum);
		enterText(getTxtcctype(), cctype);
		enterText(getTxtccexpmpnth(), expmnth);
		enterText(getTxtexpyr(), expyr);
		enterText(getTxtcvv(), cvv);
		click(getClkbook());

	}
}