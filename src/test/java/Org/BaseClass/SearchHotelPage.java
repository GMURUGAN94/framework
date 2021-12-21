package Org.BaseClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends LibGlobal {
	public SearchHotelPage () {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement elmentlocation;
	
	@FindBy(id="hotels")
	private WebElement selecthotel;
	
	@FindBy(id="room_type")
	private WebElement roomtype;
	
	@FindBy(id="room_nos")
	private WebElement roomno;
	
	@FindBy(id="datepick_in")
	private WebElement checkin;
	
	@FindBy (id="datepick_out")
	private WebElement checkout;
	
	@FindBy (id="adult_room")
	private WebElement adultroom;
	
	@FindBy (id="child_room")
	private WebElement childroom;
	
	@FindBy (id="Submit")
	private WebElement btnsubmit;

	public WebElement getElmentlocation() {
		return elmentlocation;
	}

	public WebElement getSelecthotel() {
		return selecthotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomno() {
		return roomno;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getBtnsubmit() {
		return btnsubmit;
	}
	
	
	

public void searchHotel( String location, String selecthotel,String roomtype, String roomnos,String checkindate,String checkoutdate,String adultroom, String childroom) {

	toSelectOptionByText(getElmentlocation(), location);
	toSelectOptionByText(getSelecthotel(), selecthotel);
	toSelectOptionByText(getRoomtype(), roomtype);
	toSelectOptionByText(getRoomno(), roomnos);
	enterText(getCheckin(),checkindate );
	enterText(getCheckout(),checkoutdate );
	toSelectOptionByText(getAdultroom(), adultroom);
	toSelectOptionByText(getChildroom(), childroom);
	click(getBtnsubmit());
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
