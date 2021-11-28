package com.target.qa.util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.target.qa.base.TestBase;

public class TestUtil extends TestBase {

	public static long PAGE_LOAD_TIMEOUT = 60;
	public static long IMPLICIT_WAIT = 25;
	
	public WebElement getElement(String objPath){
		WebElement element = null;
		if(objPath.startsWith("//"))
			element = driver.findElement(By.xpath(objPath));
		else if(objPath.startsWith("#"))
			element = driver.findElement(By.cssSelector(objPath));
		else
			element = driver.findElement(By.id(objPath));
		return element;	
	}
	
	public void click(String elementPath){
		getElement(elementPath).click();
	}
	
	public String getText(String elementPath){
		return getElement(elementPath).getText();
	}
	
	public String getAttribute(String elementPath){
		return getElement(elementPath).getAttribute("value");
	}
	
	public void enterText(String elementPath, String inputText){
		getElement(elementPath).sendKeys(inputText);
	}
	
	public void scrollToAndClick(String elementPath){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", getElement(elementPath));
	}
	
	public void jseClick(String elementPath){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", getElement(elementPath));
	}
}
