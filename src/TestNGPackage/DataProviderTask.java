package TestNGPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTask {
	WebDriver driver;
	
	@Test(dataProvider = "getdata")
	public void freeCrm(String email,String pwd) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://ui.freecrm.com/");
		WebElement emailElement=driver.findElement(By.xpath("//*[@id='ui']/div/div/form/div/div[1]/div/input"));
		emailElement.sendKeys(email);
		 
		WebElement pwdElement= driver.findElement(By.xpath("//*[@id='ui']/div/div/form/div/div[2]/div/input"));
		pwdElement.sendKeys(pwd);
		 
		
		WebElement submentElement=driver.findElement(By.xpath("//*[@id='ui']/div/div/form/div/div[3]"));
		submentElement.click();
		

	}
	
	
	@DataProvider
	public Object[][] getdata() {
		Object[][] data=new Object[3][2];
		data[0][0]="imrankhan@yahoo.com";
		data[0][1]="123";
		
		data[1][0]="imran@yahoo.com";
		data[1][1]="zbc";
		
		data[2][0]="imranmohmand@yahoo.com";
		data[2][1]="abcd";
		return data;
		
		

		
		
	}
		
	}
	
	


