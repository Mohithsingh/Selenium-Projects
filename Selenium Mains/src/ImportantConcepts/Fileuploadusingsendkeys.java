package ImportantConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileuploadusingsendkeys {
WebDriver driver;
	public void pageupload() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://cgi-lib.berkeley.edu/ex/fup.html");
		WebElement uploadfile=driver.findElement(By.xpath("//input[@name='upfile']"));				
		uploadfile.sendKeys("D:\\Railways Scoring.xlsx");
		WebElement notes=driver.findElement(By.xpath("//input[@name='note']"));
		notes.sendKeys("My File");
		WebElement press=driver.findElement(By.xpath("//input[@value='Press']"));
		press.click();
		System.out.println(driver.getTitle());
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Fileuploadusingsendkeys pg=new Fileuploadusingsendkeys();
		pg.pageupload();
}
}
