package my.Testpages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.mypages.Homepage;
import com.mypages.Loginpage;
import com.mypages.Pagesbase;

import dev.failsafe.internal.util.Assert;

public class LoginTest extends BaseTest{
	
	@Test(priority = 1)
	public boolean verifyLoginPageTitleTest()
	{
		WebElement title=page.getInstance(Loginpage.class).getLoginpagetitle();
		System.out.println(title);
	    Assert.assertEquals("title", "exp");
	}
	@Test(priority = 2)
	public boolean verifyLoginPageHeaderTest()
	{
		String header=page.getInstance(Loginpage.class).getLoginpageheader();
		System.out.println(header);
	    Assert.assertEquals("header", "exp");
	}
	@Test(priority = 3)
	public void verifyHomePageTitleTest()
	{
	Homepage homepage=page.getInstance(Loginpage.class).doLogin("basavaraj123@gmail.com","basu1234");
  String headerhome=homepage.getHomepageheader();
  System.out.println(headerhome);
  Assert.assertEquals("headerhome", "exp");
	}
}
