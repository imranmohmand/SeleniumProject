package seleniumLearning;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceLabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		//enter username
		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		//enter password
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		//click on login button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//verify the robot icon is displayed 
		Boolean isDisplayed=driver.findElement(By.xpath("//div[@class='peek']")).isDisplayed();
		
		if(isDisplayed) {
			System.out.println("the rebot icon is displayed :" );
		}else {
			System.out.println("the icon is not displayed");
		}
		//verify "products" text is available  next to the robot
		Boolean productTextIsDisplayed=driver.findElement(By.xpath("//select[@class='product_sort_container']")).isDisplayed();
		if(productTextIsDisplayed) {
			System.out.println("the product text bar is available next to the robot icon");
		}else {
			System.out.println("is not available testcase is failed ");
		}
		
		List<WebElement> listLinks=driver.findElements(By.tagName("a"));
		for(WebElement list:listLinks) {
		String listString=list.getText();
			if(!listString.isEmpty()) {
				System.out.println(listString);
			}
		}
		int size=listLinks.size();
		System.out.println(size);
		driver.close();

	}

}
