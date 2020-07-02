package kamalaInstructor;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windownhandle3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//navigate the Orbitz URL
		driver.get("https://www.orbitz.com/");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//maximaze the window
		driver.manage().window().maximize();
		
		//store the current window instance
		String current_windowString=driver.getWindowHandle();
		
		//click on the "List your property "link
		driver.findElement(By.xpath("//a[@class='nav-tab'][1]")).click();
		
		//store the all set of  windows in the collection interface set
		Set<String>getAllWindowsHandle=driver.getWindowHandles();
		//use enhance loop to iterate the window and than switch it
		for(String widnow:getAllWindowsHandle) {
			driver.switchTo().window(widnow);
			String titileString=driver.getTitle();
			System.out.println(titileString);
			//WebElement signInclick=driver.findElement(By.xpath("//span[text()='Sign in'][1]"));
			String uRLString="https://welcome.expediagroup.com/";
			
		
			}
		
		
				driver.quit();

	}

}
