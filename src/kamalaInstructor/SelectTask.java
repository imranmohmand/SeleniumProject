package kamalaInstructor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		//Initialize the webDriver
		WebDriver driver=new ChromeDriver();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.orbitz.com/");
		WebElement select1=driver.findElement(By.id("hotel-rooms-hp-hotel"));
		Select select=new Select(select1);
		select.selectByIndex(3);

	}

}
