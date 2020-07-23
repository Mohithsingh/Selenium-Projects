package Pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard_Pageo_Objects {
	@FindBy(xpath="//*[@id='task-list-group-panel-menu_holder']//following::td[1]")
	public static WebElement pendingleaveRequests;
}
