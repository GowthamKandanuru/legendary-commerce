package com.flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;


public class FlipkartLogin {

	WebDriver driver;

	@Test
	public void init() {
		System.setProperty("webdriver.gecko.driver","K:/EclipseProjects/Workplace/First/drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//input[@type='text'][@class='_2zrpKA _1dBPDZ']")).sendKeys("8332056542");
	}
	
}
