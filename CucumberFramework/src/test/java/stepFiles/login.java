package stepFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login {
	
	WebDriver driver;
	
	/**@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver","D:\\Cucumber Framework\\src\\test\\java\\resources\\chromedriver.exe");
	this.driver=new ChromeDriver();
	this.driver.manage().window().maximize();
	this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	this.driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
	}**/
	@Before
	public void setup_firefox() {
		System.setProperty("webdriver.gecko.driver","D:\\Cucumber Framework\\src\\test\\java\\resources\\geckodriver.exe");
		FirefoxOptions firefoxoptions=new FirefoxOptions();
		firefoxoptions.setCapability("marionette", true);
		this.driver=new FirefoxDriver(firefoxoptions);
	this.driver.manage().window().maximize();
	this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	this.driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
	}
	@After
	public void teardown() {
		this.driver.manage().deleteAllCookies();
		this.driver.quit();
		this.driver=null;
	}
	
	@Given("^User navigates to stackoverflow website$")
	public void user_navigates_to_stackoverflow_website() throws Throwable {
driver.get("https://stackoverflow.com/");
System.out.println("StackOverFlow Opened");
	}

	@And("^User clikcs on the login button on homepage$")
	public void user_clikcs_on_the_login_button_on_homepage() throws Throwable {
		Thread.sleep(2000);
		WebElement login=driver.findElement(By.xpath("/html/body/header/div/ol[2]/li[2]/a[1]"));
		login.click();
	   System.out.println("Login button clicked");
	}

	@And("^User enters a valid username$")
	public void user_enters_a_valid_username() throws Throwable {
		Thread.sleep(2000);
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("mohithsingh.qa@gmail.com");
		System.out.println("Email Id Entered");
	}

	@And("^User enters a valid password$")
	public void user_enters_a_valid_password() throws Throwable {
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Manoj07$");		
		System.out.println("Password Entered");
	}

	@When("^User clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
		WebElement submit=driver.findElement(By.id("submit-button"));
		submit.click();	
		System.out.println("Submit Button Clicked");
	}

	@Then("^User should be taken to the successful login page$")
	public void user_should_be_taken_to_the_successful_login_page() throws Throwable {
		Thread.sleep(3000);
		WebElement askquestion=driver.findElement(By.xpath("//a[@class='ws-nowrap s-btn s-btn__primary']"));
		Assert.assertEquals(true,askquestion.isDisplayed());
		System.out.println("Successfully Taken to Login Page");
	}


}
