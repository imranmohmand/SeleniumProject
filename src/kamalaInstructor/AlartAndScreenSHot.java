package kamalaInstructor;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AlartAndScreenSHot {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://javascript.info/alert-prompt-confirm");
		WebElement proAlart=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/main/div[1]/article/div[2]/div[4]/div/div[1]/div[1]/a"));
		proAlart.click();
		Alert alart=driver.switchTo().alert();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		alart.dismiss();
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy_HH-mm-ss.SSS");
		sdf.format(new Date());
		

		//convert web driver object to the TakeScreenShot
		TakesScreenshot sht= ((TakesScreenshot)driver);
		
		//call getScreenshotAs method to create image file
		File src=sht.getScreenshotAs(OutputType.FILE);
		//move image file to new destination 
		File DestFIle=new File("C:\\Users\\user\\eclipse-workspace\\Selenium.png");
		
		//copy file at destination
		FileHandler.copy(src, DestFIle);
		
		
		
		
		String text=alart.getText();
		System.out.println(text);
		


	}

}
