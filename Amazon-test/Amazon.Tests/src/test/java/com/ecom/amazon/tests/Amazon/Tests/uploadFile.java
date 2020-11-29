package com.ecom.amazon.tests.Amazon.Tests;

import java.io.IOException;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class uploadFile {

	@Before
	public void openBrowser() {
		App.initBrowser();	
	}
	@After
	public void closeBrowser() throws InterruptedException {
		App.closeBrowser();
		Thread.sleep(1000);
	}
	@Test
	public void login() throws InterruptedException, IOException {
		final String siteUrl = "https://www.grammarly.com/plagiarism-checker";
		final String uploadFilePath = "F:\\Selenium Project\\Amazon-test\\grammerCheck.txt";
//		final String autoitExePath = "F:\\Selenium Project\\Amazon-test\\grammerCheck.exe";
		WebDriver driver = RunEnvironment.getWebdriver();
		driver.get(siteUrl);
		driver.findElement(By.xpath("//*[@id=\"file-upload-form\"]/label/div")).click();
		Thread.sleep(2000);
//		Runtime.getRuntime().exec(autoitExePath+" "+uploadFilePath);
		Runtime.getRuntime().exec("F:\\Selenium Project\\Amazon-test\\grammerCheck.exe"+" "+uploadFilePath);
	}

}

