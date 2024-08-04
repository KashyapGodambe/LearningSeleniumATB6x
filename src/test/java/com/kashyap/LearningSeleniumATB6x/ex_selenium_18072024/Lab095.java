package com.kashyap.LearningSeleniumATB6x.ex_selenium_18072024;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.qameta.allure.Description;

public class Lab095 {

	WebDriver driver;

	@BeforeTest
	public void openBrowser() {
		ChromeOptions option = new ChromeOptions();
		option.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		option.addArguments("--guest");
		driver = new ChromeDriver(option);

	}

	@Test(groups = "QA")
	@Description("TC#01 - Verify if able to print titles & price")
	public void testPrintTitleAndPrice() throws InterruptedException {

		driver.navigate().to("https://www.ebay.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

		WebElement searchBox = driver.findElement(By.cssSelector("#gh-ac"));
		searchBox.sendKeys("Macmini");
		WebElement searchButton = driver.findElement(By.cssSelector("#gh-btn"));
		searchButton.click();
		
		
		
		Thread.sleep(3000);
		
		//Print all titles & prices
		List <WebElement> titleList = driver.findElements(By.cssSelector(".s-item__title"));
		List <WebElement> pricesList = driver.findElements(By.cssSelector(".s-item__price"));
		
		
//		for(WebElement title : titleList)
//		{
//			System.out.println("Title : " +title.getText());
//		}
//		
//		
//		for(WebElement price : pricesList)
//		{
//			System.out.println("Price : " +price.getText());
//		}
//		
		
		
		 // // Ensure both lists are of the same size to avoid IndexOutOfBoundsException
        int size = Math.min(titleList.size(),pricesList.size());
        for (int i = 0; i < size; i++) {
            System.out.println("Title: " + titleList.get(i).getText() + " || " + "Price: " + pricesList.get(i).getText());
            System.out.println();
        }
		
		

	}

	@AfterTest
	public void closeBrowser() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}

		driver.quit();
	}

}
