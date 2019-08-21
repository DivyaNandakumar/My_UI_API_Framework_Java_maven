package ui.api.frameworkTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	WebDriver driver ;
	
	
  @Test
  public void ProblemSolution() {
	  
	  driver.findElement(By.id("search")).sendKeys("step-inforum");
	    driver.findElement(By.id("search-icon-legacy")).click();  //channel-title
      driver.findElement(By.id("channel-title")).getText();
      driver.findElement(By.id("channel-title")).click();
     // driver.findElement(By.xpath("a[text()='Ask Question']")).click();

    //a[text()="Ask Question"]
 // List<WebElement> j =     driver.findElements(By.xpath("div[contains(@class, 'tab-content')"));
      
//  String k =     j.get(1).getText();
//System.out.println(k);
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	 	String exePath = "src\\assets\\chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", exePath);
				driver =  new ChromeDriver();
				driver.get("https://www.youtube.com");
			  
  }

  @AfterTest
  public void afterTest() {
  }

}
