package com.ecom.amazon.tests.Amazon.Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import okhttp3.OkHttpClient;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void initBrowser() {

		
		final String chromeDriverPath ="F:\\Drivers\\driver\\chromedriver.exe";
		OkHttpClient okhttpClient = new OkHttpClient().newBuilder().connectTimeout(100, TimeUnit.SECONDS)
				.build();
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		WebDriver driver = new ChromeDriver();
		RunEnvironment.setWebdriver(driver);
		
	}
	public static void closeBrowser() {
		RunEnvironment.getWebdriver().quit();
	}
}
