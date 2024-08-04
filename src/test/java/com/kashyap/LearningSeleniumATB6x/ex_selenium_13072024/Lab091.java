package com.kashyap.LearningSeleniumATB6x.ex_selenium_13072024;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab091 {
	@Test
	public void testVerifyFreeTrial() {
//		EdgeOptions options =  new EdgeOptions();
//		options.addArguments("--guest");
//		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
//		WebDriver driver = new EdgeDriver(options);

		WebDriver driver = new ChromeDriver();
		driver.get("https://app.vwo.com/#/login");

		Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");
		Assert.assertEquals(driver.getTitle(), "Login - VWO");

		WebElement freeTrial = driver.findElement(By.linkText("Start a free trial"));
		freeTrial.click();

		WebElement enterEmail = driver.findElement(By.id("page-v1-step1-email"));
		enterEmail.sendKeys("admin@admin.com");

		WebElement checkBox = driver.findElement(By.name("gdpr_consent_checkbox"));
		checkBox.click();

		List<WebElement> buttonList = driver.findElements(By.tagName("button"));
		buttonList.get(0).click();

		WebElement errormsgEmailExists = driver.findElement(By.className("invalid-reason"));
		System.out.println("Error of email already exists ::::::::::" + errormsgEmailExists.getText());

		//Assert.assertEquals(errormsgEmailExists.getText(), "An account with this email already exists. Login Here");
		
		driver.quit();
		
		
		
	}

}
