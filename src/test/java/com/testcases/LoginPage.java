package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.utilies.LaunchLogin;

public class LoginPage extends LaunchLogin {
	@Test
	public void loginapp() {
		LoginPage browser = new LoginPage();
		browser.initializeBrowser("chrome");
		browser.launchUrl("http://demo.guru99.com/V4/index.php");
		WebElement username = driver.findElement(By.name("uid"));
		username.sendKeys("Arojofina");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("123456jJ");
		WebElement login = driver.findElement(By.name("btnLogin"));
		login.click();

	}

}
