package seleniumLearning;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Utils.CommonMethod;

public class KamalaTask extends CommonMethod {

	public static void main(String[] args) {
		CommonMethod.SetUp("chrome");
		driver.get("https://www.orbitz.com/");
		/*
		List <WebElement>links=driver.findElements(By.tagName("a"));
		for(WebElement link:links) {
			String linkTextString=link.getText();
			if(!linkTextString.isEmpty()) {
				System.out.println(linkTextString);
				
			}
		}
		*/
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[@id=\"primary-header-flight\"]")).click();
		WebElement hotleLinkElement=driver.findElement(By.xpath("//*[@id=\'hero-banner\']/div/div[1]/div[2]/div/h1"));
		String HotelText=hotleLinkElement.getText();
		System.out.println(HotelText);
		String Expected="Search Flights";
		if(HotelText.equals(Expected)) {
			System.out.println("the test case is pass : "+HotelText);
		}else {
			System.out.println("failed");
		}
		driver.navigate().back();
		//click on carLink and copy the text
		driver.findElement(By.xpath("//a[@id=\'primary-header-car\']")).click();
		WebElement carLink=driver.findElement(By.xpath("//*[@id=\'hero-banner\']/div/div[1]/div[2]/div/h1"));
		String carLinkStrin=carLink.getText();
		System.out.println(carLinkStrin);
		String expected1="Search Rental Car Deals";

		if(carLinkStrin.equals(expected1)) {
			System.out.println("the test case pass :"+carLinkStrin);
		}else {
			{
				System.out.println("the test case failed ");
			}
		}
		
		
		driver.navigate().back();
		driver.close();
		/*
		System.out.println("**************navigate to Amazon WebPage**************");
		
		driver.navigate().to("https://www.amazon.com/");
		WebElement searchbar=driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		searchbar.sendKeys("Toys");
		WebElement clickElement=driver.findElement(By.xpath("//input[@type=\"submit\"]"));
		clickElement.click();
		WebElement clickOnItemElement=driver.findElement(By.xpath("//a[contains(@href,'/Toy-Story')]"));
		clickOnItemElement.click();
		WebElement AddTOCard=driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]"));
		AddTOCard.click();
		*/
		
		}
	}
