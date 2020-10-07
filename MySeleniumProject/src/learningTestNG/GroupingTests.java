package learningTestNG;

import org.testng.annotations.Test;

public class GroupingTests {
	
	@Test
	public void group1() {
		System.out.println("Group 1");
	}
	
	@Test
	public void group2() {
		System.out.println("Group 2");
	}
	
	@Test
	public void group3() {
		System.out.println("Group 3");
	}

}
