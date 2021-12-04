package com.crm.qa.pages;
import com.crm.qa.util.TestUtil;

public class HomePage extends TestUtil{
	
	String SignInIcon = "//span[contains(text(),'Sign in')]";
	String SignInLink = "//div[contains(text(),'Sign in')]";
	String AccountName = "//span[contains(text(),'my account')]/following-sibling::span";
	
	
	
	
	public DealsPage clickSignIn(){
		click(SignInIcon);
		jseClick(SignInLink);
		return new DealsPage();
	}
	
	public String getAccountName(){
		return getText(AccountName);
	}

}
