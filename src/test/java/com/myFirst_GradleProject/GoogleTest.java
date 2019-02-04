package com.myFirst_GradleProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class GoogleTest {
	
	
	
	
	
	
	@Test
	public void googleTitleTest() {
		
	//ChromeDriverManager.getInstance().setup();
		
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
		 + "/src/main/resources/driver/chromedriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		 
		 WebDriver driver = new HtmlUnitDriver();
		
	driver.get("https://www.google.com");
	String title =driver.getTitle();
	
	System.out.println("Google title is :"+ title);
	
	Assert.assertEquals(title, "Google");
	
	driver.close();
		
	}

}
