package org.mv.seleni.MavenPackage;

import org.demo.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLogin extends BaseClass {
	public FacebookLogin() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement email;

	@FindBy(id = "pass")
	private WebElement password;

	@FindBy(xpath = "//input[@value='Log In']")
	private WebElement login;

	@FindBy(xpath="//i[@class=\"fb_logo img sp_m7lN5cdLBIi sx_fe9e91\"]")
	private WebElement logo;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getLogo() {
		return logo;
	}
	
	
	

}
