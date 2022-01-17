package pom_script;
import generic.Base_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Facebook_Login extends Base_page
{
	@FindBy(id="email")
	private WebElement uname;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(xpath="//button[.='Log In']")
	private WebElement login;
	
	public Facebook_Login(WebDriver driver)
	{
		super(driver);
	}
	public void setUsername(String un)
	{
		uname.sendKeys(un);
	}
	public void setPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void	clickButton()
	{
		login.click();
	}
}
