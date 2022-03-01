package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyPageTitle {
	WebDriver driver;
	@BeforeTest
	public void openApplication() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void verifyTitle() {
		String actualTitle=driver.getTitle();
		String expectedTitle="Facebook - Log In or Sign Up";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	
	@AfterTest
	public void closeApplication() {
		driver.close();
	}
	
	
}
