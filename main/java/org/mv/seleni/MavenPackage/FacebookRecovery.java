package org.mv.seleni.MavenPackage;

import org.demo.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookRecovery extends BaseClass {

	public FacebookRecovery() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(@class, '62c3 ')]")
	private WebElement recover;

	public WebElement getRecover() {
		return recover;
	}
	
	
}

