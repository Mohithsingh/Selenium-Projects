package Commomfunctions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.seleniumhq.jetty9.util.log.Logger;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable;

public class Commonfunctions {
	public static WebDriver driver=null;
	public static Properties properties=null;
	static Logger logger=Logger.getLogger(Commonfunctions.class);
	public Properties loadpropertyfile() throws IOException {
		FileInputStream fileinputstream=new FileInputStream("config.properties");
		Properties properties=new Properties();
		properties.load(fileinputstream);
		return properties;
	}
	@BeforeSuite
	public void Launchbrowser() throws IOException
{
		PropertyConfigurator.configure("log4j.properties");
		logger.info("Orange HRM Test Begins");
		logger.info("Loading the property file");
		loadpropertyfile();
		String browser=properties.getProperty("browser");
		String url=properties.getProperty("url");
		String driverlocation=properties.getProperty("DriverLocation");
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",driverlocation);
			logger.info("Launching Chrome");
			driver=new ChromeDriver();
			
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",driverlocation);
			logger.info("Launching Firefox");
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		logger.info("Navigating to Application");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
}
	@AfterSuite
	public void teardown() {
		logger.info("Execution Done. Closing the Browser");
		driver.quit();
		
	}

}
