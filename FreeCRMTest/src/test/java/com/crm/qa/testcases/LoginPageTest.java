package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.DealsPage;
import com.crm.qa.util.TestUtil;

public class LoginPageTest extends TestUtil{

	
	@Test
	public void verifyLoginFunctionality(){
		HomePage homePage = new HomePage();
		DealsPage signInPage = homePage.clickSignIn();
		homePage = signInPage.Login("username", "password");
		Assert.assertTrue(homePage.getAccountName().contains("om prakash"), "Login Functionality Not Working");
		
		
	}
}
