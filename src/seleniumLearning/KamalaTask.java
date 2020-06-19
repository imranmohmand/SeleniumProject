package seleniumLearning;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Utils.CommonMethod;

public class KamalaTask extends CommonMethod {

	public static void main(String[] args) {
		CommonMethod.SetUp("chrome");
		driver.get("https://www.orbitz.com/");
		List <WebElement>links=driver.findElements(By.tagName("a"));
		for(WebElement link:links) {
			String linkTextString=link.getText();
			if(!linkTextString.isEmpty()) {
				System.out.println(linkTextString);
				
			}
		}

		driver.findElement(By.xpath("//a[@id=\"primary-header-flight\"]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@id=\"primary-header-car\"]")).click();
		driver.navigate().back();
		
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
		}
	}
