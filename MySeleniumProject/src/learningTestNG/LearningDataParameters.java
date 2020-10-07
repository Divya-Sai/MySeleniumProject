package learningTestNG;

import org.testng.annotations.Test;

public class LearningDataParameters {

	@Test(dataProviderClass = TestDataFile.class,dataProvider = "data")
	public void registerUsers(String firstname,String lastname,String emailid,String password) {
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(emailid);
		System.out.println(password);
		
	}
	
	@Test(dataProviderClass = TestDataFile.class,dataProvider = "logindata")
	public void LoginUser(String emailid,String password) {
		System.out.println(emailid);
		System.out.println(password);
		
	}
	
	
}
