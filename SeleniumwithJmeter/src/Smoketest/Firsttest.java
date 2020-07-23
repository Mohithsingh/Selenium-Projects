package Smoketest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
public class Firsttest {
	 WebDriver driver =null;
	
	@Before
	public void beforetest() {
		System.out.println("Before Test");
		//System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		 //driver=new ChromeDriver();
		driver = new HtmlUnitDriver();
	}
	
@Test
public void test1() {
	 try {
	driver.get("http://book.theautomatedtester.co.uk/");
	 } catch (Exception e) {
         e.printStackTrace();
     }
}
@Test
public void test2() {
	try {
	driver.get("http://book.theautomatedtester.co.uk/");
	} catch (Exception e) {
        e.printStackTrace();
    }
	
}
@After
public void aftertest() {
	System.out.println("After Test");
	driver.close();
	driver.quit();
}
}
