package learningTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LearningTestNGPriority {

	@Test(priority=1)
	public void Login() {
		System.out.println("Login");
		Assert.assertEquals("roshi", "roshi");
	}
	
	@Test(priority=2,dependsOnMethods = {"Login"})
	public void Navigate() {
		System.out.println("navigate");
		Assert.assertEquals(1, 2);
	}
	
	@Test(priority=3,dependsOnMethods= {"Login","Navigate"})
	public void Logout() {
		System.out.println("Logout");
	}
}
