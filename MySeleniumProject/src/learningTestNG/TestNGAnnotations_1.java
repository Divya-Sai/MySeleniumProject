package learningTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestNGAnnotations_1 {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Initliaze SeleniumWebDriver");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Opening Browser");
	}

	@Test
	public void test1() {
		System.out.println("Inside test 1");
	}

	@Test
	public void test2() {
		System.out.println("Inside test 2");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("quit the browser");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("Revert SeleniumWebDriver");
	}
}
