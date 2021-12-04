package com.crm.qa.pages;
import com.crm.qa.util.TestUtil;

public class DealsPage extends TestUtil{
	
	String emailInputField = "//input[@name='username']";
	String passwordInputField = "//input[@name='password']";
	String signInButton = "//button[@id='login']";
	String skipLink = "//a[contains(text(),'Skip')]";
	
	public HomePage Login(String userName, String password){
		enterText(emailInputField,prop.getProperty(userName));
		enterText(passwordInputField,prop.getProperty(password));
		click(signInButton);
		//click(skipLink);
		return new HomePage();
	}

}
