package com.kashyap.LearningSeleniumATB6x.ex_selenium_16072024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.qameta.allure.Description;

public class Lab094 {
//	Selenium Mini Project #3
//
//
//
//
//	Open the URL - https://www.idrive360.com/enterprise/login
//	Enter the username, password
//	Verify that Trial is fnished and current URL also
//	Add a logic to add Allure Screen for the Trail end.

//		
//	123456
	
	
	
	
	@Description("TC#03 - Verify able to login")
	@Test
	public void testVerifytAndLogin()
	{

		WebDriver driver = new ChromeDriver();
		driver.get(" https://www.idrive360.com/enterprise/login");
		
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("augtest_040823@idrive.com");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("123456");
		
		WebElement siginButton = driver.findElement(By.xpath("//button[@id=\"frm-btn\"]"));
		siginButton.click();
		
		
		
		//driver.quit();
	
	}
	
}
