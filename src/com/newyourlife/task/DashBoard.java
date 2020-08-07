package com.newyourlife.task;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class DashBoard extends commons{
	
	@Test
	public static void verification() {
	
		commons.setup("edge");
	
	driver.get("https://www.newyorklife.com/");
	
	WebElement logoElement=driver.findElement(By.xpath("//a[@class='navbar-brand']"));
	logoElement.isDisplayed();
	if(true) {
		System.out.println("the UI logo is displaed");
	
	}
	
	
		WebElement whatweOffer=driver.findElement(By.cssSelector("#mega-nav > div:nth-child(5) > a"));
	String color=whatweOffer.getAttribute("background-color");
	System.out.println(color);
	
			
	//make sure that at  learn&compare page the logo ny 75 is displayed
			WebElement learnAndCompareLink= driver.findElement(By.xpath("//a[@href='#megamenu-3']"));
			learnAndCompareLink.click();
			driver.findElement(By.xpath("//*[@id='megamenu-3']/div/div/div/div/div/div[2]/div[1]/div/h6/span[1]/a")).click();
			
			WebElement learnAndCompareLinkLogo=driver.findElement(By.xpath("//a[@class='navbar-brand']"));
			learnAndCompareLinkLogo.isDisplayed();
			if(true) {
				System.out.println("the learn&compare logo is displaed");
				}
//			driver.navigate().back();
//			Assert.assertEquals(true, learnAndCompareLink, "passed");
//		
			
	//make sure that at  Contact_Us page the logo ny 75 is displayed
	WebElement Contact_Us=driver.findElement(By.xpath("//*[@id='main-nav']/nav[2]/div[2]/a"));	
	Contact_Us.click();
	WebElement contactUsLogo=driver.findElement(By.xpath("//a[@class='navbar-brand']"));
	contactUsLogo.isDisplayed();
	if(true) {
		System.out.println("the contactUs logo is displaed");
	
	}
	List<WebElement> ele=driver.findElements(By.xpath("//*[@data-toggle='collapse'][a]"));
	for(int i=2;i<ele.size()-1;i++) {
		WebElement link=driver.findElement(By.xpath("//*[@data-toggle='collapse'][a]["+i+"]"));
		link.click();
		
		
		String urlString=driver.getCurrentUrl();
		System.out.println(urlString);
		driver.navigate().back();
		
	}
	
	//on https://www.newyorklife.com/contact-us
	//ensure entire content  is displayed
	//this will give us the text "call"
	WebElement ContactPage=driver.findElement(By.xpath("//*[@id='main-nav']/nav[2]/div[2]/a"));	
	ContactPage.click();
	WebElement callElement=driver.findElement(By.xpath("//div[@class='cmp-rte'][h2='Call']"));
	callElement.isDisplayed();
	if(true) {
		String CallText=callElement.getText();
		System.out.println(CallText);
	}
	
	//the entire content are here
	List<WebElement>contactPageList=driver.findElements(By.xpath("//div[@class='cmp-rte']"));
	for(int y=1;y<contactPageList.size();y++) {
		String contText=contactPageList.get(y).getText();
		System.out.println(contText);
	}
	//clicking of the program FAQs link
	WebElement ProgramQALInk=driver.findElement(By.xpath("//a[@title='Brave of Heart Fund FAQs']"));
	ProgramQALInk.click();
	
	System.out.println("**********************");
		
	
			
//	//email
//	Boolean isDisplayed=driver.findElement(By.name("guideContainer-rootPanel-guidetextbox_copy___jqName")).isDisplayed();
//	if(true) {
//		System.out.println("pass");
//	}
			
	}
}
