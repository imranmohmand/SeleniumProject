package seleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCSSvalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orbitz.com/");
		
		//font-size
		WebElement hotlelink=driver.findElement(By.cssSelector("#primary-header-hotel"));
		String actualFontSize=hotlelink.getCssValue("font-size");
		String expextedFontSize="15px";
		if(actualFontSize.equals(expextedFontSize)) {
			System.out.println("actual = expected "+actualFontSize);
		}else {
			System.out.println("not Equal");
		}
		
		//first  locate any webElement and than get CssValue and print it in a console.
		//checking color
	String hotleColor=hotlelink.getCssValue("color");
	System.out.println(hotleColor);
	
	//checking hotels background color
	String hotleBackGroundColor=hotlelink.getCssValue("background-color");
	System.out.println(hotleBackGroundColor);
	
	//back-ground attachment 
	String backgoundAttachment=hotlelink.getCssValue("background-attachment");
	System.out.println(backgoundAttachment);
		
	//box-sizing
	String box_size=hotlelink.getCssValue("box-sizing");
	System.out.println(box_size);

	}

}
