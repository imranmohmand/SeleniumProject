package seleniumLearning;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolSQAPractice  {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		
		driver.get("http://demoqa.com/automation-practice-form");
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement firstName=driver.findElement(By.id("firstName"));
		firstName.sendKeys("Jabir");
		Thread.sleep(5000);
		WebElement lastName=driver.findElement(By.id("lastName"));
		lastName.sendKeys("mohmand");
		Thread.sleep(5000);
		WebElement enterEmail=driver.findElement(By.xpath("//input[contains(@class,'mr-sm')][@id=\"userEmail\"]"));
		enterEmail.sendKeys("JabirMohmand@outlook.com");
		Thread.sleep(9000);
		
		//click on radio Button\
		//1st way
		driver.findElement(By.xpath("//input[@value=\'Male\']")).click();

		
		
		
		// 2nd way
		
		List<WebElement> RadioButton=driver.findElements(By.xpath("//input[@type=\'radio\']"));
		
		//it will give me size();
		RadioButton.size();//3
		RadioButton.get(0).click();//click on male
		RadioButton.get(1).click();//click on female
		//String value=RadioButton.get(0).getAttribute("value");//trying to get an attribute
		//System.out.println(value);
		
		//if i want to click on all radio button
		for(int i=0;i<RadioButton.size();i++) {
			RadioButton.get(i).click();
			String value=RadioButton.get(0).getAttribute("value");//trying to get an attribute
			if(RadioButton.equals("Male")) {
				RadioButton.get(i).click();
				break;
			}
			
		}
		Thread.sleep(9000);
		
		
		
		
		driver.close();

		
		
	}

}
