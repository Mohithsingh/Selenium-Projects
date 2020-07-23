import org.testng.SkipException;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Prioritizationanddepend {
/*@Test(priority=1)
	public void login() {
		System.out.println("login");
	}
@Test(priority=2)
	public void navigating() {
		System.out.println("navigating");
	}
@Test(priority=3)
	public void logout() {
		System.out.println("logout");
	}*/
	@Test(priority=1)
	public void login() {
		System.out.println("login");
		//throw new SkipException("login failed");
		Assert.assertEquals("String1","String2");
	}
@Test(priority=2,dependsOnMethods= {"login"})
	public void navigating() {
		System.out.println("navigating");
	}
@Test(priority=3,dependsOnMethods= {"login","navigating"})
	public void logout() {
		System.out.println("logout");
}
}
