package kamalaInstructor;



import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Utils.CommonMethod;

public class ToolSQA extends CommonMethod{
	@Test
	public void setUp() {
		CommonMethod.SetUp("chrome");
		driver.get("https://demoqa.com/alertsWindows");
		
		String Current_window=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div[1]/div/div/div[3]/span/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id='item-2']")).click();
		driver.findElement(By.linkText("Frames")).click();
		
	
	}
	
	
	
	
	@Test
	public void tearDown() {
		if(driver!=null) {
			driver.close();
		}
	}

}
