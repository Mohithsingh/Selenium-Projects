import org.testng.Assert;
import org.testng.annotations.Test;

public class Reporting {
@Test
public void login() {
	System.out.println("Login");
}
@Test
public void credentials() {
	Assert.assertEquals("mohit", "MOHIT");
}
}
