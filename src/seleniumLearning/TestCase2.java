package seleniumLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("navigate to facebook");
		driver.get("https://www.facebook.com/");
		String FacebookTitile=driver.getTitle();
		System.out.println("navigate to google");
		driver.navigate().to("https://www.google.com/");
		System.out.println("navigate back to facebook");
		driver.navigate().back();
		System.out.println("refresh page");
		driver.navigate().refresh();
		if(FacebookTitile.contains("Facebook")) {
			System.out.println("TestCase2 is Passes");
		}else {
			System.out.println("TestCase2 is Failed");
		}
		

	}

}
