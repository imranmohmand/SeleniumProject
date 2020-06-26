package seleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Utils.CommonMethod;

public class CheckBox extends CommonMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommonMethod.SetUp("chrome");
		WebElement rbtn=	driver.findElement(By.name("sex"));
		//isEnabled() is used if the target element is enabled or disable
		System.out.println(rbtn.isEnabled());
	
		
		
	
		

	}

}
