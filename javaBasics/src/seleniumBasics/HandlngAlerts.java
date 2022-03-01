package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlngAlerts {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.findElement(By.linkText("JavaScript Alerts")).click();
	driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(1) > button")).click();
	Thread.sleep(5000);
	driver.switchTo().alert().accept();
	driver.close();
}
}
