/**
 * 
 */
package my.Testpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;
import com.mypages.BasePage;
import com.mypages.Pagesbase;

/**
 * @author welcome
 *
 */
public class BaseTest extends Pagesbase{
WebDriver driver;
Pagesbase page;

@BeforeMethod
@Parameter(value= {"browser"});
public void Setuptest(String browser)
{
	if(browser.equals("chrome"))
	{
		driver=new ChromeDriver();
	}
	elseif(browser.equals("FF"))
	{
		driver=new FirefoxDriver();
	}
	else
	{
		System.out.println("No broser is defined in xml file");
	}
	
	driver.get("url");
	try
	{
		Thread.sleep(6000);
	}
	catch(InterruptedException e)
	{
		e.printStackTrace();
	page=new BasePage(driver, wait);
}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
	
	

}
