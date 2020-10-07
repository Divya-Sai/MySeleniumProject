package learningTestNG;

import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	public void LoginViaEmail() {
		System.out.println("Login via email");
	}
	
	@Test
	public void LoginViaFacebook() {
		System.out.println("Login via Facebook");
	}
	
	@Test
	public void LoginViaTwitter() {
		System.out.println("Login via Twitter");
	}

}
