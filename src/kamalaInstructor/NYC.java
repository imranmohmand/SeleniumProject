package kamalaInstructor;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NYC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.nyandcompany.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//ENsure that the page title is Women's Clothes & Accessories | Shop at New York & Company 
	String ActualTitile=driver.getTitle();
	System.out.println(ActualTitile);
	
	String expectedTitle="Women's Clothes & Accessories | Shop at New York & Company";
	if(ActualTitile.equals(expectedTitle)) {
		System.out.println("the testCase is passed "+ActualTitile);
	}else {
		System.out.println("the testCase is Failed ");
	}
	
	System.out.println("****************************eve Mendes********************");
	
	//Ensure that the menu items Eva_Mendes and when clicked direct to the expected page
	Boolean evaMendesIsDisplayedBoolean=driver.findElement(By.linkText("Eva Mendes")).isDisplayed();
	System.out.println(evaMendesIsDisplayedBoolean);
	//get the current eva page URl
	String evaMendasURl=driver.getCurrentUrl();
	System.out.println("the eva mandas page URl is :"+evaMendasURl);
	
	System.out.println("****************************Gabrielle Union ********************");
	// store the eva Mendas webElements
	WebElement EvaMendas=driver.findElement(By.xpath("/html/body/header/nav[1]/div[3]/div/ul[2]/li[1]/a"));
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	//click on WebElment
	EvaMendas.click();
	Boolean isDsplayd=driver.findElement(By.xpath("/html/body/header/nav[1]/div[3]/div/ul[2]/li[1]/a")).isDisplayed();
	System.out.println(isDsplayd);
	
	String ActualGabrielleURL=driver.getCurrentUrl();
	System.out.println(ActualGabrielleURL);
	String expectedGabrielleURL="https://www.nyandcompany.com/gabrielle-union/N-675084437/";
	if(ActualGabrielleURL.equals(expectedGabrielleURL)) {
		System.out.println("the test case is passed :"+ActualGabrielleURL);
	}else {
		System.out.println("the test case is falied ");
	}
	
	System.out.println("****************************Brands_We_Love ********************");
	
	WebElement  Brands_We_Love=driver.findElement(By.xpath("/html/body/header/nav[1]/div[3]/div/ul[2]/li[2]/a"));
	Brands_We_Love.click();
	Boolean brands_We_Love_isDisplyed=driver.findElement(By.xpath("/html/body/header/nav[1]/div[3]/div/ul[2]/li[2]/a")).isDisplayed();
	System.out.println(brands_We_Love_isDisplyed);
	
	String BrantWeLovePageTitle=driver.getTitle();
	System.out.println(BrantWeLovePageTitle);
	
	System.out.println("****************************New_Arrival********************");
	
	WebElement new_ArrivalWebElement=driver.findElement(By.xpath("/html/body/header/nav[1]/div[3]/div/ul[2]/li[3]/a"));
	new_ArrivalWebElement.click();
	
	Boolean newArrival=driver.findElement(By.xpath("/html/body/header/nav[1]/div[3]/div/ul[2]/li[3]/a")).isDisplayed();
	System.out.println(newArrival);
	String newArrivalActualTitle=driver.getTitle();
	String newArrivalExpectedTitle="New Arrivals: Women's Must Haves Trending Now | NY&C";
	if(newArrivalActualTitle.equals(newArrivalExpectedTitle)) {
		System.out.println("navigate to the next page after clicking on new arrival :"+newArrivalActualTitle);
	}else {
		System.out.println("the test case is failed ");
	}
	
	
	//Ensure that Log In link in header is displayed to the left
	
	System.out.println("************Ensure that Log In link in header is displayed to the left*************");
	
	WebElement log_in=driver.findElement(By.xpath("/html/body/header/nav[1]/div[1]/div/div/div[1]/ul/li[1]/a"));
	
	Boolean LonInIsDiplayed=driver.findElement(By.xpath("/html/body/header/nav[1]/div[1]/div/div/div[1]/ul/li[1]/a")).isDisplayed();
	System.out.println(LonInIsDiplayed);
	
    Point loginPoint=log_in.getLocation();
    System.out.println("the x cordinate is :"+loginPoint.x+"& y cordinate is :"+loginPoint.y);
    
    
    System.out.println("****************************font_size testcase********************");
    //ensure that the wish list link in the header is displayed in font size 10
   WebElement wishElement=driver.findElement(By.cssSelector("#myWishList"));
  String actual= wishElement.getCssValue("font-size");
  String expected="10px";
  if(actual.equals(expected)) {
	  System.out.println("the font-size test case is passed " +actual);
  }else {
	System.out.println("otherwise failed");
}
      
  
  /*
 WebElement helpElement= driver.findElement(By.xpath("/html/body/footer/div[3]/div/div[3]/div[1]/p"));
 String text=helpElement.getText();
 System.out.println(text);
 */

	
	
	
	
	
	driver.close();

	}

}
