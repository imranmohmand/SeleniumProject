package kamalaInstructor;

import java.io.File;
import java.io.IOException;
import java.lang.*;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
		TakesScreenshot screen=(TakesScreenshot)driver;
		File sourceFile=screen.getScreenshotAs(OutputType.FILE);
		File destFile=new File("ScreenShot/orbitz.png");
		try {
			FileUtils.copyFile(sourceFile, destFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
