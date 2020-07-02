package kamalaInstructor;


import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleFaceBookTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		String current_windowHandle=driver.getWindowHandle();
		String currentWindowURL=	driver.getCurrentUrl();
		System.out.println(currentWindowURL);
		
		WebElement ClickOnTermLink=driver.findElement(By.xpath("//a[@id='terms-link']"));
		ClickOnTermLink.click();
		String termURLString="https://www.facebook.com/legal/terms/update";
		
		Set<String> Allwindows=driver.getWindowHandles();
		String TermUrl="https://www.facebook.com/legal/terms/update";
		
		for(String window:Allwindows) {
			if(driver.switchTo().window(window).getCurrentUrl().equals(TermUrl)) {
				String titile=driver.getTitle();
				System.out.println(titile);
				driver.findElement(By.xpath("//*[@id='content']/div/div/div[2]/div[2]/div[1]/div/a[1]")).click();
				System.out.println(driver.getCurrentUrl());
			}
		}
		driver.switchTo().window(current_windowHandle);
	
	System.out.println(currentWindowURL);
		
	}

}
