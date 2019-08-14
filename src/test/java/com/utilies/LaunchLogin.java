package com.utilies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchLogin {

	public WebDriver driver;

	public void initializeBrowser(String browser) {
		switch (Constant.BROWSER_NAME) {

		case "chrome":
			System.setProperty("webdriver.chrome.driver", Constant.CHROME_DRIVER_PATH);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			break;

		case "ie":
			System.setProperty("webdriver.ie.driver", Constant.IE_DRIVER_PATH);
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			break;

		case "gecko":
			System.setProperty("webdriver.firefox.driver", Constant.FIREFOX_DRIVER_PATH);
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			break;

		default:
			System.setProperty("webdriver.chrome.driver", Constant.CHROME_DRIVER_PATH);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			break;

		}

	}

	public WebDriver launchUrl(String Url) {
		driver.get(Url);
		return driver;

	}
}
