package kamalaInstructor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.get("https://www.indeed.com/");
				//ensure that the failed what contains text "what"
				WebElement whatField=driver.findElement(By.xpath("//label[@id='label-text-input-what']"));
				String str=whatField.getText();
				System.out.println(str);
				if(str.contains("What")) {
					System.out.println("the testCase is paassed :"+str);
				}else {
					System.out.println("the testCase is failed");
				}
				
				//ensure that the what field is displayed in the searche field 
				Boolean IsDisplayed=driver.findElement(By.xpath("//input[@id='text-input-what']")).isDisplayed();
				System.out.println(IsDisplayed);
				//driver.findElement(By.xpath("//a[starts-with(@class,'icl-Button')][text()='Upload your resume']")).click();
				
					
				}
				//driver.close();

	}


