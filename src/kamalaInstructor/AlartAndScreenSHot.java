package kamalaInstructor;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AlartAndScreenSHot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://javascript.info/alert-prompt-confirm");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement proAlart=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/main/div[1]/article/div[2]/div[4]/div/div[1]/div[1]/a"));
		proAlart.click();
		Alert alart=driver.switchTo().alert();
		
		Thread.sleep(1000);
		
		alart.dismiss();
		String text=alart.getText();
		System.out.println(text);
		
		
		//SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy_HH-mm-ss.SSS");
		//sdf.format(new Date());
		//convert web driver object to the TakeScreenShot
		TakesScreenshot sht= ((TakesScreenshot)driver);
		
		//call getScreenshotAs method to create image file
		File sourceFile=sht.getScreenshotAs(OutputType.FILE);
		//move image file to new destination 
		File DestanationFile=new File("ScreenShot/alart.png");
				//File DestFIle=new File("sShort/prompalart.png");
		FileHandler.copy(sourceFile, DestanationFile);
			
		
		
		
		
		
		//copy file at destination
		//FileHandler.copy(src, DestFIle);
		
		driver.close();
		
		
		
		
		


	}

}
