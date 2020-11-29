package com.ecom.amazon.tests.Amazon.Tests;

import org.openqa.selenium.WebDriver;

public class RunEnvironment {
		public static  WebDriver Webdriver;

		public static WebDriver getWebdriver() {
			return Webdriver;
		}

		public static void setWebdriver(WebDriver webdriver) {
			Webdriver = webdriver;
		}
}
