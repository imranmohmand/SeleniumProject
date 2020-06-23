package seleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceLabNegativeTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//navigate to the URL
		driver.get("https://www.saucedemo.com/");
		 //enter invalid username
			WebElement username=driver.findElement(By.id("user-name"));
			username.sendKeys("standard_user1");
		//enter invalid  password
				WebElement password=driver.findElement(By.id("password"));
				password.sendKeys("secret_sauce1");
		//click on login button
				driver.findElement(By.xpath("//input[@type='submit']")).click();
		//verify error message "Epic sadface: Username and password do not match any user in this service"
				String captureMessage=driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
				System.out.println(captureMessage);
		//another ways to verify 
				String actul="Epic sadface: Username and password do not match any user in this service";
				if(captureMessage.equals(actul)) {
					System.out.println("the test case is passes");
				}else {
					System.out.println("the test case is failed");
				}
		//close the driver
				driver.close();
		
		

	}

}
