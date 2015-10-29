package grcom;

import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Set;

import java.util.concurrent.TimeUnit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static org.junit.Assert.assertEquals;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
//import org.apache.james.mime4j.field.datetime.DateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
//import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.internal.Nullable;

import com.google.common.base.Predicate;


public class individualvalidations {
	final static FirefoxProfile profile = new FirefoxProfile(new File("C:/Users/awafa/AppData/Roaming/Mozilla/Firefox/Profiles"));
	// static WebDriver webDriver = new FirefoxDriver(profile);	
  private WebDriver driver;
  private String baseUrl;
 // private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://gridstaging.globalrescue.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void individualvalidation() throws Exception {
   driver.get(baseUrl + "/grcom/signup/signup.xhtml");
   
   //I-A1-45-M
   String Price1= "Cost: $329.00" ;
   String price= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
   System.out.println("System "+price);
 
   if(Price1.equals(price))
   	
   {
   	
   System.out.println("Price is Verified for I-A1-45-M");
   Thread.sleep(1000);
   driver.findElement(By.id("signUpForm:planSelectionContinueBtn")).click();
   Thread.sleep(4000);
   assertEquals("Email cannot be empty", driver.findElement(By.cssSelector("h6.errormessage.margin-zero")).getText());
   driver.findElement(By.id("signUpForm:emailTxtField")).sendKeys("invalid email!@#$%^&*()_+~!");
   driver.findElement(By.id("signUpForm:planSelectionContinueBtn")).click();
   Thread.sleep(4000);
   assertEquals("Email is not Valid.", driver.findElement(By.cssSelector("h6.errormessage.margin-zero")).getText());
   driver.findElement(By.id("signUpForm:emailTxtField")).clear();
   driver.findElement(By.id("signUpForm:emailTxtField")).sendKeys("test@yahoo.com");
   driver.findElement(By.id("signUpForm:planSelectionContinueBtn")).click();
   Thread.sleep(7000);
   assertEquals("The email address you entered is in use and cannot be used to purchase new membership.", driver.findElement(By.xpath("//span[@id='signUpForm:duplicateEmailPanel']/div/div/h3")).getText());
   driver.findElement(By.id("signUpForm:j_idt369")).click();
   Thread.sleep(3000);
   int ran;
   ran = 100 + (int)(Math.random() * ((10000 - 100) + 1));
   
   driver.findElement(By.id("signUpForm:emailTxtField")).sendKeys("signuptest"+ran+"@test.com");
   driver.findElement(By.id("signUpForm:planSelectionContinueBtn")).click();
   //Thread.sleep(1500);
	Thread.sleep(10000);
   driver.findElement(By.id("signUpForm:memberDetailContinueBtn")).click();
   Thread.sleep(5000);
   assertEquals("First Name cannot be empty", driver.findElement(By.cssSelector("h6.errormessage.margin-zero")).getText());
   assertEquals("Last Name cannot be empty", driver.findElement(By.xpath("//span[@id='signUpForm:memberDetailPanel']/div/div[2]/div[3]/div[2]/h6")).getText());
   assertEquals("Gender cannot be empty", driver.findElement(By.xpath("//span[@id='signUpForm:memberDetailPanel']/div/div[2]/div[4]/div[2]/h6")).getText());
   assertEquals("Birth Date cannot be empty", driver.findElement(By.xpath("//span[@id='signUpForm:memberDetailPanel']/div/div[2]/div[6]/div[2]/h6[2]")).getText());
   assertEquals("Membership Start Date cannot be empty", driver.findElement(By.xpath("//span[@id='signUpForm:memberDetailPanel']/div/div[2]/div[7]/div[2]/h6[2]")).getText());
   assertEquals("Line 1 cannot be empty", driver.findElement(By.xpath("//span[@id='signUpForm:memberDetailPanel']/div/div[3]/div[2]/div[2]/h6")).getText());
   assertEquals("City cannot be empty", driver.findElement(By.xpath("//span[@id='signUpForm:memberDetailPanel']/div/div[3]/div[4]/div[2]/h6")).getText());
   assertEquals("Select State / Province from list", driver.findElement(By.xpath("//span[@id='signUpForm:stateFieldPanel']/div[2]/h6")).getText());
   assertEquals("Zip / Postal Code cannot be empty", driver.findElement(By.xpath("//span[@id='signUpForm:zipTextFieldPanel']/h6")).getText());
  
   driver.findElement(By.id("signUpForm:firstNameTxtField")).clear();
   driver.findElement(By.id("signUpForm:firstNameTxtField")).sendKeys("Test");
   driver.findElement(By.id("signUpForm:lastNameTxtField")).clear();
   driver.findElement(By.id("signUpForm:lastNameTxtField")).sendKeys("QA"); 
     
   driver.findElement(By.id("signUpForm:middleNameTxtField")).clear();
   driver.findElement(By.id("signUpForm:middleNameTxtField")).sendKeys("t");
  
   
   driver.findElement(By.id("signUpForm:contactGenderRadioBtn:1")).click();
   driver.findElement(By.id("signUpForm:contactGenderRadioBtn:0")).click();
   driver.findElement(By.cssSelector("div.flag.us")).click();	
   driver.findElement(By.id("signUpForm:mobileNumberInput:mobileNumberInput")).sendKeys("3456543");
   driver.findElement(By.id("signUpForm:birthDateInputDate")).clear(); 
   driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1940");
  
   driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).clear();
   driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).sendKeys("01/01/2018");
   driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).clear();
   driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).sendKeys("test");
   driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).clear();
   driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).sendKeys("las vegas");
   new Select(driver.findElement(By.id("signUpForm:primaryAddressStateDD"))).selectByVisibleText("Iowa");
   driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).clear();
   driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).sendKeys("89101");
   driver.findElement(By.id("signUpForm:memberDetailContinueBtn")).click();
   Thread.sleep(10000);
   driver.findElement(By.linkText("See Details")).click();
   Thread.sleep(4000);
   assertEquals("For individuals between the ages of 75 and 85, membership requires an application signed by your physician. Click here to download the application.", driver.findElement(By.cssSelector("h5.text-blue")).getText());
   driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
   //driver.findElement(By.xpath("(//span[@id='signUpForm:ageCheckFailedInfoPopupPanel']/div/div[3]/button")).click();
   Thread.sleep(3000);
   driver.findElement(By.id("signUpForm:firstNameTxtField")).clear();
   driver.findElement(By.id("signUpForm:firstNameTxtField")).sendKeys("21212a!@");
   driver.findElement(By.id("signUpForm:lastNameTxtField")).clear();
   driver.findElement(By.id("signUpForm:lastNameTxtField")).sendKeys("21212a!@"); 
   driver.findElement(By.id("signUpForm:memberDetailContinueBtn")).click();
   Thread.sleep(10000);
   assertEquals("First Name contains invalid character(s)", driver.findElement(By.xpath("//span[@id='signUpForm:memberDetailPanel']/div/div[2]/div[1]/div[2]/h6")).getText());
   assertEquals("Last Name contains invalid character(s)", driver.findElement(By.xpath("//span[@id='signUpForm:memberDetailPanel']/div/div[2]/div[3]/div[2]/h6")).getText());
   driver.findElement(By.id("signUpForm:firstNameTxtField")).clear();
   driver.findElement(By.id("signUpForm:firstNameTxtField")).sendKeys("Test");
   driver.findElement(By.id("signUpForm:lastNameTxtField")).clear();
   driver.findElement(By.id("signUpForm:lastNameTxtField")).sendKeys("QA"); 
   driver.findElement(By.id("signUpForm:birthDateInputDate")).clear(); 
   driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1990");
     
   driver.findElement(By.id("signUpForm:memberDetailContinueBtn")).click();
   Thread.sleep(10000);
   System.out.println("Age check between 75 & 85 validation checked!");
   System.out.println("Validations Passed at Member Details Interface.");
   driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
   assertEquals("Credit Card Number cannot be empty", driver.findElement(By.cssSelector("h6.errormessage.margin-zero")).getText());
   assertEquals("Invalid Expiry Date", driver.findElement(By.xpath("//span[@id='signUpForm:checkoutPanel']/div[2]/div/div/div/div[3]/div[2]/h6")).getText());
   assertEquals("CVV cannot be empty", driver.findElement(By.cssSelector("div.col-xs-8.padding-zero > h6.errormessage.margin-zero")).getText());
   assertEquals("You must agree to Member Services Agreement", driver.findElement(By.xpath("//span[@id='signUpForm:msaCheckPanel']/div/h6")).getText());
   Thread.sleep(5000);
   
   driver.findElement(By.id("signUpForm:ccNumberTxtField")).clear();
   driver.findElement(By.id("signUpForm:ccNumberTxtField")).sendKeys("876");
   new Select(driver.findElement(By.name("signUpForm:j_idt285"))).selectByVisibleText("May");
   new Select(driver.findElement(By.name("signUpForm:j_idt288"))).selectByVisibleText("2022");
   driver.findElement(By.id("signUpForm:cvvTxtField")).clear();
   driver.findElement(By.id("signUpForm:cvvTxtField")).sendKeys("9");  
   driver.findElement(By.id("signUpForm:referralCodeTxtField")).clear();
   driver.findElement(By.id("signUpForm:referralCodeTxtField")).sendKeys("ypo");
   
   driver.findElement(By.id("signUpForm:msaCheckBox")).click();
   Thread.sleep(2000);
   assertEquals("Discount: $3.29", driver.findElement(By.xpath("//span[@id='signUpForm:referralCodeDiscountPanel']/div/div/h3")).getText());
   assertEquals("Amount Due: $325.71", driver.findElement(By.xpath("//span[@id='signUpForm:referralCodeDiscountPanel']/div/div/h3[2]")).getText());
   System.out.println("RPCODE:YPO has been applied and verified the Discount and Amount due!");
   driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
   Thread.sleep(1500);
   driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
   Thread.sleep(1500);
   driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
   Thread.sleep(5000);
   assertEquals("Invalid Credit Card Number", driver.findElement(By.cssSelector("h6.errormessage.margin-zero")).getText());
   assertEquals("CVV cannot be less than 3 digits", driver.findElement(By.cssSelector("div.col-xs-8.padding-zero > h6.errormessage.margin-zero")).getText());
   driver.findElement(By.id("signUpForm:ccNumberTxtField")).clear();
   driver.findElement(By.id("signUpForm:ccNumberTxtField")).sendKeys("4111111111111111");
   driver.findElement(By.id("signUpForm:cvvTxtField")).clear();
   driver.findElement(By.id("signUpForm:cvvTxtField")).sendKeys("112");
   Thread.sleep(1000);
   driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
   Thread.sleep(1500);
   driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
   driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
   Thread.sleep(8000);
   System.out.println("Validations Passed at Checkout Interface.");
   System.out.println("Membership has been created Successfully, Thank You!");
   driver.close();
   }
   
   else
   {
   	System.out.println("Price is not same for I-A1-45-M, We are Terminating!");
   }
  }}
