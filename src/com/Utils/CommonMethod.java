package com.Utils;

import java.security.PublicKey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonMethod {
	//in java we want to avoid repetitive step
	//so make webDriver as a static so no need to write it again and again
public static WebDriver driver;

	

public static void  SetUp(String Browser) {
		if(Browser.equalsIgnoreCase("Chrome")) {
			
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver=new ChromeDriver();
	
		}else if(Browser.equalsIgnoreCase("Firefox")) {
		System.setProperty("webdriver.firefox.driver", "drivers/geckodriver.exe");
		driver=new FirefoxDriver();
		}
	}

}

		

 
/*
	public static WebDriver  SetUp(String Browser) {
		if(Browser.equalsIgnoreCase("Chrome")) {
			
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver=new ChromeDriver();
		}else if(Browser.equalsIgnoreCase("Firefox")) {
		System.setProperty("webdriver.firefox.driver", "drivers/geckodriver.exe");
		driver=new FirefoxDriver();
		}
		
		return driver;
		//in checkBox class u will do this 
		/*
		 public class CheckBox  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver	driver=CommonMethod.SetUp("Chrome");
	driver.get("Url");
		
		
		 
	}
}

*/
