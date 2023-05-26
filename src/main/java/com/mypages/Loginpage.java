/**
 * 
 */
package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author welcome
 *
 */
public abstract class Loginpage extends Pagesbase {
	public Loginpage(WebDriver driver, WebDriverWait wait)
	{
		super();
		
	}
	
	//page loactors
	
	private By emailid=By.id("username");
	private By password=By.id("pwd");
	private By loginbutton=By.id("login");
	private By header=By.xpath("exp");
	
	public WebElement getEmailid() {
		return getElement(emailid);
	}

	}
	public WebElement getPassword() {
		return getElement(password);
	}

	}
	public  WebElement getLoginbutton() {
		return getElement(loginbutton);
	}
	
	
	public WebElement getHeader() {
		return getElement(header);
	}

	public WebElement getLoginpagetitle()
	{
		return getPageTitle();
	}
	
	public String getLoginpageheader()
	{
		getPageHeader(header);
	}
	public Homepage doLogin(String username,String pwd)
	{
		
	getEmailid().sendKeys(username);
	getPassword().sendKeys(pwd);
	getLoginbutton().click();
	 
	return getInstance(Homepage.class);
	}
	
	public void doLogin()
	{
		
	getEmailid().sendKeys();
	getPassword().sendKeys();
	getLoginbutton().click();
	 
	
	}
	
	
	
	
	
}


	
