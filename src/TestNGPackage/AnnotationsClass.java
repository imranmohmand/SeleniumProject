package TestNGPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.lang.reflect.Method;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationsClass {
  @Test
  public void f() {
	  System.out.println("this is the main method");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println(" @BeforeMethod this will run before method");
  }
  @Test
  public void Method() {
	  System.out.println("method");
  }
  @BeforeMethod
  public void method1() {
	  System.out.println("this is method1");
  }
  @BeforeClass
  public void methodBeforeclass() {
	  System.out.println("before class");
  }
  @AfterMethod
  public void AfterMethod() {
	  System.out.println("after method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("@AfterMethod  will run after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("@BeforeClass  will run before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("@AfterClass  will run after method");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("@BeforeTest  will run before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("@AfterTest  will run after method");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println(" @BeforeSuite  will run before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("@AfterSuite  will run after suite");
  }

}
