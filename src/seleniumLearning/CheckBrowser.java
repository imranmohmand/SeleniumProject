package seleniumLearning;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.cnn.com/");
		String actuls=driver.getTitle();
		String expectedString="CNN - Breaking News, Latest News and Videos";
		if(actuls.equalsIgnoreCase(expectedString)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		System.out.println(actuls);
		
		
		
		/*
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("abc");
		driver.findElement(By.id("pass")).sendKeys("abnceda");
		//driver.findElement(By.xpath("//*[@id=\"u_0_4\"]")).click();
		driver.getCurrentUrl();
		
		Thread.sleep(2000);
		driver.navigate().to("https://www.youtube.com/");
		String urlString=driver.getCurrentUrl();
		System.out.println(urlString);
		driver.getTitle();
		
		driver.navigate().back();
		driver.getCurrentUrl();
		String titleString=driver.getTitle();
		System.out.println(titleString);
		
		driver.navigate().forward(); 
		
		driver.close();
		*/
		
		
	}

}
