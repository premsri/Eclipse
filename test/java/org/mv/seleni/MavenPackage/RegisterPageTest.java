package org.mv.seleni.MavenPackage;

import org.demo.base.BaseClass;
import org.openqa.selenium.WebDriver;

public class RegisterPageTest extends BaseClass{

	public static void main(String[] args) throws Throwable {
		WebDriver driver = getDriver("http://demoqa.com/registration/");
		RegisterPage demo =new RegisterPage();
		String c1  = (String) dataDriven("demo", 1, 1);
		setText(demo.getFirstName(), c1);
		String c2 = (String) dataDriven("demo", 2, 1);
		setText(demo.getLastName(), c2);
		click(demo.getRadioBtn());
		click(demo.getCheckBox());
		String c3= (String) dataDriven("demo", 3, 1);
		setText(demo.getMob(),c3);
		String c4= (String) dataDriven("demo", 4, 1);
		setText(demo.getUserName(), c4);
		String c5= (String) dataDriven("demo", 5, 1);
		setText(demo.getEmail(), c5);
		String c6= (String) dataDriven("demo", 6, 1);
		setText(demo.getAboutMe(), c6);
		String c7= (String) dataDriven("demo", 7, 1);
		setText(demo.getPass(), c7);
		String c8= (String) dataDriven("demo", 8, 1);
		setText(demo.getAgainPass(), c7);
		String c9= (String) dataDriven("demo", 9, 1);
		selectVisible(demo.getCountry(), c9);
		String c10= (String) dataDriven("demo", 10, 1);
		selectVisible(demo.getMon(), c10);
		String c11= (String) dataDriven("demo", 11, 1);
		selectVisible(demo.getYear(), c11);
		String c12= (String) dataDriven("demo", 12, 1);
		selectVisible(demo.getDate(), c12);
		
	}
	
}
