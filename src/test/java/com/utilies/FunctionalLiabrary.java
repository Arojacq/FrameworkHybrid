package com.utilies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class FunctionalLiabrary {
	WebDriver driver;

	@BeforeClass
	public WebDriver launchUrl() {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		return driver;
		
	}
	@AfterClass
	public void closeUrl() {
		driver.quit();
	}
}
