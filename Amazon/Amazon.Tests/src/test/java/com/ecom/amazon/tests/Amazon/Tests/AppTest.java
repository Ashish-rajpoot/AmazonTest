package com.ecom.amazon.tests.Amazon.Tests;


import static org.testng.Assert.assertEquals;

//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	WebDriver driver;
	final String amazonUrl = "https://www.amazon.in/";
	final String chromeDriverPath ="F:\\Drivers\\driver\\chromedriver.exe";
	
	@Test(groups="chrome")
		public void launchChrome() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", chromeDriverPath);
			WebDriver driver = new ChromeDriver();
			driver.get(amazonUrl);
			Thread.sleep(10000);
		}
	@Test(groups="chrome",dependsOnMethods = "launchChrome")
	void verifyAmazonSite() {
		assertEquals(driver.getCurrentUrl(), amazonUrl);
	}
}
