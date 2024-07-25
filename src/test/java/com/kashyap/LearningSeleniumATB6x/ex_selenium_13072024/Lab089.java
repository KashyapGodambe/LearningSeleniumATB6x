package com.kashyap.LearningSeleniumATB6x.ex_selenium_13072024;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Lab089 {
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		
		//options.addArguments("--Start-Maximized");
		options.addArguments("--window-size=800,400");

		
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");
		driver.manage().window().minimize();
		driver.quit();
		
		
		
		
		
	}


}
