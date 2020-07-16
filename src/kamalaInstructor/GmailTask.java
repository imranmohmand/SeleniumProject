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

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.gmail.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement click=driver.findElement(By.xpath("//div[@class=\'MocG8c B9IrJb LMgvRb KKjvXb\']"));
		
		click.click();
		
		//String text=click.getAttribute("inner text");
		
		List<WebElement>Languages=driver.findElements(By.xpath("//*[@id='lang-chooser']/div[2]/div"));
		Thread.sleep(3000);
		for(int i =1;i<Languages.size();i++) {
			WebElement ele=driver.findElement(By.xpath("//*[@id='lang-chooser']/div/div["+i+"]"));
			
			ele.click();
			System.out.println(ele.getText());
			//String text=Languages.get(i).getText();
			//String text=ele.getText();
			Thread.sleep(2000);
			//System.out.println(text);
			driver.navigate().back();
			Thread.sleep(5000);
		
	
			
//		for(WebElement ele:Languages) {
//			
//			String LanguageText=ele.getText();
//			System.out.println(LanguageText);
//	
//			if(!Languages.isEmpty()) {
//				ele.click();
			
//			}
			
			//boolean isChecked=false;
//			for(int i=0;i<Languages.size();i++) {
//				String textString=Languages.get(i).getText();
//				System.out.println(textString);
//				isChecked=Languages.get(i).isSelected();
//				if(!isChecked) {
//					Languages.get(i).click();
//					Thread.sleep(2000);
//				}
	

		}
		
	}

}
