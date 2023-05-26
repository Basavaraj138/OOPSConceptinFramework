package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Pagesbase {
	public WebDriver driver;
	public WebDriverWait wait;

	
	// page class constructor:
	public void Page(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}
	//ABSTRACT METHODS
	public abstract WebElement getPageTitle();
	public abstract String getPageHeader(By Locator);
	public abstract WebElement getElement(By Locator);
	public abstract void waitForElementPresent(By  Locator);
	public abstract String waitForPageTitle(String title);

	// create a method with Java Generic and return a new page
	public <TPage extends BasePage> TPage getInstance(Class<TPage> pageClass) {
		try {
			return pageClass.getDeclaredConstructor(WebDriver.class, WebDriverWait.class).newInstance(this.driver, this.wait);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	

}
