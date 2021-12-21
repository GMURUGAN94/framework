package Org.BaseClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinBookingConfirmpage extends LibGlobal{
	
public AdactinBookingConfirmpage() {
	PageFactory.initElements(driver,this);
	
}
	@FindBy(id="order_no")
	private WebElement orderNo;

	public WebElement getOrderNo() {
		return orderNo;
	}

	
	public String AdactinBookingConfirmpage() {
		String getValues = toGetValues(getOrderNo());
		
		System.out.println(getValues);
		return getValues;
		
		
	}
	
	
	
}
