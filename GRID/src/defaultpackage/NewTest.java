package defaultpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.JavascriptExecutor;

public class NewTest {
	public WebDriver driver;
  @Test
  public void f() {
	  ((JavascriptExecutor) driver).executeScript("document.getElementsByName('signUpForm:j_idt77')[0].click()");
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver();
	  driver.get("http://pkgridtst1/grcom/signup/signup.xhtml");
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
