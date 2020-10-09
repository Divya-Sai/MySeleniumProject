package demoPackage;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestingLog4j {
	
	Logger log ;

	@Test
	public void testLogs() {
		
		log = Logger.getLogger("devpinoyLogger");
		
		log.debug("starting of opening chrome");
		System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		log.debug("opening chrome");
		driver.get("https://www.google.com/");
		log.debug("launches google page");
		driver.manage().window().maximize();
		log.debug("maximise the window");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
}
