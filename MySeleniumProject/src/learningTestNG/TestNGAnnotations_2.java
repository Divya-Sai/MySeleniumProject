package learningTestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations_2 {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Initliaze SeleniumWebDriver 2");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Start the execution");
	}
	
	@Test
	public void test3() {
		System.out.println("Inside Test3 method");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("Stop the execution");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}

}
