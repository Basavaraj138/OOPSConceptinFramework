/**
 * 
 */
package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author welcome
 *
 */
public  class BasePage extends Pagesbase{
	
	public BasePage(WebDriver driver, WebDriverWait wait) {
		super();
		
	}

	@Override
	public String getPageTitle() {
		return driver.getTitle();
	}

	@Override
	public String getPageHeader(By Locator) {
		return getElement(Locator).getText();
	}

	@Override
	public WebElement getElement(By Locator) {
		WebElement element=null;
		try
		{
			return element=driver.findElement(Locator);
		}
		catch(Exception e)
		{
			System.out.println("some error/exception occured while creating an element"+Locator.toString());
			e.printStackTrace();
		}
		return element;
	}

	@Override
	public void waitForElementPresent(By Locator) {
		try
		{ wait.until(ExpectedConditions.presenceOfElementLocated(Locator));
		}
		catch(Exception e)
		{
			System.out.println("some error/exception occured while creating an element"+Locator.toString());
			e.printStackTrace();
		}
		
	}

	@Override
	public String waitForPageTitle(String title) {
		try
		{
			wait.until(ExpectedConditions.titleContains(title));
		}
		catch(Exception e)
		{
			System.out.println("some error/exception occured while creating an element"+title);
			e.printStackTrace();
		}
		return title;
	}

}
