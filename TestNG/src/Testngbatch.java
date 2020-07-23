import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class Testngbatch {
	@Test
	public void loginemail() {
		System.out.println("Login via email");
		//Assert.assertEquals("mohith","mohith1");
		//Assert.assertEquals(1,2);
		//Assert.assertTrue(4>1);
		Assert.assertFalse(1>4);
	}
	@Test
	public void loginfb() {
		System.out.println("Login via fb");
		throw new SkipException("Facebook functionality not supported");
	}
	@Test
	public void logingoogle() {
		System.out.println("Login via google email");
	}
}
