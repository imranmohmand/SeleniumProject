package seleniumLearning;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import com.Utils.CommonMethod;

public class Testing extends CommonMethod{
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		CommonMethod.SetUp("chrome");
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement searchbar=driver.findElement(By.name("q"));
		searchbar.sendKeys("selenium");
		searchbar.submit();
		
		List<WebElement>ListLInk=driver.findElements(By.xpath("//*[@class='LC20lb DKV0Md']"));
		for(int i=1;i<10;i++) {
			String texString=ListLInk.get(i).getText();
			System.out.println(texString);
		}
		CommonMethod.Screenshort("google_pageLinks");
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
    
    driver.findElement(By.xpath("//h3[@class='LC20lb DKV0Md']")).click();
    CommonMethod.Screenshort("after_clicking_on_link");
		
		
		driver.close();
		
		
		

		
		

	}

}
