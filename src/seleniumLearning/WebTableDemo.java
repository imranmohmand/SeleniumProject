package seleniumLearning;



import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement userNameText=driver.findElement(By.xpath("//input[@id=\'ctl00_MainContent_username\']"));
		userNameText.sendKeys("Tester");
		WebElement pwdText=driver.findElement(By.xpath("//input[@type=\'password\']"));
		pwdText.sendKeys("test");
		driver.findElement(By.xpath("//input[@type=\'submit\']")).click();

		
		//find out how many row of table has
		
																  //table->tbody->has->tableRow
		List<WebElement>rowElements=driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));
		int totalRows=rowElements.size();
		System.out.println("the number of rows in the table are :"+totalRows);
//      System.out.println("printing row data");
//		Iterator<WebElement>itr=rowElements.iterator();
//		while(itr.hasNext()) {
//			
//			String rowText=itr.next().getText();
//			System.out.println(rowText+ "is total row in the table");
//		}
		//number of columns 
		List<WebElement>colElements=driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/th"));
		int totalColumns=colElements.size();
		System.out.println("the number of columns in the table are :"+totalColumns);
		
		System.out.println("************printing the columns header**************");
		for(WebElement ele:colElements) {
			String columnsText=ele.getText();
			System.out.println(columnsText);
		}
		/*Xpath-->(//table[@class='SampleTable']/tbody/tr/td)
		 * 1.//table[@class='SampleTable'] --> table element
		 * 2./tbody --> go inside table body
		 * 3. /tr -->from table going into  rows(not specific row)
		 * 4. /td -->going into table data or cell
		 */
		
		System.out.println("**********print data cell by cell by using advance loop*****************");
		List<WebElement>cells=driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td"));
		for(WebElement cell:cells) {
			String cellData=cell.getText();
			System.out.println(cellData);
		}
		
		//when we are talking about index so go for regular loop
		System.out.println("**********print data cell by cell by using for loop*****************");
		
		for(int i=1;i<=rowElements.size();i++) {//controlling rows 
			for(int y=1;y<=colElements.size();y++) { //Controlling columns
				
				String cellText=driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[" + i + "]/td[" + y + "]")).getText();
				
				System.out.println(cellText);
				
			}
			
		}
		
		driver.close();
		

	}

}
