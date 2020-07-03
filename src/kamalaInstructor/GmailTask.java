package kamalaInstructor;




import java.util.List;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.gmail.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement click=driver.findElement(By.xpath("//div[@class=\'MocG8c B9IrJb LMgvRb KKjvXb\']"));
		
		click.click();
		
		//String text=click.getAttribute("inner text");
		
		List<WebElement>Languages=driver.findElements(By.xpath("//*[@id='lang-chooser']/div[2]//span"));
		for(WebElement ele:Languages) {
			
			String LanguageText=ele.getText();
			System.out.println(LanguageText);
	
	

		}
		
	}

}
