package Testcases;

import org.openqa.selenium.support.PageFactory;
import org.seleniumhq.jetty9.util.log.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commomfunctions.Commonfunctions;
import Pageobjects.Dashboard_Pageo_Objects;
import Pageobjects.Login_Page_Objects;

public class Test_Pending_Leave_Request extends Commonfunctions{
	static Logger logger=Logger.getLogger(Test_Pending_Leave_Request.class);
	public void login() {
		logger.info("Login the application");
		PageFactory.initElements(driver,Login_Page_Objects.class);
		Login_Page_Objects.userName.sendKeys(properties.getProperty("username"));
		Login_Page_Objects.password.sendKeys(properties.getProperty("password"));
		Login_Page_Objects.submitButton.click();
	}
	public void getPendingLeavRequests() {
		PageFactory.initElements(driver,Dashboard_Pageo_Objects.class);
		String actualmessage=Dashboard_Pageo_Objects.pendingleaveRequests.getText();
		Assert.assertEquals(actualmessage,"No Records are Available");
	}
	@Test
	public void verifyPendingLeavRequests() {
		logger.info("Getting the pending leave request details");
		login();
		getPendingLeavRequests();
		logger.info("Verifications");
		logger.info("End of Test Pending Leave Request Test case");
	}

}
