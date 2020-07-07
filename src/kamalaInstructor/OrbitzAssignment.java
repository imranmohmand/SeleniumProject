package kamalaInstructor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrbitzAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orbitz.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		TakesScreenshot screen=(TakesScreenshot)driver;
		Boolean isDisplayed=driver.findElement(By.xpath("//span[@class='icon icon-hotels']")).isDisplayed();
		System.out.println("the default search bar is displayed :"+isDisplayed);
		
	Boolean searchBarIsDisplayedBoolean=driver.findElement(By.name("destination")).isDisplayed();
	System.out.println(searchBarIsDisplayedBoolean);
	WebElement GetAttributeValue=driver.findElement(By.name("destination"));
	String textString=GetAttributeValue.getCssValue("width");
	System.out.println(textString);
	
	
	

	}

}
