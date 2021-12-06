package com.target.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.target.qa.pages.ClearancePage;
import com.target.qa.pages.HomePage;
import com.target.qa.pages.SignInPage;
import com.target.qa.pages.TopDealsPage;
import com.target.qa.pages.WeeklyAdPage;
import com.target.qa.util.CommonElements;
import com.target.qa.util.TestUtil;

public class TopDealsPageTest extends CommonElements{
	
	@Test
	public void verifyTopDealsPageDisplayed(){
		HomePage homePage = new HomePage();
		TopDealsPage topDealsPage = homePage.clickTopDeals();
		Assert.assertTrue(topDealsPage.getPageTitle().contains("Target Coupons"), "Top Deals Link on Deals Not Working");
	}
	
	@Test
	public void verifyDealsOnEveryDayEssentialsSectionDisplayed(){
		HomePage homePage = new HomePage();
		TopDealsPage topDealsPage = homePage.clickTopDeals();
		Assert.assertTrue(topDealsPage.isDealsOnEveryDayEssentialsPresent(), "Deals On Every Day Essentials Section Not Displayed");
	}
	
	@Test
	public void verifySavingWaysCount(){
		HomePage homePage = new HomePage();
		TopDealsPage topDealsPage = homePage.clickTopDeals();
		Assert.assertTrue(topDealsPage.getSavingWays().size()==3, "Saving Ways Count is incorrect");
	}
}
