package org.mv.seleni.MavenPackage;

import org.demo.base.BaseClass;
import org.openqa.selenium.WebDriver;

import net.bytebuddy.jar.asm.commons.GeneratorAdapter;

public class RegisterPageTest extends BaseClass{

	public static void main(String[] args) throws Throwable {
		getDriver("http://demoqa.com/registration/");
		RegisterPage demo =new RegisterPage();
		setText(demo.getFirstName(), getDataExcel(1, "First Name"));
		setText(demo.getLastName(), getDataExcel(1, "Last Name"));
		setText(demo.getMob(), getDataExcel(1, "Phone Number"));
		click(demo.getRadioBtn());
		click(demo.getCheckBox());
		selectVisible(demo.getCountry(), getDataExcel(1,"Country"));
		selectVisible(demo.getMon(), getDataExcel(1,"Month"));
		selectVisible(demo.getYear(), getDataExcel(1,"Year"));
		selectVisible(demo.getDate(), getDataExcel(1,"Date"));
		setText(demo.getUserName(), getDataExcel(1,"Usrname"));
		setText(demo.getEmail(), getDataExcel(1,"Email"));
		setText(demo.getAboutMe(), getDataExcel(1,"About yourself"));
		setText(demo.getPass(), getDataExcel(1,"PassWord"));
		setText(demo.getAgainPass(), getDataExcel(1,"Again Pass"));
	}
	
}
