import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Testwebsite extends Baseclass {
	
@Test
public void testcase1() throws InterruptedException {
	getWebDriver().navigate().to("www.google.com");
	Thread.sleep(5000);
	getWebDriver().findElement(By.xpath("//input[@name='q\']")).sendKeys("mohith");
}
@Test
public void testcase2() throws InterruptedException {
	getWebDriver().get("www.google.com");
	Thread.sleep(5000);
	getWebDriver().findElement(By.xpath("//input[@name='q\']")).sendKeys("geethu");
	
}
}
