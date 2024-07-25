package com.kashyap.LearningSeleniumATB6x.ex_selenium_11072024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Lab086 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Upcasting >> Dynamic dispatch
		
		//WebDriver driver = new EdgeDriver();
		WebDriver driver2 = new ChromeDriver();
		//WebDriver driver3 = new SafariDriver();
		//WebDriver driver4 = new FirefoxDriver();
		
		driver2.get("https://www.youtube.com/");
		System.out.println("TITLE ---"+ driver2.getTitle());
		System.out.println("CURRENT URL ---"+ driver2.getCurrentUrl());
		System.out.println("PAGE SOURCE	 ---"+ driver2.getPageSource());
		driver2.quit();
		
	}

}
