package api.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class uibase {

	public static WebDriver driver;
	protected static WebDriverWait wait,shortwait;
	protected WebElement element, email, password;
	//,,ruleList,ruleName,createRule,activationStartDate,activationStartTime,activationEndDate,activationEndTime,fileupload,fileInput,pdReward;
	protected static String currentWindow, handlepopup;
	protected static String workingDir = System.getProperty("user.dir");

	protected String click= "click";
	protected String sendKeys="sendKeys";
	protected String dropdown="dropdown";

}
