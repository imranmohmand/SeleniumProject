package kamalaInstructor;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class OrbitzAssignment {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orbitz.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		TakesScreenshot screen=(TakesScreenshot)driver;
		Boolean isDisplayed=driver.findElement(By.xpath("//span[@class='icon icon-hotels']")).isDisplayed();
		System.out.println("the default search bar is displayed :"+isDisplayed);
		
	Boolean searchBarIsDisplayedBoolean=driver.findElement(By.name("destination")).isDisplayed();
	System.out.println(searchBarIsDisplayedBoolean);
	WebElement GetAttributeValue=driver.findElement(By.name("destination"));
	String textString=GetAttributeValue.getCssValue("width");
	System.out.println(textString);
//ensure that the user should be able to click on cruises tab
	WebElement cruisesElement= driver.findElement(By.xpath("//button[@id='tab-cruise-tab-hp']"));
	cruisesElement.click();
//click on drop_down
	WebElement destinationElement=driver.findElement(By.id("cruise-destination-hp-cruise"));
	Thread.sleep(2000);
	//click on destination drop_down
	//destinationElement.click();
	Select sDestination=new Select(destinationElement);
	Thread.sleep(3000);
	sDestination.selectByIndex(3);
//print all the drop-down list in the console
	List<WebElement>list=sDestination.getOptions();
	for(int i=1;i<list.size();i++) {
		String texts=list.get(i).getText();
		System.out.println(texts);
		}
//take a scrrenShot 
		TakesScreenshot sc= ((TakesScreenshot)driver);
		File sourceFile=sc.getScreenshotAs(OutputType.FILE);
		File destinatioFile=new File("ScreenShot/orbitz.png");
		FileHandler.copy(sourceFile, destinatioFile);
//depart as early as
		WebElement departElement=driver.findElement(By.xpath("//input[@id='cruise-start-date-hp-cruise']"));
		departElement.clear();
		departElement.click();
		driver.findElement(By.xpath("//*[@id='cruise-start-date-wrapper-hp-cruise']/div/div/div[2]/table/tbody/tr[5]/td[3]/button")).click();
// depart as late as
		WebElement deapartLate=driver.findElement(By.xpath("//input[@id='cruise-end-date-hp-cruise']"));
		deapartLate.clear();
		deapartLate.click();
		driver.findElement(By.xpath("//*[@id='cruise-end-date-wrapper-hp-cruise']/div/div/div[3]/table/tbody/tr[3]/td[3]/button")).click();
// select adult from adult select drop_down
		WebElement adultElement=driver.findElement(By.xpath("//*[@id='cruise-adults-hp-cruise']"));
		Thread.sleep(2000);
		adultElement.click();
		Select adultSelect=new Select(adultElement);
		adultSelect.selectByIndex(2);
// also print all the text available in adult drop_down
		Thread.sleep(3000);
		List<WebElement>AdultList=adultSelect.getOptions();
		for(int i=0;i<AdultList.size();i++) {
			String adultText=AdultList.get(i).getText();
			System.out.println(adultText);
			}
//select child from the select drop_dwon
		WebElement childElement=driver.findElement(By.xpath("//*[@id='cruise-children-hp-cruise']"));
		childElement.click();
		Select childSelect=new Select(childElement);
		childSelect.selectByIndex(1);
		
		List<WebElement>childList=childSelect.getOptions();
		for(int j=0;j<childList.size();j++) {
			String child_drop_down=childList.get(j).getText();
			System.out.println(child_drop_down);
		}
//select child age from select drop_down
		WebElement childAgElement=driver.findElement(By.xpath("//*[@id='cruise-children-age-select-1-hp-cruise']"));
		childAgElement.click();
		Select ChildAgeSelect=new Select(childAgElement);
		ChildAgeSelect.selectByIndex(7);
//print all the text from the child age select drop_down
		List<WebElement>childAgeList=childSelect.getOptions();
		for(int y=0;y<childAgeList.size();y++) {
			String childAgeString=childAgeList.get(y).getText();
			System.out.println(childAgeString);
		}
//finally click on submit button
		WebElement submit=driver.findElement(By.xpath("//*[@id='gcw-cruises-form-hp-cruise']/div[3]/label/button"));
		submit.click();
		
		
		
		
	

	}

}
