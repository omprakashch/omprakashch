package com.target.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.target.qa.pages.HomePage;
import com.target.qa.pages.SignInPage;
import com.target.qa.util.CommonElements;
import com.target.qa.util.TestUtil;

public class HomePageTest extends CommonElements{

	
	@Test
	public void verifyLoginFunctionality(){
		HomePage homePage = new HomePage();
		SignInPage signInPage = homePage.clickSignIn();
		homePage = signInPage.Login("username", "password");
		Assert.assertTrue(homePage.getAccountName().contains("om prakash"), "Login Functionality Not Working");	
	}
	
	@Test
	public void verifySignInOptionList(){
		HomePage homePage = new HomePage();
		homePage.clickSignInIcon();
		Assert.assertTrue(homePage.getSignInOptionList().size()==8, "SignIn Options Displayed Incorrectly");	
	}
	
	@Test
	public void verifyTrendingItemsDisplayed(){
		HomePage homePage = new HomePage();
		Assert.assertTrue(homePage.getTrendingItemsList().size()>1, "Trending Items Not Displayed");	
	}
	
	@DataProvider
	public Object[][] getTargetTestData(){
		Object data[][] = TestUtil.getTestData("Registration");
		return data;
	}
	
	@Test(dataProvider = "getTargetTestData")
	public void verifyAccountCreationFunctionality(String email, String firstName, String lastName, String password){
		HomePage homePage = new HomePage();
		SignInPage signInPage = homePage.clickSignIn();
		homePage = signInPage.Login("username", "password");
		Assert.assertTrue(homePage.getAccountName().contains("om prakash"), "Login Functionality Not Working");	
	}
	
	
}
