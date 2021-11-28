package com.target.qa.pages;
import com.target.qa.util.TestUtil;

public class SignInPage extends TestUtil{
	
	String emailInputField = "//input[@name='username']";
	String passwordInputField = "//input[@name='password']";
	String signInButton = "//button[@id='login']";
	String skipLink = "//a[contains(text(),'Skip')]";
	
	public HomePage Login(String userName, String password){
		enterText(emailInputField,userName);
		enterText(passwordInputField,password);
		click(signInButton);
		//click(skipLink);
		return new HomePage();
	}

}
