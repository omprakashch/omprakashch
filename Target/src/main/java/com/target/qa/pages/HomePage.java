package com.target.qa.pages;
import com.target.qa.util.TestUtil;

public class HomePage extends TestUtil{
	
	String SignInIcon = "//span[contains(text(),'Sign in')]";
	String SignInLink = "//div[contains(text(),'Sign in')]";
	String AccountName = "//span[contains(text(),'my account')]/following-sibling::span";
	
	
	
	
	public SignInPage clickSignIn(){
		click(SignInIcon);
		jseClick(SignInLink);
		return new SignInPage();
	}
	
	public String getAccountName(){
		return getText(AccountName);
	}

}
