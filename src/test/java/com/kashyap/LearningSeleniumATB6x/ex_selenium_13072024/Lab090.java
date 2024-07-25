package com.kashyap.LearningSeleniumATB6x.ex_selenium_13072024;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab090 {
	@Test
	public void testVWOLoginNegative()
	{
//		EdgeOptions options =  new EdgeOptions();
//		options.addArguments("--guest");
//		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
//		WebDriver driver = new EdgeDriver(options);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.vwo.com/#/login");
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");
		Assert.assertEquals(driver.getTitle(), "Login - VWO");
		
		WebElement emailInputBox = driver.findElement(By.id("login-username"));
		emailInputBox.sendKeys("admin@admin.com");
		
		WebElement passwordInputBox = driver.findElement(By.id("login-password"));
		passwordInputBox.sendKeys("password@321");
		
		WebElement signInButton = driver.findElement(By.id("js-login-btn"));
		signInButton.click();
		
		try
		{
			Thread.sleep(500);
		}
		catch(InterruptedException e)
		{
			throw new RuntimeException(e);
		}
		
		
		//Verify the error message
		
		WebElement errorMsg = driver.findElement(By.id("js-notification-box-msg"));
		Assert.assertEquals(errorMsg.getText(), "Your email, password, IP address or location did not match");
		
		
		WebElement freeTrial = driver.findElement(By.linkText("Start a free trial"));
		freeTrial.click();
		
	}

}
