package learningTestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

import org.testng.annotations.Test;

public class LearningProperty {
	Properties prop ;
	FileInputStream  fs;
	
	@Test
	public void testProperty() throws IOException {
		fs= new FileInputStream(System.getProperty("user.dir")+"\\Config.properties");
		prop = new Properties();
		prop.load(fs);
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("browser"));
		
	}

}
