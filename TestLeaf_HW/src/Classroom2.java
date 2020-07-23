
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Classroom2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe\\");
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.navigate().to("https://www.irctc.co.in/nget/train-search");
driver.manage().window().maximize();
WebElement btnclick=driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div[2]/div/form/div[2]/button"));
btnclick.click();
WebElement flightlink=driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[6]/a"));
flightlink.click();
/*Thread.sleep(3000);
WebElement checit=driver.findElement(By.xpath("(//div[@class='custom-control custom-checkbox'])[2]"));	
checit.click();
WebElement conti=driver.findElement(By.xpath("(//button[@class='btn btn-md blue-gradient btn-rounded waves-effect waves-light m-0 font-14'])[4]"));
conti.click();*/
try {
	File src= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	File target=new File("D:/flightwindow.png");
	FileUtils.copyFile(src,target );
	}
	 
	catch (IOException e)
	 {
	  System.out.println(e.getMessage());
	 
	 }
driver.close();
driver.switchTo().defaultContent();


	}
}
