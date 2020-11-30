package com.ecom.amazon.tests.Amazon.Tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class loginAuth {
	@Before
	public void openBrowser() {
		App.initBrowser();	
	}
	@org.junit.Test
	public void login() throws InterruptedException {
		final String amazonUrl = "https://www.amazon.in/";
		WebDriver driver = RunEnvironment.getWebdriver();
		driver.get(amazonUrl);
		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]")).click();
		Thread.sleep(1000);
	}
	@After
	public void closeBrowser() throws InterruptedException {
		App.closeBrowser();
		Thread.sleep(1000);
	}
}
