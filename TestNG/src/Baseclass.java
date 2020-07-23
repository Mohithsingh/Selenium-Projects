

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclass {

	public static ThreadLocal<WebDriver> dr = new ThreadLocal<WebDriver>();
	
	@BeforeMethod
	public void beforemethod() throws IllegalAccessException{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		new WebDriverFactory();
		WebDriver driver = WebDriverFactory.create("Chrome");
		setWebDriver(driver);
		
		
		getWebDriver().manage().window().maximize();
		getWebDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	public void setWebDriver(WebDriver driver){
		dr.set(driver);
	}
	
	
	public WebDriver getWebDriver(){
		return dr.get();
	}
	
	@AfterMethod
	public void aftermethod(){
		getWebDriver().quit();
		dr.set(null);
	}
}
