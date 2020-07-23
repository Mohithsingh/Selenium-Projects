import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

	static WebDriver create(String type) throws IllegalAccessException{
		WebDriver driver;
		
		switch(type) {
		  
		case "Firefox":
			  driver = new FirefoxDriver();
			  break;
		case "Chrome":
			  driver = new ChromeDriver();
			  break;
		default:
			 throw new IllegalAccessException();
		}
		
		return driver;
	}
}
