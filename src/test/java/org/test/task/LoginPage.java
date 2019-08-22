package org.test.task;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base{
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement txtUserName;
	@FindBy(id="pass")
	private WebElement txtPwd;
	@FindBy(xpath="//input[@value='Log In']")
	private WebElement loginBtn;
	
	public WebElement getTxtUserName() {
		return txtUserName;
	}
	public WebElement getTxtPwd() {
		return txtPwd;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}

}
