/**
 * 
 */
package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.bytebuddy.implementation.bind.annotation.Super;

/**
 * @author welcome
 *
 */
public class Homepage extends Pagesbase{
	public Homepage(WebDriver driver)
	{
		super();
	}
   
	private By header=By.className("exp");
	
	public WebElement getHeader() {
		return getElement(header);
	}

	public String getHomepagetitle()
	{
		return getHomepagetitle();
	}
	public String getHomepageheader()
	{
		return getHomepageheader();
	}
}
