package com.kashyap.LearningSeleniumATB6x.ex_selenium_11072024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab088 {
		@Test
		public void testVWOLoginTitle()
		{
			WebDriver driver = new ChromeDriver();
			driver.get("https://app.vwo.com/#/login");
			
			
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			
			Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");
			Assert.assertEquals(driver.getTitle(), "Login - VWO");
			driver.quit();

			
			
		}

}
