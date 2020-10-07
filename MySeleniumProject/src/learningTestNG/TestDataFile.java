package learningTestNG;

import org.testng.annotations.DataProvider;

public class TestDataFile {

	@DataProvider(name="data")
	public static Object[][] testData(){
		Object[][] obj = new Object[3][4];
		
		obj[0][0] ="Roshi";
		obj[0][1] ="Roshita";
		obj[0][2] ="Sai123@gmail";
		obj[0][3] ="dfghhjk";
		
		obj[1][0] ="Roshi";
		obj[1][1] ="Roshita";
		obj[1][2] ="Sai123@gmail";
		obj[1][3] ="dfghhjk";
		
		obj[2][0] ="Roshi";
		obj[2][1] ="Roshita";
		obj[2][2] ="Sai123@gmail";
		obj[2][3] ="dfghhjk";
		
		return obj;
		
	}
	
	@DataProvider(name="logindata")
	public static Object[][] loginTestData(){
		Object[][] obj = new Object[3][2];
		
		obj[0][0] ="Roshi@ycvhdsk";
		obj[0][1] ="Roshita";
			
		obj[1][0] ="Roshi@sdpiv";
		obj[1][1] ="Roshita";
				
		obj[2][0] ="Roshi@dcj";
		obj[2][1] ="Roshita";
		
		
		return obj;
		
	}
}
