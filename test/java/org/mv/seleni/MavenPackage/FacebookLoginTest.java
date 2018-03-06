package org.mv.seleni.MavenPackage;

import org.demo.base.BaseClass;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FacebookLoginTest extends BaseClass {
	
	static FacebookLogin fbl;
	static FacebookRecovery fbr;
	
	@Before
	public void launchbrowser() {
		 driver = getDriver("https://www.facebook.com/");		
	}

	@Test
	public void verifylogin() {
		fbl =new FacebookLogin();
		fbr =new FacebookRecovery();
		Assert.assertTrue(fbl.getLogo().isDisplayed());
		String setemail = setText(fbl.getEmail(), "premsri2504@gmail.com");
		Assert.assertEquals("premsri2504@gmail.com", setemail);
		String setpass = setText(fbl.getPassword(), "9987042504");
		Assert.assertEquals("9987042504", setpass);
		click(fbl.getLogin());
		Assert.assertTrue(fbr.getRecover().isDisplayed());
	}

	@After
	public void closeBrowser() {
		driverQuit(driver);
	}
}
