package seleniumLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		String ActualTitle=driver.getTitle();
		String ExpectedTitile="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		
		if(ActualTitle.equals(ExpectedTitile)) {
			System.out.println("TestCase1 is passed");
		}else {
			System.out.println("TestCase1 is failed");
		}
		driver.close();
		
		

	}

}
