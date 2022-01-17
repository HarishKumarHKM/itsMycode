package test_script;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Valid_login 

{
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./soft/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
	}
	

}
