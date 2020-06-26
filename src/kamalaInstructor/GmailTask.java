package kamalaInstructor;




import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GmailTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.gmail.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		List<WebElement>Lang=driver.findElements(By.xpath("//*[@id='lang-chooser']/div[1]/div[1]/div[9]"));

		for(WebElement ele:Lang) {
		String str=ele.getAttribute("jsname");
			String listOfLanguage=ele.getText();
			System.out.println(listOfLanguage);
			if(!Lang.isEmpty()) {
				System.out.println(listOfLanguage);
			}
			
		}
		
	}

}
