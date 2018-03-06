package org.mv.seleni.MavenPackage;

import org.demo.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends BaseClass {

	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "name_3_firstname")
	private WebElement firstName;

	@FindBy(id = "name_3_lastname")
	private WebElement lastName;

	@FindBy(xpath = "//input[@value='single']")
	private WebElement radioBtn;

	@FindBy(xpath = "//input[@value='dance']")
	private WebElement checkBox;

	@FindBy(id = "phone_9")
	private WebElement mob;

	@FindBy(id = "mm_date_8")
	private WebElement mon;

	@FindBy(id = "dd_date_8")
	private WebElement date;

	@FindBy(id = "yy_date_8")
	private WebElement year;

	@FindBy(id = "dropdown_7")
	private WebElement country;

	@FindBy(id = "username")
	private WebElement userName;

	@FindBy(id = "email_1")
	private WebElement email;

	@FindBy(id = "description")
	private WebElement aboutMe;

	@FindBy(id = "password_2")
	private WebElement pass;

	@FindBy(id = "confirm_password_password_2")
	private WebElement againPass;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getRadioBtn() {
		return radioBtn;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getMob() {
		return mob;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getAboutMe() {
		return aboutMe;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getAgainPass() {
		return againPass;
	}

	public WebElement getMon() {
		return mon;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getYear() {
		return year;
	}

}
