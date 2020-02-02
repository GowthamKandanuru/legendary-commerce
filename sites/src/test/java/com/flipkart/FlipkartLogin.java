package com.flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;


public class FlipkartLogin {

	WebDriver driver;

	@Test
	public void init() {
		System.setProperty("webdriver.gecko.driver","K:/EclipseProjects/Workplace/First/drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com//");
	}
}
