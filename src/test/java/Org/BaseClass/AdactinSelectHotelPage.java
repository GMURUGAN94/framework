package Org.BaseClass;

import javax.swing.text.Element;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinSelectHotelPage extends LibGlobal{
public AdactinSelectHotelPage () {
	PageFactory.initElements(driver, this);
}
	
	@FindBy(id="radiobutton_0")
	private WebElement clkradiobtn;
	
	@FindBy(id="continue")
	private WebElement clkcontinue;

	public WebElement getClkradiobtn() {
		return clkradiobtn;
	}

	public WebElement getClkcontinue() {
		return clkcontinue;
	}
	
	public void AdactinSelectHotelPage() {
		
		click(getClkradiobtn());
		click(getClkcontinue());
		
		
	}
	
	
	
}
