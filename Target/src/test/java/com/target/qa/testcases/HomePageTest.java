package com.target.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.target.qa.pages.HomePage;
import com.target.qa.pages.SignInPage;
import com.target.qa.util.TestUtil;

public class HomePageTest extends TestUtil{

	
	@Test
	public void verifyLoginFunctionality(){
		HomePage homePage = new HomePage();
		SignInPage signInPage = homePage.clickSignIn();
		homePage = signInPage.Login("omprakashnaidu.ch@gmail.com", "Prakash@143");
		Assert.assertTrue(homePage.getAccountName().contains("om prakash"), "Login Functionality Not Working");
		
		
	}
}
