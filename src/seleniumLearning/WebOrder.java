package seleniumLearning;

import javax.xml.soap.Text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrder {
	public static String userName="Tester";//make it dynamic and store the user_name in a string called userName
	public static String password="test";//make it dynamic and store the password in a string called password
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx");
		
		WebElement userNameText=driver.findElement(By.xpath("//input[@id=\'ctl00_MainContent_username\']"));
		userNameText.sendKeys("imran");
		Thread.sleep(2000);
		userNameText.clear();
		userNameText.sendKeys(userName);//send-key will append text
		WebElement pwdText=driver.findElement(By.xpath("//input[@type=\'password\']"));
		pwdText.sendKeys(password);
		driver.findElement(By.xpath("//input[@type=\'submit\']")).click();
		
		
		//verify logo isDisplayed 
		Boolean isDisplayed=driver.findElement(By.xpath("//h1[text()='Web Orders']")).isDisplayed();
		if(isDisplayed) {
			System.out.println("WebOrder logo is  displayed");
		}else {
			System.out.println("WebOrder logo is not displayed");
		}
		
		//also verify that the user is login into the main page,suppose Tester is login in 
		//so you will see welcome Tester!
		
		WebElement WelcomText=driver.findElement(By.xpath("//div[@class=\'login_info\']"));
		String text=WelcomText.getText();
		if(text.contains(userName)) {
			System.out.println(userName + "is logged in. Test case is passed");
		}else {
			System.out.println(userName + "is not logged in. Test case is failed");
		}
		

	}

}
