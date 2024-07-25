package com.kashyap.LearningSeleniumATB6x.ex_selenium_11072024;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab087 {
	
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver2 = new ChromeDriver();
		
		
		driver2.navigate().to("https://openai.com/chatgpt/"	);
		driver2.navigate().to(new URL("https://www.youtube.com/"));
		driver2.navigate().back();
		driver2.navigate().forward();
		driver2.navigate().refresh();
		
	}

}
