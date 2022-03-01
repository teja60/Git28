package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrorMessage {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		driver.findElement(By.id("email")).sendKeys("baatmaaaaan@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("batmaaan123");
		driver.findElement(By.name("login")).click();
		String actualErrMsg=driver.findElement(By.cssSelector("#email_container > div._9ay7")).getText();
		String expectedErrMsg="The email you entered isn’t connected to an account. Find your account and log in.";
		if (actualErrMsg.equals(expectedErrMsg)) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
	}

}
