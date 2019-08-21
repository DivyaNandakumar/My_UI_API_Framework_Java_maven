package ui.api.frameworkTest;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Autothon {
  @Test
  public static void captureScreenMethod() throws Exception{
	  System.out.println("Inside the screenshot capture method");
	  String exePath = "src\\assets\\chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver", exePath);
  System.setProperty("webdriver.gecko.driver","src\\assets\\geckodriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://www.youtube.com");
  File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  FileUtils.copyFile(screenshotFile, new File("src/test/java/ui/api/frameworkTest/Screenshots/YouTubeCapture.png"));
  driver.close();
  driver.quit(); 
  }
}
