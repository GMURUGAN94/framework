package Org.BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinLoginPage extends LibGlobal {
 
public	AdactinLoginPage () {
	PageFactory.initElements(driver, this);
}
	
	

	@FindBy(id = "username")
	private WebElement txtusername;

	@FindBy(id = "password")
	private WebElement txtpassword;

	@FindBy(id = "login")
	private WebElement btnlogin;

	public WebElement getTxtusername() {
		return txtusername;
	}

	public WebElement getTxtpassword() {
		return txtpassword;
	}

	public WebElement getLogin() {
		return btnlogin;
	}
	
	
	public void loginpage(String username, String password) {
		

		enterText(getTxtusername(), username);
		enterText(getTxtpassword(),password);
		click(getLogin());
	}

	

}	
	





