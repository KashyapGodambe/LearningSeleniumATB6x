package com.kashyap.LearningSeleniumATB6x.ex_selenium_13072024;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.qameta.allure.Description;

public class Lab093 {
	
//	Selenium Project#2 - Mini Project
//
//
//
//
//	open the url - https://katalon-demo-cura.herokuapp.com/
//	click on the make appoinment button
//	verify that url changes - assert
//	time.sleep(3)
//	enter the username, password
//	next page verify the current url
//	make appoinment text on the web page
	
	
// usernaem : John Doe
// password : ThisIsNotAPassword
	@Description("TC#02 - Verify able to make an appoinment & login")
	@Test
	public void testMakeAnAppointmentAndLogin()
	{

		WebDriver driver = new ChromeDriver();
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		WebElement makeAppointmentButton = driver.findElement(By.id("btn-make-appointment"));
		makeAppointmentButton.click();
		
		String newUrl = driver.getCurrentUrl();
		System.out.println(newUrl);
		
		Assert.assertEquals("https://katalon-demo-cura.herokuapp.com/profile.php#login", newUrl);
		
		WebElement username = driver.findElement(By.id("txt-username"));
		username.sendKeys("John Doe");
		
		WebElement password = driver.findElement(By.id("txt-password"));
		password.sendKeys("ThisIsNotAPassword");
		
		WebElement loginButtton = driver.findElement(By.id("btn-login"));
		loginButtton.click();
		
		driver.quit();
		
		
	}
	
	
}
