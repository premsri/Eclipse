package org.mv.seleni.MavenPackage;

import org.demo.base.BaseClass;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SpicinemasTest extends BaseClass {
	
	@Before
	public void launch() {
		launchBrowser("chrome", "https://www.spicinemas.in/");
	}
		@Test
		public void verify() throws Throwable {
		SPIcinemas s =new SPIcinemas();
		Assert.assertTrue(s.getLogo().isDisplayed());
		click(s.getCity());
		moveOver(s.getChennai());
		click(s.getChennai());
		click(s.getRemember());
		click(s.getClickok());
		Thread.sleep(3000);
		click(s.getLogin());
		Thread.sleep(10000);
		moveOver(s.getSigning());
		click(s.getSigning());
		setText(s.getEmail(), getDataExcel(0, "Email"));
		setText(s.getPass(), getDataExcel(0, "Password"));
		setText(s.getRepass(), getDataExcel(0, "AgainPass"));
		setText(s.getFirst(), getDataExcel(0, "FirstName"));
		setText(s.getLast(), getDataExcel(0, "LastName"));
		Thread.sleep(3000);
		javascript(driver);
		Thread.sleep(3000);
		click(s.getDob());
		selectVisible(s.getMonth(), getDataExcel(0, "Month"));
		selectVisible(s.getYear(), getDataExcel(0, "Year"));
		click(s.getDate());
		String setText = setText(s.getMob(), getDataExcel(0, "Mobile"));
		Assert.assertEquals("9987042504", setText );
		setText(s.getFlat(), getDataExcel(0, "Flat"));
		setText(s.getPin(), getDataExcel(0, "Pin"));
		setText(s.getCity1(), getDataExcel(0, "City"));
		
		
	}
		
		@After
		public void quit() {
			quit();
		}
}
