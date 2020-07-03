package seleniumLearning;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * get all the row values and click on the corresponding check box
 */


public class WebTableTask {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//send username
		WebElement userNameText=driver.findElement(By.xpath("//input[@id=\'ctl00_MainContent_username\']"));
		userNameText.sendKeys("Tester");
		//enter password
		WebElement pwdText=driver.findElement(By.xpath("//input[@type=\'password\']"));
		pwdText.sendKeys("test");
		//click on login button
		driver.findElement(By.xpath("//input[@type=\'submit\']")).click();
		
		
		String expectedString="Bob Feather";
		
		//used collection list interface to get all the cell values 
		List<WebElement>Rows=driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td"));
		for(int i=1;i<Rows.size();i++) {
			String RowsText=Rows.get(i-1).getText();
			System.out.println(RowsText);
			if(RowsText.contains(expectedString)){
				Thread.sleep(2000);
				driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[7]/td[1]")).click();
				//driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr["+i+"]/td[1]")).click();
				break;
				
				
			}
			
		}

	}

}
