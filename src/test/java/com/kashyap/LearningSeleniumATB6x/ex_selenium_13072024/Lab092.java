package com.kashyap.LearningSeleniumATB6x.ex_selenium_13072024;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;

public class Lab092 {
	
	//Selenium Project #1


	// [Assignment] - Automating the Login Page of VWO.com
	//Fetch the locators - https://app.vwo.com/
	//Create a Maven project and add TestNG.
	//Add the Allure Report (Allure TestNG)
	//Automate the two Test cases of VWO.com
	//Valid Username and Valid Password
	//Verify name on dashboard page.
	//Run them and share results.
	//Push the code to github.com
	//Git repo - ReadMe.md a Screen shot of allure.//

	@Description("TC#01 - Verify login with valid credentials")
	@Test
	public void testLoginWithValidCreds() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.vwo.com/#/login");

		WebElement username = driver.findElement(By.id("login-username"));
		username.sendKeys("vwo@1secmail.com");
		
		WebElement password = driver.findElement(By.id("login-password"));
		password.sendKeys("Vwo@1234");
		
		WebElement signInButtton = driver.findElement(By.xpath("//span[text()='Sign in']"));
		signInButtton.click();
		
		Thread.sleep(8000);
		
		WebElement dashboardMsg = driver.findElement(By.xpath("//p[@data-qa='page-sub-title']"));
		String dashboardMsgText = dashboardMsg.getText();
		System.out.println(dashboardMsgText);
		
		
		Assert.assertEquals("Hi V W, here's an overview of your experience optimization journey", dashboardMsgText);
		
		driver.quit();
		
		
	}
}
