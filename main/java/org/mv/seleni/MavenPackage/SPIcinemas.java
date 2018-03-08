package org.mv.seleni.MavenPackage;

import org.demo.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SPIcinemas extends BaseClass {
	public SPIcinemas() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//b[@class='dropdown-arrow']")
	private WebElement city;

	@FindBy(xpath = "//li[text()='chennai']")
	private WebElement chennai;

	@FindBy(id = "persist")
	private WebElement remember;

	@FindBy(id = "selectCity")
	private WebElement clickok;

	@FindBy(xpath = "//a[@class='logo float-left']")
	private WebElement logo;

	@FindBy(xpath = "(//*[@title='Now Showing'])[5]")
	private WebElement banner;

	@FindBy(xpath = "//h4[text()='SONU KE TITU KI SWEETY']")
	private WebElement text;

	@FindBy(xpath = "(//a[@class='sign-in'])[1]")
	private WebElement login;

	@FindBy(xpath = "//a[@class='button login-button']")
	private WebElement signing;

	@FindBy(id = "email")
	private WebElement email;

	@FindBy(id = "password")
	private WebElement pass;

	@FindBy(id = "passwordVerify")
	private WebElement repass;

	@FindBy(id = "name")
	private WebElement first;

	@FindBy(id = "lastName")
	private WebElement last;

	@FindBy(xpath="(//input[@type='radio'])[1]")
	private WebElement gender;

	@FindBy(id = "dob")
	private WebElement dob;

	@FindBy(xpath = "//*[@class='ic__month-select']")
	private WebElement month;

	@FindBy(xpath = "//*[@class='ic__year-select']")
	private WebElement year;

	@FindBy(id="register")
	private WebElement register;
	
	public WebElement getRegister() {
		return register;
	}

	public WebElement getText() {
		return text;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getSigning() {
		return signing;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getRepass() {
		return repass;
	}

	public WebElement getFirst() {
		return first;
	}

	public WebElement getLast() {
		return last;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getDob() {
		return dob;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getMob() {
		return mob;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getFlat() {
		return flat;
	}

	public WebElement getPin() {
		return pin;
	}

	public WebElement getCity1() {
		return city1;
	}

	public WebElement getTerms() {
		return terms;
	}

	public WebElement getSubs() {
		return subs;
	}

	public WebElement getRegis() {
		return regis;
	}

	@FindBy(xpath = "//td[text()='25']")
	private WebElement date;

	@FindBy(id = "mobileNumber")
	private WebElement mob;

	@FindBy(id = "address")
	private WebElement flat;

	@FindBy(id = "pincode")
	private WebElement pin;

	@FindBy(id = "city")
	private WebElement city1;

	@FindBy(xpath="(//input[@type='checkbox'])[1]")
	private WebElement terms;

	@FindBy(id = "subscriptionStatus")
	private WebElement subs;

	@FindBy(id = "register")
	private WebElement regis;

	public WebElement getLogo() {
		return logo;
	}

	public WebElement getBanner() {
		return banner;
	}

	public WebElement getRemember() {
		return remember;
	}

	public WebElement getClickok() {
		return clickok;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getChennai() {
		return chennai;
	}
}
