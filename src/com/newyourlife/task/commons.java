package com.newyourlife.task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class commons {
	
	public static WebDriver driver;
	public static  void  setup(String Browser) {
		if(Browser.equals("chrome")) {
			
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	
		}else if(Browser.equals("Firefox")) {
		System.setProperty("webdriver.firefox.driver", "drivers/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		}else if(Browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
			driver=new EdgeDriver();
			
			
		}

	}
	
	
	

}
