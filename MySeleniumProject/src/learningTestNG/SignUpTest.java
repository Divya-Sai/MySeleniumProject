package learningTestNG;

import org.testng.annotations.Test;

public class SignUpTest {
	
	@Test
	public void SignUpViaEmail() {
		System.out.println("SignUp via email");
	}
	
	@Test
	public void SignUpViaFacebook() {
		System.out.println("SignUp via Facebook");
	}
	
	@Test
	public void SignUpViaTwitter() {
		System.out.println("SignUp via Twitter");
	}

}
