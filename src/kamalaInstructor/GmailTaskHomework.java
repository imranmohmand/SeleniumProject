package kamalaInstructor;




import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.lang.model.util.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.description.ModifierReviewable.OfAbstraction;

public class GmailTaskHomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement searchbar=driver.findElement(By.name("q"));
		searchbar.sendKeys("selenium");
		searchbar.submit();
		
		List<WebElement>TabList=driver.findElements(By.xpath("//*[@class='hdtb-mitem hdtb-imb']"));
		
		int size=TabList.size();
		System.out.println(size);
		for(WebElement ele:TabList) {
			String text=ele.getText();
			
			System.out.println(text);

		}
		WebElement allElementDimension=driver.findElement(By.xpath("//div[@class='hdtb-mitem hdtb-msel hdtb-imb']"));
		Dimension dimensionAll=allElementDimension.getSize();
		System.out.println("the height is "+dimensionAll.height + " the width is "+ dimensionAll.width );
		Point ponitAll=allElementDimension.getLocation();
		System.out.println("the x cordinate is :"+ponitAll.x +" the y coordinate is :"+ponitAll.y);
		
	int heiElement=allElementDimension.getSize().getHeight();
    System.out.println(heiElement);
		
		
		driver.close();
		
		
		

	}

}
