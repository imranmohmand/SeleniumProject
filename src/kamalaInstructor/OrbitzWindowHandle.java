package kamalaInstructor;

import java.lang.*;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrbitzWindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orbitz.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//it will store the current window instance
		String current_windowString=driver.getWindowHandle();
		
	
		WebElement clickOnjointReward=	driver.findElement(By.xpath("//div[@class='rewardsBadge']"));
		clickOnjointReward.click();
		Set<String> AllWindow_hadle=driver.getWindowHandles();
		
		String rewardPageURLString="Orbitz";
		for(String win:AllWindow_hadle) {
			if(rewardPageURLString.equals("Orbitz")) {
			driver.switchTo().window(win);
			System.out.println(driver.getCurrentUrl());
			}
			
		}
driver.quit();	}

}
