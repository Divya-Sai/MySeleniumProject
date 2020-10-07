package learningTestNG;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class PaymentTest {

	
	@Test
	public void PaymentviaPaytm() {
		System.out.println("Payment via Paytm ");
		try {
			Assert.assertEquals("Roshita", "roshita14");
		} catch (Throwable t) {
			// TODO: handle exception
			System.out.println(t);
		}
		System.out.println("After aasert Condition");
	}
	
	@Test
	public void PaymentviaGpay() {
		System.out.println("Payment via Gpay");
		throw new SkipException("Gpay payment not working");
	}
	
	@Test
	public void PaymentviaBank() {
		System.out.println("Payment via Bank");
	}
}
