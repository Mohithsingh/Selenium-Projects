package Testcases;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.seleniumhq.jetty9.util.log.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import Commomfunctions.Commonfunctions;
import Pageobjects.User_Role_Page_Objects;

public class Test_User_Role extends Commonfunctions{
	static Logger logger=Logger.getLogger(Test_User_Role.class);
	public void movetouserspage() {
		
		Actions actions=new Actions(driver);
		actions.moveToElement(User_Role_Page_Objects.adminLink);
		actions.moveToElement(User_Role_Page_Objects.userManagementLink);
		actions.moveToElement(User_Role_Page_Objects.usersLink);
		actions.click().build().perform();	
	}
	public void selectUserRole() {
		Select selectRole=new Select(User_Role_Page_Objects.userRole);
		selectRole.selectByIndex(1);
	}
	public void selectStatus() {
		Select selectStatus=new Select(User_Role_Page_Objects.userStatus);
		selectStatus.selectByIndex(1);
	}
	@Test
 public void checkUserRole() {
		PageFactory.initElements(driver, User_Role_Page_Objects.class); 
		Logger.Info("Navigating to users page");
		movetouserspage();
		Logger.Info("Selecting UserRole");
		selectUserRole();
		Logger.Info("Selecting Status");
		selectStatus();
		User_Role_Page_Objects.searchButton.click();
		String actualrole=User_Role_Page_Objects.userRoleValue.getText();
		String actualstatus=User_Role_Page_Objects.userStatus.getText();
		Logger.Info("Verifying the results");
		Assert.assertEquals(actualrole, "Admin");
		Assert.assertEquals(actualstatus, "Enabled");
		Logger.Info("Execution Done. End of Test User Role");
	}
}
