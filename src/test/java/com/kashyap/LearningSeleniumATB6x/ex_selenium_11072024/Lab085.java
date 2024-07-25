package com.kashyap.LearningSeleniumATB6x.ex_selenium_11072024;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Lab085 {
	
	@Test
	public void vwoLogin()
	{
		//Selenium flow
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.youtube.com/");
		driver.quit();
	}
	

}
