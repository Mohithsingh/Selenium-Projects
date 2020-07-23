import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Classroom1 {
static String a="mohith";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.navigate().to("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
System.out.println(driver.getTitle());	
driver.switchTo().frame("iframeResult");
	WebElement button=driver.findElement(By.xpath("/html/body/button"));
	button.click();
	driver.switchTo().alert().sendKeys("tester");
	driver.switchTo().alert().accept();
	WebDriverWait wait = new WebDriverWait(driver, 20);
	WebElement readthetext = wait
			.until(ExpectedConditions.visibilityOfElementLocated(By.id("demo")));
	System.out.println(readthetext.getText());
	String text=readthetext.getText();
	if (text.contains("mohith"))
	{ 
	    System.out.println("Contains your name");
	}else{
	    System.out.println("Your name does not exist");
	}

	driver.close();
	}
}
