package learningTestNG;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listners  extends TestListenerAdapter{
	
	public void onTestSuccess(ITestResult tr) {
		System.out.println("test case pass");
	}
	
	public void onTestFailure(ITestResult tr) {
		System.out.println("test case failed");
	}
	
	public void onTestSkipped(ITestResult tr) {
		System.out.println("test case Skipped");
	}

}
