import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng1 {
	@BeforeSuite
	public void startingestng() {
		System.out.println("starting testng");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("before test");
	}
	@BeforeClass

	public void initializeselenium() {
		System.out.println("initializeselenium");
	}
	@BeforeMethod
	
	public void login() {
		System.out.println("Browwser login");
	}
	
@Test
public void firsttestcase() {
	System.out.println("First Testng testcase");
}
@Test
public void secondtestcase() {
	System.out.println("Second Testng testcase");
}
@AfterMethod
public void closingbrowser() {
	System.out.println("close browser");
}
@AfterClass
public void destroyselenium() {
	System.out.println("destroy selenium");
}
@AfterTest
public void aftertest() {
	System.out.println("after test");
}
@AfterSuite
public void aftersuite() {
	System.out.println("after suite");
}
	}
