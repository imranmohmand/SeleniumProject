package kamalaInstructor;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miscellaneous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
			//Initialize the webDriver
			WebDriver driver=new ChromeDriver();
			//Implicit wait
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://www.orbitz.com/");
			
			WebElement Espanol=driver.findElement(By.id("header-language-2058"));
			//maximize the window
			driver.manage().window().maximize();
			//to find_out the Espanol location
			//it will point you towards the location of an any element based on x,y coordinates 
			Point espanolPoint=Espanol.getLocation();
			System.out.println("x cordinate is : "+espanolPoint.x +"y cordinate is :"+espanolPoint.y);
			
			//to figure_out the size of searchEdit_box we used getSize and store it in a Dimension to retrieved the height,width and location as well
			WebElement searchEidtbar=driver.findElement(By.xpath("//*[@id='hotel-destination-hp-hotel']"));
			Dimension dimension=searchEidtbar.getSize();
			System.out.println("the Height is :" +dimension.height+ " and  the width is :"+dimension.width );
			
			//checked whether hotel link is displayed or not 
			try {
			WebElement HotelLink=driver.findElement(By.id("primary-header-hotel"));
			Boolean hotelLink=HotelLink.isDisplayed();
			System.out.println(hotelLink);
			//if we know what kind of exception will occurred so it better to used specific exception to save time
			//catch(NoSuchElementException e)
			//System.out.println(e);
			//if you don't than better to go for general exception it will figured it out  
			}catch (Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
				
			}
			/*
			finally {
				System.out.println("it will executable in any condition ");
				driver.close();
			}
			*/
			System.out.println("after exception");
			
			driver.close();
			
	}

}
