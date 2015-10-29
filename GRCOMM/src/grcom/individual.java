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
import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class individual {
	final static FirefoxProfile profile = new FirefoxProfile(new File("C:/Users/awafa/AppData/Roaming/Mozilla/Firefox/Profiles"));
	// static WebDriver webDriver = new FirefoxDriver(profile);	
  private static WebDriver driver;
  private static String baseUrl;
 // private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  //@Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://gridstaging.globalrescue.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testIndividual1() throws Exception {
   driver.get(baseUrl + "/grcom/signup/signup.xhtml");
   
    //I-A1-45-M
    String Price1= "Cost: $329.00" ;
    String price= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
    System.out.println("System "+price);
  
    if(Price1.equals(price))
    	
    {
    	
    System.out.println("Price is Verified for I-A1-45-M");
    driver.findElement(By.id("signUpForm:emailTxtField")).clear();
    int ran;
    ran = 100 + (int)(Math.random() * ((10000 - 100) + 1));
    
    driver.findElement(By.id("signUpForm:emailTxtField")).sendKeys("signuptest"+ran+"@test.com");
    driver.findElement(By.id("signUpForm:planSelectionContinueBtn")).click();
    Thread.sleep(1500);
	Thread.sleep(10000);
	driver.findElement(By.id("signUpForm:firstNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:firstNameTxtField")).sendKeys("Test");
    driver.findElement(By.id("signUpForm:middleNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:middleNameTxtField")).sendKeys("t");
    driver.findElement(By.id("signUpForm:lastNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:lastNameTxtField")).sendKeys("QA");   
    driver.findElement(By.id("signUpForm:contactGenderRadioBtn:1")).click();
    driver.findElement(By.id("signUpForm:contactGenderRadioBtn:0")).click();
    driver.findElement(By.cssSelector("div.flag.us")).click();	
	driver.findElement(By.id("signUpForm:mobileNumberInput:mobileNumberInput")).sendKeys("3456543");
	driver.findElement(By.id("signUpForm:birthDateInputDate")).clear(); 
	driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
	driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).clear();
	driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).sendKeys("01/01/2017");
    driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).sendKeys("test");
    driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).sendKeys("las vegas");
    new Select(driver.findElement(By.id("signUpForm:primaryAddressStateDD"))).selectByVisibleText("Iowa");
    driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).sendKeys("89101");
    driver.findElement(By.id("signUpForm:memberDetailContinueBtn")).click();
    Thread.sleep(10000);
    driver.findElement(By.id("signUpForm:ccNumberTxtField")).clear();
    driver.findElement(By.id("signUpForm:ccNumberTxtField")).sendKeys("4111111111111111");
    new Select(driver.findElement(By.name("signUpForm:j_idt288"))).selectByVisibleText("May");
    new Select(driver.findElement(By.name("signUpForm:j_idt291"))).selectByVisibleText("2022");
    driver.findElement(By.id("signUpForm:cvvTxtField")).clear();
    driver.findElement(By.id("signUpForm:cvvTxtField")).sendKeys("112");
    driver.findElement(By.id("signUpForm:msaCheckBox")).click();
    Thread.sleep(500);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(1500);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(5000);
    driver.close();
    }
    
    else
    {
    	System.out.println("Price is not same for I-A1-45-M");
    }
    
    //I-A1-45-S
    driver = new FirefoxDriver();
    baseUrl = "https://gridstaging.globalrescue.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
    String Price2= "Cost: $655.00" ;
    driver.findElement(By.xpath("//a[@id='signUpForm:j_idt160']/span")).click();
    Thread.sleep(9000);
    String price2a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
    System.out.println("System "+price2a);
   
    if(Price2.equals(price2a))
    {
    	
    System.out.println("Price is Verified for I-A1-45-S");
    driver.findElement(By.id("signUpForm:emailTxtField")).clear();
    int ran;
    ran = 100 + (int)(Math.random() * ((10000 - 100) + 1));
    driver.findElement(By.id("signUpForm:emailTxtField")).sendKeys("signuptest"+ran+"@test.com");
    driver.findElement(By.id("signUpForm:planSelectionContinueBtn")).click();
    Thread.sleep(1500);
	Thread.sleep(10000);
	driver.findElement(By.id("signUpForm:firstNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:firstNameTxtField")).sendKeys("Test");
    driver.findElement(By.id("signUpForm:middleNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:middleNameTxtField")).sendKeys("t");
    driver.findElement(By.id("signUpForm:lastNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:lastNameTxtField")).sendKeys("QA");   
    driver.findElement(By.id("signUpForm:contactGenderRadioBtn:1")).click();
    driver.findElement(By.id("signUpForm:contactGenderRadioBtn:0")).click();
    driver.findElement(By.cssSelector("div.flag.us")).click();	
	driver.findElement(By.id("signUpForm:mobileNumberInput:mobileNumberInput")).sendKeys("3456543");
	driver.findElement(By.id("signUpForm:birthDateInputDate")).clear(); 
	driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
	driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).clear();
	driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).sendKeys("01/01/2017");
    driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).sendKeys("test");
    driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).sendKeys("las vegas");
    new Select(driver.findElement(By.id("signUpForm:primaryAddressStateDD"))).selectByVisibleText("Iowa");
    driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).sendKeys("89101");
    driver.findElement(By.id("signUpForm:memberDetailContinueBtn")).click();
    Thread.sleep(10000);
    driver.findElement(By.id("signUpForm:ccNumberTxtField")).clear();
    driver.findElement(By.id("signUpForm:ccNumberTxtField")).sendKeys("4111111111111111");
    new Select(driver.findElement(By.name("signUpForm:j_idt288"))).selectByVisibleText("May");
    new Select(driver.findElement(By.name("signUpForm:j_idt291"))).selectByVisibleText("2022");
    driver.findElement(By.id("signUpForm:cvvTxtField")).clear();
    driver.findElement(By.id("signUpForm:cvvTxtField")).sendKeys("112");
    driver.findElement(By.id("signUpForm:msaCheckBox")).click();
    Thread.sleep(500);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(1500);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(5000);
    driver.close();
    }
    
    else
    {
    	System.out.println("Price is not same for I-A1-45-S");
    }
    
    //I-A1-90-M
    
    driver = new FirefoxDriver();
    baseUrl = "https://gridstaging.globalrescue.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
    Thread.sleep(1000);
    String Price15 = "Cost: $429.00";
    driver.findElement(By.id("signUpForm:j_idt145")).click();
    Thread.sleep(9000);
   
    String price15a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
    System.out.println("System "+price15a);
    
    if(Price15.equals(price15a))
    {
    	System.out.println("Price is Verified for I-A1-90-M");
    int ran1;
    ran1 = 100 + (int)(Math.random() * ((10000 - 100) + 1));
   
    driver.findElement(By.id("signUpForm:emailTxtField")).sendKeys("signuptest"+ran1+"@test.com");
    driver.findElement(By.id("signUpForm:planSelectionContinueBtn")).click();
    Thread.sleep(10000);
    driver.findElement(By.id("signUpForm:firstNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:firstNameTxtField")).sendKeys("Test");
    driver.findElement(By.id("signUpForm:middleNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:middleNameTxtField")).sendKeys("t");
    driver.findElement(By.id("signUpForm:lastNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:lastNameTxtField")).sendKeys("QA");   
    driver.findElement(By.id("signUpForm:contactGenderRadioBtn:1")).click();
    driver.findElement(By.id("signUpForm:contactGenderRadioBtn:0")).click();
    driver.findElement(By.cssSelector("div.flag.us")).click(); 	
	driver.findElement(By.id("signUpForm:mobileNumberInput:mobileNumberInput")).sendKeys("3456543");
    driver.findElement(By.id("signUpForm:birthDateInputDate")).clear();
    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
    driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).clear();
    driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).sendKeys("01/01/2017");
    driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).sendKeys("test");
    driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).sendKeys("las vegas");
    new Select(driver.findElement(By.id("signUpForm:primaryAddressStateDD"))).selectByVisibleText("Iowa");
    driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).sendKeys("89101");
    driver.findElement(By.id("signUpForm:memberDetailContinueBtn")).click();
    Thread.sleep(10000);
    driver.findElement(By.id("signUpForm:ccNumberTxtField")).clear();
    driver.findElement(By.id("signUpForm:ccNumberTxtField")).sendKeys("4111111111111111");
    new Select(driver.findElement(By.name("signUpForm:j_idt288"))).selectByVisibleText("May");
    new Select(driver.findElement(By.name("signUpForm:j_idt291"))).selectByVisibleText("2022");
    driver.findElement(By.id("signUpForm:cvvTxtField")).clear();
    driver.findElement(By.id("signUpForm:cvvTxtField")).sendKeys("112");
    driver.findElement(By.id("signUpForm:msaCheckBox")).click();
    Thread.sleep(500);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(1500);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(5000);
    driver.close();
    }
   
    else
    {
    System.out.println("Price is not same for I-A1-90-M");
    }
    
 //I-A1-90-S
    driver = new FirefoxDriver();
    baseUrl = "https://gridstaging.globalrescue.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
    Thread.sleep(1000);
    String Price3= "Cost: $855.00" ;
    driver.findElement(By.id("signUpForm:j_idt145")).click();
    Thread.sleep(9000);
   
    driver.findElement(By.xpath("//a[@id='signUpForm:j_idt160']/span")).click();
    Thread.sleep(9000);
    String price3a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
    System.out.println("System "+price3a);
    
    if(Price3.equals(price3a))
    {
    	
    System.out.println("Price is Verified for I-A1-90-S");
    driver.findElement(By.id("signUpForm:emailTxtField")).clear();
    int ran;
    ran = 100 + (int)(Math.random() * ((10000 - 100) + 1));
    driver.findElement(By.id("signUpForm:emailTxtField")).sendKeys("signuptest"+ran+"@test.com");
    driver.findElement(By.id("signUpForm:planSelectionContinueBtn")).click();
    Thread.sleep(1500);
	Thread.sleep(10000);
	driver.findElement(By.id("signUpForm:firstNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:firstNameTxtField")).sendKeys("Test");
    driver.findElement(By.id("signUpForm:middleNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:middleNameTxtField")).sendKeys("t");
    driver.findElement(By.id("signUpForm:lastNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:lastNameTxtField")).sendKeys("QA");   
    driver.findElement(By.id("signUpForm:contactGenderRadioBtn:1")).click();
    driver.findElement(By.id("signUpForm:contactGenderRadioBtn:0")).click();
    driver.findElement(By.cssSelector("div.flag.us")).click();	
	driver.findElement(By.id("signUpForm:mobileNumberInput:mobileNumberInput")).sendKeys("3456543");
    driver.findElement(By.id("signUpForm:birthDateInputDate")).clear();
    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
    driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).clear();
    driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).sendKeys("01/01/2017");
    driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).sendKeys("test");
    driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).sendKeys("las vegas");
    new Select(driver.findElement(By.id("signUpForm:primaryAddressStateDD"))).selectByVisibleText("Iowa");
    driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).sendKeys("89101");
    driver.findElement(By.id("signUpForm:memberDetailContinueBtn")).click();
    Thread.sleep(10000);
    driver.findElement(By.id("signUpForm:ccNumberTxtField")).clear();
    driver.findElement(By.id("signUpForm:ccNumberTxtField")).sendKeys("4111111111111111");
    new Select(driver.findElement(By.name("signUpForm:j_idt288"))).selectByVisibleText("May");
    new Select(driver.findElement(By.name("signUpForm:j_idt291"))).selectByVisibleText("2022");
    driver.findElement(By.id("signUpForm:cvvTxtField")).clear();
    driver.findElement(By.id("signUpForm:cvvTxtField")).sendKeys("112");
    driver.findElement(By.id("signUpForm:msaCheckBox")).click();
    Thread.sleep(500);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(1500);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(5000);
    driver.close();
    }
    
    else
    {
    	System.out.println("Price is not same for I-A1-90-S");
    }
    
//I-A1-180-M
    
    driver = new FirefoxDriver();
    baseUrl = "https://gridstaging.globalrescue.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
    Thread.sleep(1000);
    String Price16="Cost: $514.00";
    driver.findElement(By.xpath("//a[@id='signUpForm:j_idt149']/b")).click();
    Thread.sleep(9000);
    
    String price16a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
    System.out.println("System "+price16a);
    if(Price16.equals(price16a))
    {
    	System.out.println("Price is Verified for I-A1-180-M");
    int ran2;
    ran2 = 100 + (int)(Math.random() * ((10000 - 100) + 1));
   
    driver.findElement(By.id("signUpForm:emailTxtField")).sendKeys("signuptest"+ran2+"@test.com");
    driver.findElement(By.id("signUpForm:planSelectionContinueBtn")).click();
    Thread.sleep(10000);
	driver.findElement(By.id("signUpForm:firstNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:firstNameTxtField")).sendKeys("Test");
    driver.findElement(By.id("signUpForm:middleNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:middleNameTxtField")).sendKeys("t");
    driver.findElement(By.id("signUpForm:lastNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:lastNameTxtField")).sendKeys("QA"); 
    driver.findElement(By.id("signUpForm:contactGenderRadioBtn:1")).click();
    driver.findElement(By.id("signUpForm:contactGenderRadioBtn:0")).click();
    driver.findElement(By.cssSelector("div.flag.us")).click();
	driver.findElement(By.id("signUpForm:mobileNumberInput:mobileNumberInput")).sendKeys("3456543");
    driver.findElement(By.id("signUpForm:birthDateInputDate")).clear();
    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
    driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).clear();
    driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).sendKeys("01/01/2017");
    driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).sendKeys("test");
    driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).sendKeys("las vegas");
    new Select(driver.findElement(By.id("signUpForm:primaryAddressStateDD"))).selectByVisibleText("Iowa");
    driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).sendKeys("89101");
    driver.findElement(By.id("signUpForm:memberDetailContinueBtn")).click();
    Thread.sleep(10000);
    driver.findElement(By.id("signUpForm:ccNumberTxtField")).clear();
    driver.findElement(By.id("signUpForm:ccNumberTxtField")).sendKeys("4111111111111111");
    new Select(driver.findElement(By.name("signUpForm:j_idt288"))).selectByVisibleText("May");
    new Select(driver.findElement(By.name("signUpForm:j_idt291"))).selectByVisibleText("2022");
    driver.findElement(By.id("signUpForm:cvvTxtField")).clear();
    driver.findElement(By.id("signUpForm:cvvTxtField")).sendKeys("112");
    driver.findElement(By.id("signUpForm:msaCheckBox")).click();
    Thread.sleep(500);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(1500);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(5000);
    driver.close();
    }
    else
    {
    	System.out.println("Price is not same for I-A1-180-M");
    }
    
//I-A1-365-M
    
    driver = new FirefoxDriver();
    baseUrl = "https://gridstaging.globalrescue.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  
    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
    Thread.sleep(1000);
    String Price17="Cost: $639.00";
    driver.findElement(By.id("signUpForm:j_idt153")).click();
    Thread.sleep(9000);
   
    String price17a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
    System.out.println("System "+price17a);
    if(Price17.equals(price17a))
    {
    	System.out.println("Price is Verified for I-A1-365-M");
    int ran3;
    ran3 = 100 + (int)(Math.random() * ((10000 - 100) + 1));
    
    driver.findElement(By.id("signUpForm:emailTxtField")).sendKeys("signuptest"+ran3+"@test.com");
    driver.findElement(By.id("signUpForm:planSelectionContinueBtn")).click();
    Thread.sleep(10000);
	driver.findElement(By.id("signUpForm:firstNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:firstNameTxtField")).sendKeys("Test");
    driver.findElement(By.id("signUpForm:middleNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:middleNameTxtField")).sendKeys("t");
    driver.findElement(By.id("signUpForm:lastNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:lastNameTxtField")).sendKeys("QA");   
    driver.findElement(By.id("signUpForm:contactGenderRadioBtn:1")).click();
    driver.findElement(By.id("signUpForm:contactGenderRadioBtn:0")).click();
    driver.findElement(By.cssSelector("div.flag.us")).click();
	driver.findElement(By.id("signUpForm:mobileNumberInput:mobileNumberInput")).sendKeys("3456543");
    driver.findElement(By.id("signUpForm:birthDateInputDate")).clear();
    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
    driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).clear();
    driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).sendKeys("01/01/2017");
    driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).sendKeys("test");
    driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).sendKeys("las vegas");
    new Select(driver.findElement(By.id("signUpForm:primaryAddressStateDD"))).selectByVisibleText("Iowa");
    driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).sendKeys("89101");
    driver.findElement(By.id("signUpForm:memberDetailContinueBtn")).click();
    Thread.sleep(10000);
    driver.findElement(By.id("signUpForm:ccNumberTxtField")).clear();
    driver.findElement(By.id("signUpForm:ccNumberTxtField")).sendKeys("4111111111111111");
    new Select(driver.findElement(By.name("signUpForm:j_idt288"))).selectByVisibleText("May");
    new Select(driver.findElement(By.name("signUpForm:j_idt291"))).selectByVisibleText("2022");
    driver.findElement(By.id("signUpForm:cvvTxtField")).clear();
    driver.findElement(By.id("signUpForm:cvvTxtField")).sendKeys("112");
    driver.findElement(By.id("signUpForm:msaCheckBox")).click();
    Thread.sleep(500);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(1500);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(5000);
    driver.close();
    }
    else
    {
    	System.out.println("Price is not same for I-A1-365-M");
    }
    
//I-A2-45-M
    
    driver = new FirefoxDriver();
    baseUrl = "https://gridstaging.globalrescue.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
    Thread.sleep(1000);
    String Price18="Cost: $638.00";
    driver.findElement(By.id("signUpForm:j_idt100")).click();
    Thread.sleep(5000); 
    
    String price18a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
    System.out.println("System "+price18a);
    if(Price18.equals(price18a))
    {
    	System.out.println("Price is Verified for I-A2-45-M");
    int ran4;
    ran4 = 100 + (int)(Math.random() * ((10000 - 100) + 1));
  
    driver.findElement(By.id("signUpForm:emailTxtField")).sendKeys("signuptest"+ran4+"@test.com");
    driver.findElement(By.id("signUpForm:planSelectionContinueBtn")).click();
    Thread.sleep(10000);
	driver.findElement(By.id("signUpForm:firstNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:firstNameTxtField")).sendKeys("Test");
    driver.findElement(By.id("signUpForm:middleNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:middleNameTxtField")).sendKeys("t");
    driver.findElement(By.id("signUpForm:lastNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:lastNameTxtField")).sendKeys("QA");
    driver.findElement(By.id("signUpForm:contactGenderRadioBtn:1")).click();
    driver.findElement(By.id("signUpForm:contactGenderRadioBtn:0")).click();
    driver.findElement(By.cssSelector("div.flag.us")).click();
	driver.findElement(By.id("signUpForm:mobileNumberInput:mobileNumberInput")).sendKeys("3456543");
    driver.findElement(By.id("signUpForm:birthDateInputDate")).clear();
    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
    driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).clear();
    driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).sendKeys("01/01/2017");
    driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).sendKeys("test");
    driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).sendKeys("las vegas");
    new Select(driver.findElement(By.id("signUpForm:primaryAddressStateDD"))).selectByVisibleText("Iowa");
    driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).sendKeys("89101");
    driver.findElement(By.id("signUpForm:memberDetailContinueBtn")).click();
    Thread.sleep(10000);
    driver.findElement(By.id("signUpForm:ccNumberTxtField")).clear();
    driver.findElement(By.id("signUpForm:ccNumberTxtField")).sendKeys("4111111111111111");
    new Select(driver.findElement(By.name("signUpForm:j_idt288"))).selectByVisibleText("May");
    new Select(driver.findElement(By.name("signUpForm:j_idt291"))).selectByVisibleText("2022");
    driver.findElement(By.id("signUpForm:cvvTxtField")).clear();
    driver.findElement(By.id("signUpForm:cvvTxtField")).sendKeys("112");
    driver.findElement(By.id("signUpForm:msaCheckBox")).click();
    Thread.sleep(500);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(1500);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(5000);
    driver.close();
    }
    else
    {
    	System.out.println("Price is not same for I-A2-45-M");
    }
    
    //I-A2-90-M
    
    driver = new FirefoxDriver();
    baseUrl = "https://gridstaging.globalrescue.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
    Thread.sleep(1000);
    String Price19="Cost: $838.00";
    driver.findElement(By.id("signUpForm:j_idt100")).click();
    Thread.sleep(5000);
    driver.findElement(By.id("signUpForm:j_idt145")).click();
    Thread.sleep(9000);
   
    String price19a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
    System.out.println("System "+price19a);
    if(Price19.equals(price19a))
    {
    	System.out.println("Price is Verified for I-A2-90-M");
    int ran5;
    ran5 = 100 + (int)(Math.random() * ((10000 - 100) + 1));
    
    driver.findElement(By.id("signUpForm:emailTxtField")).sendKeys("signuptest"+ran5+"@test.com");
    driver.findElement(By.id("signUpForm:planSelectionContinueBtn")).click();
    Thread.sleep(10000);
	driver.findElement(By.id("signUpForm:firstNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:firstNameTxtField")).sendKeys("Test");
    driver.findElement(By.id("signUpForm:middleNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:middleNameTxtField")).sendKeys("t");
    driver.findElement(By.id("signUpForm:lastNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:lastNameTxtField")).sendKeys("QA");
    driver.findElement(By.id("signUpForm:contactGenderRadioBtn:1")).click();
    driver.findElement(By.id("signUpForm:contactGenderRadioBtn:0")).click();
    driver.findElement(By.cssSelector("div.flag.us")).click(); 	
	driver.findElement(By.id("signUpForm:mobileNumberInput:mobileNumberInput")).sendKeys("3456543");
    driver.findElement(By.id("signUpForm:birthDateInputDate")).clear();
    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
    driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).clear();
    driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).sendKeys("01/01/2017");
    driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).sendKeys("test");
    driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).sendKeys("las vegas");
    new Select(driver.findElement(By.id("signUpForm:primaryAddressStateDD"))).selectByVisibleText("Iowa");
    driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).sendKeys("89101");
    driver.findElement(By.id("signUpForm:memberDetailContinueBtn")).click();
    Thread.sleep(10000);
    driver.findElement(By.id("signUpForm:ccNumberTxtField")).clear();
    driver.findElement(By.id("signUpForm:ccNumberTxtField")).sendKeys("4111111111111111");
    new Select(driver.findElement(By.name("signUpForm:j_idt288"))).selectByVisibleText("May");
    new Select(driver.findElement(By.name("signUpForm:j_idt291"))).selectByVisibleText("2022");
    driver.findElement(By.id("signUpForm:cvvTxtField")).clear();
    driver.findElement(By.id("signUpForm:cvvTxtField")).sendKeys("112");
    driver.findElement(By.id("signUpForm:msaCheckBox")).click();
    Thread.sleep(500);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(1500);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(5000);
    driver.close();
    }
    else
    {
    	System.out.println("Price is not same for I-A2-90-M");
    }
  //I-A2-365-S
    
    driver = new FirefoxDriver();
    baseUrl = "https://gridstaging.globalrescue.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
    Thread.sleep(1000);
    String Price4= "Cost: $2,515.00" ;
    driver.findElement(By.id("signUpForm:j_idt100")).click();
    Thread.sleep(9000);
    driver.findElement(By.id("signUpForm:j_idt153")).click();
    Thread.sleep(9000);
    driver.findElement(By.xpath("//a[@id='signUpForm:j_idt160']/span")).click();
    Thread.sleep(9000);
    String price4a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
    System.out.println("System "+price4a);
    if(Price4.equals(price4a))
    {
    	
    System.out.println("Price is Verified for I-A2-365-S");
    driver.findElement(By.id("signUpForm:emailTxtField")).clear();
    int ran;
    ran = 100 + (int)(Math.random() * ((10000 - 100) + 1));
    driver.findElement(By.id("signUpForm:emailTxtField")).sendKeys("signuptest"+ran+"@test.com");
    driver.findElement(By.id("signUpForm:planSelectionContinueBtn")).click();
    Thread.sleep(1500);
	Thread.sleep(10000);
	driver.findElement(By.id("signUpForm:firstNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:firstNameTxtField")).sendKeys("Test");
    driver.findElement(By.id("signUpForm:middleNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:middleNameTxtField")).sendKeys("t");
    driver.findElement(By.id("signUpForm:lastNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:lastNameTxtField")).sendKeys("QA");   
    driver.findElement(By.id("signUpForm:contactGenderRadioBtn:1")).click();
    driver.findElement(By.id("signUpForm:contactGenderRadioBtn:0")).click();
    driver.findElement(By.cssSelector("div.flag.us")).click();	
	driver.findElement(By.id("signUpForm:mobileNumberInput:mobileNumberInput")).sendKeys("3456543");
    driver.findElement(By.id("signUpForm:birthDateInputDate")).clear();
    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
    driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).clear();
    driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).sendKeys("01/01/2017");
    driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).sendKeys("test");
    driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).sendKeys("las vegas");
    new Select(driver.findElement(By.id("signUpForm:primaryAddressStateDD"))).selectByVisibleText("Iowa");
    driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).sendKeys("89101");
    driver.findElement(By.id("signUpForm:memberDetailContinueBtn")).click();
    Thread.sleep(10000);
    driver.findElement(By.id("signUpForm:ccNumberTxtField")).clear();
    driver.findElement(By.id("signUpForm:ccNumberTxtField")).sendKeys("4111111111111111");
    new Select(driver.findElement(By.name("signUpForm:j_idt288"))).selectByVisibleText("May");
    new Select(driver.findElement(By.name("signUpForm:j_idt291"))).selectByVisibleText("2022");
    driver.findElement(By.id("signUpForm:cvvTxtField")).clear();
    driver.findElement(By.id("signUpForm:cvvTxtField")).sendKeys("112");
    driver.findElement(By.id("signUpForm:msaCheckBox")).click();
    Thread.sleep(500);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(1500);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(5000);
    driver.close();
    }
    
    else
    {
    	System.out.println("Price is not same for I-A2-365-S");
    }
    
 //I-A3-45-M
    
    driver = new FirefoxDriver();
    baseUrl = "https://gridstaging.globalrescue.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
    Thread.sleep(1000);
    String Price20="Cost: $937.00";
    driver.findElement(By.id("signUpForm:j_idt104")).click();
    Thread.sleep(9000);
   
    String price20a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
    System.out.println("System "+price20a);
    if(Price20.equals(price20a))
    {
    	System.out.println("Price is Verified for I-A3-45-M");
    int ran6;
    ran6 = 100 + (int)(Math.random() * ((10000 - 100) + 1));
    
    driver.findElement(By.id("signUpForm:emailTxtField")).sendKeys("signuptest"+ran6+"@test.com");
    driver.findElement(By.id("signUpForm:planSelectionContinueBtn")).click();
    Thread.sleep(10000);
	driver.findElement(By.id("signUpForm:firstNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:firstNameTxtField")).sendKeys("Test");
    driver.findElement(By.id("signUpForm:middleNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:middleNameTxtField")).sendKeys("t");
    driver.findElement(By.id("signUpForm:lastNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:lastNameTxtField")).sendKeys("QA");
    driver.findElement(By.id("signUpForm:contactGenderRadioBtn:1")).click();
    driver.findElement(By.id("signUpForm:contactGenderRadioBtn:0")).click();
    driver.findElement(By.cssSelector("div.flag.us")).click(); 	
	driver.findElement(By.id("signUpForm:mobileNumberInput:mobileNumberInput")).sendKeys("3456543");
    driver.findElement(By.id("signUpForm:birthDateInputDate")).clear();
    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
    driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).clear();
    driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).sendKeys("01/01/2017");
    driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).sendKeys("test");
    driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).sendKeys("las vegas");
    new Select(driver.findElement(By.id("signUpForm:primaryAddressStateDD"))).selectByVisibleText("Iowa");
    driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).sendKeys("89101");
    driver.findElement(By.id("signUpForm:memberDetailContinueBtn")).click();
    Thread.sleep(10000);
    driver.findElement(By.id("signUpForm:ccNumberTxtField")).clear();
    driver.findElement(By.id("signUpForm:ccNumberTxtField")).sendKeys("4111111111111111");
    new Select(driver.findElement(By.name("signUpForm:j_idt288"))).selectByVisibleText("May");
    new Select(driver.findElement(By.name("signUpForm:j_idt291"))).selectByVisibleText("2022");
    driver.findElement(By.id("signUpForm:cvvTxtField")).clear();
    driver.findElement(By.id("signUpForm:cvvTxtField")).sendKeys("112");
    driver.findElement(By.id("signUpForm:msaCheckBox")).click();
    Thread.sleep(500);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(1500);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(5000);
    driver.close();
 }
    
    else
    {
    	System.out.println("Price is not same for I-A3-45-M");
    }
    
//I-A3-90-S
    
    driver = new FirefoxDriver();
    baseUrl = "https://gridstaging.globalrescue.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
    Thread.sleep(1000);
    String Price5= "Cost: $2,470.00" ;
    driver.findElement(By.id("signUpForm:j_idt104")).click();
    Thread.sleep(8000);
    driver.findElement(By.id("signUpForm:j_idt145")).click();
    Thread.sleep(8000);
    driver.findElement(By.xpath("//a[@id='signUpForm:j_idt160']/span")).click();
    Thread.sleep(8000);
    String price5a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
    System.out.println("System "+price5a);
    if(Price5.equals(price5a))
    {
    	
    System.out.println("Price is Verified for I-A3-90-S");
    driver.findElement(By.id("signUpForm:emailTxtField")).clear();
    int ran;
    ran = 100 + (int)(Math.random() * ((10000 - 100) + 1));
    driver.findElement(By.id("signUpForm:emailTxtField")).sendKeys("signuptest"+ran+"@test.com");
    driver.findElement(By.id("signUpForm:planSelectionContinueBtn")).click();
    Thread.sleep(1500);
	Thread.sleep(10000);
	driver.findElement(By.id("signUpForm:firstNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:firstNameTxtField")).sendKeys("Test");
    driver.findElement(By.id("signUpForm:middleNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:middleNameTxtField")).sendKeys("t");
    driver.findElement(By.id("signUpForm:lastNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:lastNameTxtField")).sendKeys("QA");   
    driver.findElement(By.id("signUpForm:contactGenderRadioBtn:1")).click();
    driver.findElement(By.id("signUpForm:contactGenderRadioBtn:0")).click();
    driver.findElement(By.cssSelector("div.flag.us")).click();	
	driver.findElement(By.id("signUpForm:mobileNumberInput:mobileNumberInput")).sendKeys("3456543");
    driver.findElement(By.id("signUpForm:birthDateInputDate")).clear();
    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
    driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).clear();
    driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).sendKeys("01/01/2017");
    driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).sendKeys("test");
    driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).sendKeys("las vegas");
    new Select(driver.findElement(By.id("signUpForm:primaryAddressStateDD"))).selectByVisibleText("Iowa");
    driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).sendKeys("89101");
    driver.findElement(By.id("signUpForm:memberDetailContinueBtn")).click();
    Thread.sleep(10000);
    driver.findElement(By.id("signUpForm:ccNumberTxtField")).clear();
    driver.findElement(By.id("signUpForm:ccNumberTxtField")).sendKeys("4111111111111111");
    new Select(driver.findElement(By.name("signUpForm:j_idt288"))).selectByVisibleText("May");
    new Select(driver.findElement(By.name("signUpForm:j_idt291"))).selectByVisibleText("2022");
    driver.findElement(By.id("signUpForm:cvvTxtField")).clear();
    driver.findElement(By.id("signUpForm:cvvTxtField")).sendKeys("112");
    driver.findElement(By.id("signUpForm:msaCheckBox")).click();
    Thread.sleep(500);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(1500);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(5000);
    driver.close();
    }
    
    else
    {
    	System.out.println("Price is not same for I-A3-90-S");
    }
    
//I-A3-180-S
    
    driver = new FirefoxDriver();
    baseUrl = "https://gridstaging.globalrescue.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
    Thread.sleep(1000);
    String Price6= "Cost: $2,980.00" ;
    driver.findElement(By.id("signUpForm:j_idt104")).click();
    Thread.sleep(8000);
    driver.findElement(By.id("signUpForm:j_idt149")).click();
    Thread.sleep(8000);
    driver.findElement(By.xpath("//a[@id='signUpForm:j_idt160']/span")).click();
    Thread.sleep(8000);
    String price6a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
    System.out.println("System "+price6a);
    if(Price6.equals(price6a))
    {
    	
    System.out.println("Price is Verified for I-A3-180-S");
    driver.findElement(By.id("signUpForm:emailTxtField")).clear();
    int ran;
    ran = 100 + (int)(Math.random() * ((10000 - 100) + 1));
    driver.findElement(By.id("signUpForm:emailTxtField")).sendKeys("signuptest"+ran+"@test.com");
    driver.findElement(By.id("signUpForm:planSelectionContinueBtn")).click();
    Thread.sleep(1500);
	Thread.sleep(10000);
	driver.findElement(By.id("signUpForm:firstNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:firstNameTxtField")).sendKeys("Test");
    driver.findElement(By.id("signUpForm:middleNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:middleNameTxtField")).sendKeys("t");
    driver.findElement(By.id("signUpForm:lastNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:lastNameTxtField")).sendKeys("QA");   
    driver.findElement(By.id("signUpForm:contactGenderRadioBtn:1")).click();
    driver.findElement(By.id("signUpForm:contactGenderRadioBtn:0")).click();
    driver.findElement(By.cssSelector("div.flag.us")).click();	
	driver.findElement(By.id("signUpForm:mobileNumberInput:mobileNumberInput")).sendKeys("3456543");
    driver.findElement(By.id("signUpForm:birthDateInputDate")).clear();
    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
    driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).clear();
    driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).sendKeys("01/01/2017");
    driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).sendKeys("test");
    driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).sendKeys("las vegas");
    new Select(driver.findElement(By.id("signUpForm:primaryAddressStateDD"))).selectByVisibleText("Iowa");
    driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).sendKeys("89101");
    driver.findElement(By.id("signUpForm:memberDetailContinueBtn")).click();
    Thread.sleep(10000);
    driver.findElement(By.id("signUpForm:ccNumberTxtField")).clear();
    driver.findElement(By.id("signUpForm:ccNumberTxtField")).sendKeys("4111111111111111");
    new Select(driver.findElement(By.name("signUpForm:j_idt288"))).selectByVisibleText("May");
    new Select(driver.findElement(By.name("signUpForm:j_idt291"))).selectByVisibleText("2022");
    driver.findElement(By.id("signUpForm:cvvTxtField")).clear();
    driver.findElement(By.id("signUpForm:cvvTxtField")).sendKeys("112");
    driver.findElement(By.id("signUpForm:msaCheckBox")).click();
    Thread.sleep(500);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(1500);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(5000);
    driver.close();
    }
    
    else
    {
    	System.out.println("Price is not same for I-A3-180-S");
    }
    
//I-A3-365-S
    
    driver = new FirefoxDriver();
    baseUrl = "https://gridstaging.globalrescue.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
    Thread.sleep(1000);
    String Price7= "Cost: $3,730.00" ;
    driver.findElement(By.id("signUpForm:j_idt104")).click();
    Thread.sleep(8000);
    driver.findElement(By.id("signUpForm:j_idt153")).click();
    Thread.sleep(8000);
    
    driver.findElement(By.xpath("//a[@id='signUpForm:j_idt160']/span")).click();
    Thread.sleep(8000);
    String price7a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
    System.out.println("System "+price7a);
    if(Price7.equals(price7a))
    {
    	
    System.out.println("Price is Verified for I-A3-365-S");
    driver.findElement(By.id("signUpForm:emailTxtField")).clear();
    int ran;
    ran = 100 + (int)(Math.random() * ((10000 - 100) + 1));
    driver.findElement(By.id("signUpForm:emailTxtField")).sendKeys("signuptest"+ran+"@test.com");
    driver.findElement(By.id("signUpForm:planSelectionContinueBtn")).click();
    Thread.sleep(1500);
	Thread.sleep(10000);
	driver.findElement(By.id("signUpForm:firstNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:firstNameTxtField")).sendKeys("Test");
    driver.findElement(By.id("signUpForm:middleNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:middleNameTxtField")).sendKeys("t");
    driver.findElement(By.id("signUpForm:lastNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:lastNameTxtField")).sendKeys("QA");   
    driver.findElement(By.id("signUpForm:contactGenderRadioBtn:1")).click();
    driver.findElement(By.id("signUpForm:contactGenderRadioBtn:0")).click();
    driver.findElement(By.cssSelector("div.flag.us")).click();	
	driver.findElement(By.id("signUpForm:mobileNumberInput:mobileNumberInput")).sendKeys("3456543");
    driver.findElement(By.id("signUpForm:birthDateInputDate")).clear();
    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
    driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).clear();
    driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).sendKeys("01/01/2017");
    driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).sendKeys("test");
    driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).sendKeys("las vegas");
    new Select(driver.findElement(By.id("signUpForm:primaryAddressStateDD"))).selectByVisibleText("Iowa");
    driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).sendKeys("89101");
    driver.findElement(By.id("signUpForm:memberDetailContinueBtn")).click();
    Thread.sleep(10000);
    driver.findElement(By.id("signUpForm:ccNumberTxtField")).clear();
    driver.findElement(By.id("signUpForm:ccNumberTxtField")).sendKeys("4111111111111111");
    new Select(driver.findElement(By.name("signUpForm:j_idt288"))).selectByVisibleText("May");
    new Select(driver.findElement(By.name("signUpForm:j_idt291"))).selectByVisibleText("2022");
    driver.findElement(By.id("signUpForm:cvvTxtField")).clear();
    driver.findElement(By.id("signUpForm:cvvTxtField")).sendKeys("112");
    driver.findElement(By.id("signUpForm:msaCheckBox")).click();
    Thread.sleep(500);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(1500);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(5000);
    driver.close();
    }
    
    else
    {
    	System.out.println("Price is not same for I-A3-365-S");
    }
    
//I-A4-365-M
    
    driver = new FirefoxDriver();
    baseUrl = "https://gridstaging.globalrescue.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    
    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
    Thread.sleep(1000);
    String Price23="Cost: $2,466.00";
    driver.findElement(By.id("signUpForm:j_idt108")).click();
    Thread.sleep(8000);
    driver.findElement(By.id("signUpForm:j_idt153")).click();
    Thread.sleep(8000);
    String price23a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
    System.out.println("System "+price23a);
    if(Price23.equals(price23a))
    {
    int ran7;
    ran7 = 100 + (int)(Math.random() * ((10000 - 100) + 1));
    
    driver.findElement(By.id("signUpForm:emailTxtField")).sendKeys("signuptest"+ran7+"@test.com");
    driver.findElement(By.id("signUpForm:planSelectionContinueBtn")).click();
    Thread.sleep(10000);
	driver.findElement(By.id("signUpForm:firstNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:firstNameTxtField")).sendKeys("Test");
    driver.findElement(By.id("signUpForm:middleNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:middleNameTxtField")).sendKeys("t");
    driver.findElement(By.id("signUpForm:lastNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:lastNameTxtField")).sendKeys("QA");   
    driver.findElement(By.id("signUpForm:contactGenderRadioBtn:1")).click();
    driver.findElement(By.id("signUpForm:contactGenderRadioBtn:0")).click();
    driver.findElement(By.cssSelector("div.flag.us")).click();
	driver.findElement(By.id("signUpForm:mobileNumberInput:mobileNumberInput")).sendKeys("3456543");
    driver.findElement(By.id("signUpForm:birthDateInputDate")).clear();
    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
    driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).clear();
    driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).sendKeys("01/01/2017");
    driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).sendKeys("test");
    driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).sendKeys("las vegas");
    new Select(driver.findElement(By.id("signUpForm:primaryAddressStateDD"))).selectByVisibleText("Iowa");
    driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).sendKeys("89101");
    driver.findElement(By.id("signUpForm:memberDetailContinueBtn")).click();
    Thread.sleep(10000);
    driver.findElement(By.id("signUpForm:ccNumberTxtField")).clear();
    driver.findElement(By.id("signUpForm:ccNumberTxtField")).sendKeys("4111111111111111");
    new Select(driver.findElement(By.name("signUpForm:j_idt288"))).selectByVisibleText("May");
    new Select(driver.findElement(By.name("signUpForm:j_idt291"))).selectByVisibleText("2022");
    driver.findElement(By.id("signUpForm:cvvTxtField")).clear();
    driver.findElement(By.id("signUpForm:cvvTxtField")).sendKeys("112");
    driver.findElement(By.id("signUpForm:msaCheckBox")).click();
    Thread.sleep(500);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(1500);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(5000);
    driver.close();
    }
    else
    {
    	System.out.println("Price is not same for I-A4-365-M");
    }
    
//I-A4-45-S
    
    driver = new FirefoxDriver();
    baseUrl = "https://gridstaging.globalrescue.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
    Thread.sleep(1000);
    String Price8= "Cost: $2,450.00" ;
    driver.findElement(By.id("signUpForm:j_idt108")).click();
    Thread.sleep(9000);   
    driver.findElement(By.xpath("//a[@id='signUpForm:j_idt160']/span")).click();
    Thread.sleep(9000);
    String price8a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
    System.out.println("System "+price7a);
    if(Price8.equals(price8a))
    {
    	
    System.out.println("Price is Verified for I-A4-45-S");
    driver.findElement(By.id("signUpForm:emailTxtField")).clear();
    int ran;
    ran = 100 + (int)(Math.random() * ((10000 - 100) + 1));
    driver.findElement(By.id("signUpForm:emailTxtField")).sendKeys("signuptest"+ran+"@test.com");
    driver.findElement(By.id("signUpForm:planSelectionContinueBtn")).click();
    Thread.sleep(1500);
	Thread.sleep(10000);
	driver.findElement(By.id("signUpForm:firstNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:firstNameTxtField")).sendKeys("Test");
    driver.findElement(By.id("signUpForm:middleNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:middleNameTxtField")).sendKeys("t");
    driver.findElement(By.id("signUpForm:lastNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:lastNameTxtField")).sendKeys("QA");   
    driver.findElement(By.id("signUpForm:contactGenderRadioBtn:1")).click();
    driver.findElement(By.id("signUpForm:contactGenderRadioBtn:0")).click();
    driver.findElement(By.cssSelector("div.flag.us")).click();	
	driver.findElement(By.id("signUpForm:mobileNumberInput:mobileNumberInput")).sendKeys("3456543");
    driver.findElement(By.id("signUpForm:birthDateInputDate")).clear();
    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
    driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).clear();
    driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).sendKeys("01/01/2017");
    driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).sendKeys("test");
    driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).sendKeys("las vegas");
    new Select(driver.findElement(By.id("signUpForm:primaryAddressStateDD"))).selectByVisibleText("Iowa");
    driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).sendKeys("89101");
    driver.findElement(By.id("signUpForm:memberDetailContinueBtn")).click();
    Thread.sleep(10000);
    driver.findElement(By.id("signUpForm:ccNumberTxtField")).clear();
    driver.findElement(By.id("signUpForm:ccNumberTxtField")).sendKeys("4111111111111111");
    new Select(driver.findElement(By.name("signUpForm:j_idt288"))).selectByVisibleText("May");
    new Select(driver.findElement(By.name("signUpForm:j_idt291"))).selectByVisibleText("2022");
    driver.findElement(By.id("signUpForm:cvvTxtField")).clear();
    driver.findElement(By.id("signUpForm:cvvTxtField")).sendKeys("112");
    driver.findElement(By.id("signUpForm:msaCheckBox")).click();
    Thread.sleep(500);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(1500);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(5000);
    driver.close();
    }
    
    else
    {
    	System.out.println("Price is not same for I-A4-45-S");
    }
    
//I-A4-90-S
    
    driver = new FirefoxDriver();
    baseUrl = "https://gridstaging.globalrescue.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
    Thread.sleep(1000);
    String Price9= "Cost: $3,250.00" ;
    driver.findElement(By.id("signUpForm:j_idt108")).click();
    Thread.sleep(9000);
    driver.findElement(By.id("signUpForm:j_idt145")).click();
    Thread.sleep(9000);
    
    driver.findElement(By.xpath("//a[@id='signUpForm:j_idt160']/span")).click();
    Thread.sleep(9000);
    String price9a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
    System.out.println("System "+price9a);
    if(Price9.equals(price9a))
    {
    	
    System.out.println("Price is Verified for I-A4-90-S");
    driver.findElement(By.id("signUpForm:emailTxtField")).clear();
    int ran;
    ran = 100 + (int)(Math.random() * ((10000 - 100) + 1));
    driver.findElement(By.id("signUpForm:emailTxtField")).sendKeys("signuptest"+ran+"@test.com");
    driver.findElement(By.id("signUpForm:planSelectionContinueBtn")).click();
    Thread.sleep(1500);
	Thread.sleep(10000);
	driver.findElement(By.id("signUpForm:firstNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:firstNameTxtField")).sendKeys("Test");
    driver.findElement(By.id("signUpForm:middleNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:middleNameTxtField")).sendKeys("t");
    driver.findElement(By.id("signUpForm:lastNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:lastNameTxtField")).sendKeys("QA");   
    driver.findElement(By.id("signUpForm:contactGenderRadioBtn:1")).click();
    driver.findElement(By.id("signUpForm:contactGenderRadioBtn:0")).click();
    driver.findElement(By.cssSelector("div.flag.us")).click();	
	driver.findElement(By.id("signUpForm:mobileNumberInput:mobileNumberInput")).sendKeys("3456543");
    driver.findElement(By.id("signUpForm:birthDateInputDate")).clear();
    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
    driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).clear();
    driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).sendKeys("01/01/2017");
    driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).sendKeys("test");
    driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).sendKeys("las vegas");
    new Select(driver.findElement(By.id("signUpForm:primaryAddressStateDD"))).selectByVisibleText("Iowa");
    driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).sendKeys("89101");
    driver.findElement(By.id("signUpForm:memberDetailContinueBtn")).click();
    Thread.sleep(10000);
    driver.findElement(By.id("signUpForm:ccNumberTxtField")).clear();
    driver.findElement(By.id("signUpForm:ccNumberTxtField")).sendKeys("4111111111111111");
    new Select(driver.findElement(By.name("signUpForm:j_idt288"))).selectByVisibleText("May");
    new Select(driver.findElement(By.name("signUpForm:j_idt291"))).selectByVisibleText("2022");
    driver.findElement(By.id("signUpForm:cvvTxtField")).clear();
    driver.findElement(By.id("signUpForm:cvvTxtField")).sendKeys("112");
    driver.findElement(By.id("signUpForm:msaCheckBox")).click();
    Thread.sleep(500);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(1500);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(5000);
    driver.close();
    }
    
    else
    {
    	System.out.println("Price is not same for I-A4-90-S");
    }
    
//I-A4-180-S
    
    driver = new FirefoxDriver();
    baseUrl = "https://gridstaging.globalrescue.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
    Thread.sleep(1000);
    String Price10= "Cost: $3,930.00" ;
    driver.findElement(By.id("signUpForm:j_idt108")).click();
    Thread.sleep(9000);
    driver.findElement(By.id("signUpForm:j_idt149")).click();
    Thread.sleep(9000);
    
    driver.findElement(By.xpath("//a[@id='signUpForm:j_idt160']/span")).click();
    Thread.sleep(9000);
    String price10a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
    System.out.println("System "+price10a);
    if(Price10.equals(price10a))
    {
    	
    System.out.println("Price is Verified for I-A4-180-S");
    driver.findElement(By.id("signUpForm:emailTxtField")).clear();
    int ran;
    ran = 100 + (int)(Math.random() * ((10000 - 100) + 1));
    driver.findElement(By.id("signUpForm:emailTxtField")).sendKeys("signuptest"+ran+"@test.com");
    driver.findElement(By.id("signUpForm:planSelectionContinueBtn")).click();
    Thread.sleep(1500);
	Thread.sleep(10000);
	driver.findElement(By.id("signUpForm:firstNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:firstNameTxtField")).sendKeys("Test");
    driver.findElement(By.id("signUpForm:middleNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:middleNameTxtField")).sendKeys("t");
    driver.findElement(By.id("signUpForm:lastNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:lastNameTxtField")).sendKeys("QA");   
    driver.findElement(By.id("signUpForm:contactGenderRadioBtn:1")).click();
    driver.findElement(By.id("signUpForm:contactGenderRadioBtn:0")).click();
    driver.findElement(By.cssSelector("div.flag.us")).click();	
	driver.findElement(By.id("signUpForm:mobileNumberInput:mobileNumberInput")).sendKeys("3456543");
    driver.findElement(By.id("signUpForm:birthDateInputDate")).clear();
    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
    driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).clear();
    driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).sendKeys("01/01/2017");
    driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).sendKeys("test");
    driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).sendKeys("las vegas");
    new Select(driver.findElement(By.id("signUpForm:primaryAddressStateDD"))).selectByVisibleText("Iowa");
    driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).sendKeys("89101");
    driver.findElement(By.id("signUpForm:memberDetailContinueBtn")).click();
    Thread.sleep(10000);
    driver.findElement(By.id("signUpForm:ccNumberTxtField")).clear();
    driver.findElement(By.id("signUpForm:ccNumberTxtField")).sendKeys("4111111111111111");
    new Select(driver.findElement(By.name("signUpForm:j_idt288"))).selectByVisibleText("May");
    new Select(driver.findElement(By.name("signUpForm:j_idt291"))).selectByVisibleText("2022");
    driver.findElement(By.id("signUpForm:cvvTxtField")).clear();
    driver.findElement(By.id("signUpForm:cvvTxtField")).sendKeys("112");
    driver.findElement(By.id("signUpForm:msaCheckBox")).click();
    Thread.sleep(500);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(1500);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(5000);
    driver.close();
    }
    
    else
    {
    	System.out.println("Price is not same for I-A4-180-S");
    }
    
//I-A4-365-S
    
    driver = new FirefoxDriver();
    baseUrl = "https://gridstaging.globalrescue.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
    Thread.sleep(1000);
    String Price11= "Cost: $4,930.00" ;
    driver.findElement(By.id("signUpForm:j_idt108")).click();
    Thread.sleep(9000);
    driver.findElement(By.id("signUpForm:j_idt153")).click();
    Thread.sleep(9000);
    
    driver.findElement(By.xpath("//a[@id='signUpForm:j_idt160']/span")).click();
    Thread.sleep(9000);
    String price11a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
    System.out.println("System "+price11a);
    if(Price11.equals(price11a))
    {
    	
    System.out.println("Price is Verified for I-A4-365-S");
    driver.findElement(By.id("signUpForm:emailTxtField")).clear();
    int ran;
    ran = 100 + (int)(Math.random() * ((10000 - 100) + 1));
    driver.findElement(By.id("signUpForm:emailTxtField")).sendKeys("signuptest"+ran+"@test.com");
    driver.findElement(By.id("signUpForm:planSelectionContinueBtn")).click();
    Thread.sleep(1500);
	Thread.sleep(10000);
	driver.findElement(By.id("signUpForm:firstNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:firstNameTxtField")).sendKeys("Test");
    driver.findElement(By.id("signUpForm:middleNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:middleNameTxtField")).sendKeys("t");
    driver.findElement(By.id("signUpForm:lastNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:lastNameTxtField")).sendKeys("QA");   
    driver.findElement(By.id("signUpForm:contactGenderRadioBtn:1")).click();
    driver.findElement(By.id("signUpForm:contactGenderRadioBtn:0")).click();
    driver.findElement(By.cssSelector("div.flag.us")).click();	
	driver.findElement(By.id("signUpForm:mobileNumberInput:mobileNumberInput")).sendKeys("3456543");
    driver.findElement(By.id("signUpForm:birthDateInputDate")).clear();
    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
    driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).clear();
    driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).sendKeys("01/01/2017");
    driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).sendKeys("test");
    driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).sendKeys("las vegas");
    new Select(driver.findElement(By.id("signUpForm:primaryAddressStateDD"))).selectByVisibleText("Iowa");
    driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).sendKeys("89101");
    driver.findElement(By.id("signUpForm:memberDetailContinueBtn")).click();
    Thread.sleep(10000);
    driver.findElement(By.id("signUpForm:ccNumberTxtField")).clear();
    driver.findElement(By.id("signUpForm:ccNumberTxtField")).sendKeys("4111111111111111");
    new Select(driver.findElement(By.name("signUpForm:j_idt288"))).selectByVisibleText("May");
    new Select(driver.findElement(By.name("signUpForm:j_idt291"))).selectByVisibleText("2022");
    driver.findElement(By.id("signUpForm:cvvTxtField")).clear();
    driver.findElement(By.id("signUpForm:cvvTxtField")).sendKeys("112");
    driver.findElement(By.id("signUpForm:msaCheckBox")).click();
    Thread.sleep(500);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(1500);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(5000);
    driver.close();
    }
    
    else
    {
    	System.out.println("Price is not same for I-A4-365-S");
    }
    
    
//I-A5-180-M
    
    driver = new FirefoxDriver();
    baseUrl = "https://gridstaging.globalrescue.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    
    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
    Thread.sleep(1000);
    String Price24="Cost: $2,420.00";
    driver.findElement(By.id("signUpForm:j_idt112")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//a[@id='signUpForm:j_idt149']/b")).click();
    Thread.sleep(9000);
    String price24a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
    System.out.println("System "+price24a);
    if(Price24.equals(price24a))
    {
    	
    System.out.println("Price is Verified for I-A5-180-M");
    int ran8;
    ran8 = 100 + (int)(Math.random() * ((10000 - 100) + 1));
    
    driver.findElement(By.id("signUpForm:emailTxtField")).sendKeys("signuptest"+ran8+"@test.com");
    driver.findElement(By.id("signUpForm:planSelectionContinueBtn")).click();
    Thread.sleep(10000);
	driver.findElement(By.id("signUpForm:firstNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:firstNameTxtField")).sendKeys("Test");
    driver.findElement(By.id("signUpForm:middleNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:middleNameTxtField")).sendKeys("t");
    driver.findElement(By.id("signUpForm:lastNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:lastNameTxtField")).sendKeys("QA");   
    driver.findElement(By.id("signUpForm:contactGenderRadioBtn:1")).click();
    driver.findElement(By.id("signUpForm:contactGenderRadioBtn:0")).click();
    driver.findElement(By.cssSelector("div.flag.us")).click();
	driver.findElement(By.id("signUpForm:mobileNumberInput:mobileNumberInput")).sendKeys("3456543");
    driver.findElement(By.id("signUpForm:birthDateInputDate")).clear();
    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
    driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).clear();
    driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).sendKeys("01/01/2017");
    driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).sendKeys("test");
    driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).sendKeys("las vegas");
    new Select(driver.findElement(By.id("signUpForm:primaryAddressStateDD"))).selectByVisibleText("Iowa");
    driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).sendKeys("89101");
    driver.findElement(By.id("signUpForm:memberDetailContinueBtn")).click();
    Thread.sleep(10000);
    driver.findElement(By.id("signUpForm:ccNumberTxtField")).clear();
    driver.findElement(By.id("signUpForm:ccNumberTxtField")).sendKeys("4111111111111111");
    new Select(driver.findElement(By.name("signUpForm:j_idt288"))).selectByVisibleText("May");
    new Select(driver.findElement(By.name("signUpForm:j_idt291"))).selectByVisibleText("2022");
    driver.findElement(By.id("signUpForm:cvvTxtField")).clear();
    driver.findElement(By.id("signUpForm:cvvTxtField")).sendKeys("112");
    driver.findElement(By.id("signUpForm:msaCheckBox")).click();
    Thread.sleep(500);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(1500);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(5000);
    driver.close();
 }
    
    else
    {
    	System.out.println("Price is not same for I-A5-180-M");
    }
    
//I-A5-365-M
    
    driver = new FirefoxDriver();
    baseUrl = "https://gridstaging.globalrescue.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    
    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
    Thread.sleep(1000);
    String Price25="Cost: $3,045.00";
    driver.findElement(By.id("signUpForm:j_idt112")).click();
    Thread.sleep(5000);
    driver.findElement(By.id("signUpForm:j_idt153")).click();
    Thread.sleep(9000);
    String price25a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
    System.out.println("System "+price25a);
    if(Price25.equals(price25a))
    {
    	System.out.println("Price is Verified for I-A5-365-M");
    int ran9;
    ran9 = 100 + (int)(Math.random() * ((10000 - 100) + 1));
    
    driver.findElement(By.id("signUpForm:emailTxtField")).sendKeys("signuptest"+ran9+"@test.com");
    driver.findElement(By.id("signUpForm:planSelectionContinueBtn")).click();
    Thread.sleep(10000);
	driver.findElement(By.id("signUpForm:firstNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:firstNameTxtField")).sendKeys("Test");
    driver.findElement(By.id("signUpForm:middleNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:middleNameTxtField")).sendKeys("t");
    driver.findElement(By.id("signUpForm:lastNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:lastNameTxtField")).sendKeys("QA");   
    driver.findElement(By.id("signUpForm:contactGenderRadioBtn:1")).click();
    driver.findElement(By.id("signUpForm:contactGenderRadioBtn:0")).click();
    driver.findElement(By.cssSelector("div.flag.us")).click();
	driver.findElement(By.id("signUpForm:mobileNumberInput:mobileNumberInput")).sendKeys("3456543");
    driver.findElement(By.id("signUpForm:birthDateInputDate")).clear();
    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
    driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).clear();
    driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).sendKeys("01/01/2017");
    driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).sendKeys("test");
    driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).sendKeys("las vegas");
    new Select(driver.findElement(By.id("signUpForm:primaryAddressStateDD"))).selectByVisibleText("Iowa");
    driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).sendKeys("89101");
    driver.findElement(By.id("signUpForm:memberDetailContinueBtn")).click();
    Thread.sleep(10000);
    driver.findElement(By.id("signUpForm:ccNumberTxtField")).clear();
    driver.findElement(By.id("signUpForm:ccNumberTxtField")).sendKeys("4111111111111111");
    new Select(driver.findElement(By.name("signUpForm:j_idt288"))).selectByVisibleText("May");
    new Select(driver.findElement(By.name("signUpForm:j_idt291"))).selectByVisibleText("2022");
    driver.findElement(By.id("signUpForm:cvvTxtField")).clear();
    driver.findElement(By.id("signUpForm:cvvTxtField")).sendKeys("112");
    driver.findElement(By.id("signUpForm:msaCheckBox")).click();
    Thread.sleep(500);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(1500);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(5000);
    driver.close();
}
    
    else
    {
    	System.out.println("Price is not same for I-A5-365-M");
    }
    
//I-A5-45-S
    
    driver = new FirefoxDriver();
    baseUrl = "https://gridstaging.globalrescue.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
    Thread.sleep(1000);
    String Price12= "Cost: $2,990.00" ;
    driver.findElement(By.id("signUpForm:j_idt112")).click();
    Thread.sleep(9000);
    driver.findElement(By.xpath("//a[@id='signUpForm:j_idt160']/span")).click();
    Thread.sleep(9000);
    String price12a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
    System.out.println("System "+price12a);
    if(Price12.equals(price12a))
    {
    	
    System.out.println("Price is Verified for I-A5-45-S");
    driver.findElement(By.id("signUpForm:emailTxtField")).clear();
    int ran;
    ran = 100 + (int)(Math.random() * ((10000 - 100) + 1));
    driver.findElement(By.id("signUpForm:emailTxtField")).sendKeys("signuptest"+ran+"@test.com");
    driver.findElement(By.id("signUpForm:planSelectionContinueBtn")).click();
    Thread.sleep(1500);
	Thread.sleep(10000);
	driver.findElement(By.id("signUpForm:firstNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:firstNameTxtField")).sendKeys("Test");
    driver.findElement(By.id("signUpForm:middleNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:middleNameTxtField")).sendKeys("t");
    driver.findElement(By.id("signUpForm:lastNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:lastNameTxtField")).sendKeys("QA");   
    driver.findElement(By.id("signUpForm:contactGenderRadioBtn:1")).click();
    driver.findElement(By.id("signUpForm:contactGenderRadioBtn:0")).click();
    driver.findElement(By.cssSelector("div.flag.us")).click();	
	driver.findElement(By.id("signUpForm:mobileNumberInput:mobileNumberInput")).sendKeys("3456543");
    driver.findElement(By.id("signUpForm:birthDateInputDate")).clear();
    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
    driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).clear();
    driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).sendKeys("01/01/2017");
    driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).sendKeys("test");
    driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).sendKeys("las vegas");
    new Select(driver.findElement(By.id("signUpForm:primaryAddressStateDD"))).selectByVisibleText("Iowa");
    driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).sendKeys("89101");
    driver.findElement(By.id("signUpForm:memberDetailContinueBtn")).click();
    Thread.sleep(10000);
    driver.findElement(By.id("signUpForm:ccNumberTxtField")).clear();
    driver.findElement(By.id("signUpForm:ccNumberTxtField")).sendKeys("4111111111111111");
    new Select(driver.findElement(By.name("signUpForm:j_idt288"))).selectByVisibleText("May");
    new Select(driver.findElement(By.name("signUpForm:j_idt291"))).selectByVisibleText("2022");
    driver.findElement(By.id("signUpForm:cvvTxtField")).clear();
    driver.findElement(By.id("signUpForm:cvvTxtField")).sendKeys("112");
    driver.findElement(By.id("signUpForm:msaCheckBox")).click();
    Thread.sleep(500);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(1500);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(5000);
    driver.close();
    }
    
    else
    {
    	System.out.println("Price is not same for I-A5-45-S");
    }
    
//I-A5-90-S
    
    driver = new FirefoxDriver();
    baseUrl = "https://gridstaging.globalrescue.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
    Thread.sleep(1000);
    String Price13= "Cost: $3,990.00" ;
    driver.findElement(By.id("signUpForm:j_idt112")).click();
    Thread.sleep(9000);
    driver.findElement(By.id("signUpForm:j_idt145")).click();
    Thread.sleep(9000);
    
    driver.findElement(By.xpath("//a[@id='signUpForm:j_idt160']/span")).click();
    Thread.sleep(9000);
    String price13a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
    System.out.println("System "+price13a);
    if(Price13.equals(price13a))
    {
    	
    System.out.println("Price is Verified for I-A5-90-S");
    driver.findElement(By.id("signUpForm:emailTxtField")).clear();
    int ran;
    ran = 100 + (int)(Math.random() * ((10000 - 100) + 1));
    driver.findElement(By.id("signUpForm:emailTxtField")).sendKeys("signuptest"+ran+"@test.com");
    driver.findElement(By.id("signUpForm:planSelectionContinueBtn")).click();
    Thread.sleep(1500);
	Thread.sleep(10000);
	driver.findElement(By.id("signUpForm:firstNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:firstNameTxtField")).sendKeys("Test");
    driver.findElement(By.id("signUpForm:middleNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:middleNameTxtField")).sendKeys("t");
    driver.findElement(By.id("signUpForm:lastNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:lastNameTxtField")).sendKeys("QA");   
    driver.findElement(By.id("signUpForm:contactGenderRadioBtn:1")).click();
    driver.findElement(By.id("signUpForm:contactGenderRadioBtn:0")).click();
    driver.findElement(By.cssSelector("div.flag.us")).click();	
	driver.findElement(By.id("signUpForm:mobileNumberInput:mobileNumberInput")).sendKeys("3456543");
    driver.findElement(By.id("signUpForm:birthDateInputDate")).clear();
    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
    driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).clear();
    driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).sendKeys("01/01/2017");
    driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).sendKeys("test");
    driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).sendKeys("las vegas");
    new Select(driver.findElement(By.id("signUpForm:primaryAddressStateDD"))).selectByVisibleText("Iowa");
    driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).sendKeys("89101");
    driver.findElement(By.id("signUpForm:memberDetailContinueBtn")).click();
    Thread.sleep(10000);
    driver.findElement(By.id("signUpForm:ccNumberTxtField")).clear();
    driver.findElement(By.id("signUpForm:ccNumberTxtField")).sendKeys("4111111111111111");
    new Select(driver.findElement(By.name("signUpForm:j_idt288"))).selectByVisibleText("May");
    new Select(driver.findElement(By.name("signUpForm:j_idt291"))).selectByVisibleText("2022");
    driver.findElement(By.id("signUpForm:cvvTxtField")).clear();
    driver.findElement(By.id("signUpForm:cvvTxtField")).sendKeys("112");
    driver.findElement(By.id("signUpForm:msaCheckBox")).click();
    Thread.sleep(500);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(1500);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(5000);
    driver.close();
    }
    
    else
    {
    	System.out.println("Price is not same for I-A5-90-S");
    }
    
//I-A5-180-S
    
    driver = new FirefoxDriver();
    baseUrl = "https://gridstaging.globalrescue.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
    Thread.sleep(1000);
    String Price14= "Cost: $4,840.00" ;
    driver.findElement(By.id("signUpForm:j_idt112")).click();
    Thread.sleep(9000);
    driver.findElement(By.id("signUpForm:j_idt149")).click();
    Thread.sleep(9000);
    driver.findElement(By.xpath("//a[@id='signUpForm:j_idt160']/span")).click();
    Thread.sleep(9000);
    String price14a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
    System.out.println("System "+price14a);
    if(Price14.equals(price14a))
    {
    	
    System.out.println("Price is Verified for I-A5-180-S");
    driver.findElement(By.id("signUpForm:emailTxtField")).clear();
    int ran;
    ran = 100 + (int)(Math.random() * ((10000 - 100) + 1));
    driver.findElement(By.id("signUpForm:emailTxtField")).sendKeys("signuptest"+ran+"@test.com");
    driver.findElement(By.id("signUpForm:planSelectionContinueBtn")).click();
    Thread.sleep(1500);
	Thread.sleep(10000);
	driver.findElement(By.id("signUpForm:firstNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:firstNameTxtField")).sendKeys("Test");
    driver.findElement(By.id("signUpForm:middleNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:middleNameTxtField")).sendKeys("t");
    driver.findElement(By.id("signUpForm:lastNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:lastNameTxtField")).sendKeys("QA");   
    driver.findElement(By.id("signUpForm:contactGenderRadioBtn:1")).click();
    driver.findElement(By.id("signUpForm:contactGenderRadioBtn:0")).click();
    driver.findElement(By.cssSelector("div.flag.us")).click();	
	driver.findElement(By.id("signUpForm:mobileNumberInput:mobileNumberInput")).sendKeys("3456543");
    driver.findElement(By.id("signUpForm:birthDateInputDate")).clear();
    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
    driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).clear();
    driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).sendKeys("01/01/2017");
    driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).sendKeys("test");
    driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).sendKeys("las vegas");
    new Select(driver.findElement(By.id("signUpForm:primaryAddressStateDD"))).selectByVisibleText("Iowa");
    driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).sendKeys("89101");
    driver.findElement(By.id("signUpForm:memberDetailContinueBtn")).click();
    Thread.sleep(10000);
    driver.findElement(By.id("signUpForm:ccNumberTxtField")).clear();
    driver.findElement(By.id("signUpForm:ccNumberTxtField")).sendKeys("4111111111111111");
    new Select(driver.findElement(By.name("signUpForm:j_idt288"))).selectByVisibleText("May");
    new Select(driver.findElement(By.name("signUpForm:j_idt291"))).selectByVisibleText("2022");
    driver.findElement(By.id("signUpForm:cvvTxtField")).clear();
    driver.findElement(By.id("signUpForm:cvvTxtField")).sendKeys("112");
    driver.findElement(By.id("signUpForm:msaCheckBox")).click();
    Thread.sleep(500);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(1500);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(5000);
    driver.close();
    }
    
    else
    {
    	System.out.println("Price is not same for I-A5-180-S");
    }
    
//I-A5-365-S
    
    driver = new FirefoxDriver();
    baseUrl = "https://gridstaging.globalrescue.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
    Thread.sleep(1000);
    String Price21= "Cost: $6,090.00" ;
    driver.findElement(By.id("signUpForm:j_idt112")).click();
    Thread.sleep(9000);
    driver.findElement(By.id("signUpForm:j_idt153")).click();
    Thread.sleep(9000);
    driver.findElement(By.xpath("//a[@id='signUpForm:j_idt160']/span")).click();
    Thread.sleep(9000);
    String price21a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
    System.out.println("System "+price21a);
    if(Price21.equals(price21a))
    {
    System.out.println("Price is Verified for I-A5-365-S");
    driver.findElement(By.id("signUpForm:emailTxtField")).clear();
    int ran;
    ran = 100 + (int)(Math.random() * ((10000 - 100) + 1));
    driver.findElement(By.id("signUpForm:emailTxtField")).sendKeys("signuptest"+ran+"@test.com");
    driver.findElement(By.id("signUpForm:planSelectionContinueBtn")).click();
    Thread.sleep(1500);
	Thread.sleep(10000);
	driver.findElement(By.id("signUpForm:firstNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:firstNameTxtField")).sendKeys("Test");
    driver.findElement(By.id("signUpForm:middleNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:middleNameTxtField")).sendKeys("t");
    driver.findElement(By.id("signUpForm:lastNameTxtField")).clear();
    driver.findElement(By.id("signUpForm:lastNameTxtField")).sendKeys("QA");   
    driver.findElement(By.id("signUpForm:contactGenderRadioBtn:1")).click();
    driver.findElement(By.id("signUpForm:contactGenderRadioBtn:0")).click();
    driver.findElement(By.cssSelector("div.flag.us")).click();	
	driver.findElement(By.id("signUpForm:mobileNumberInput:mobileNumberInput")).sendKeys("3456543");
    driver.findElement(By.id("signUpForm:birthDateInputDate")).clear();
    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
    driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).clear();
    driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).sendKeys("01/01/2017");
    driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).sendKeys("test");
    driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).sendKeys("las vegas");
    new Select(driver.findElement(By.id("signUpForm:primaryAddressStateDD"))).selectByVisibleText("Iowa");
    driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).clear();
    driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).sendKeys("89101");
    driver.findElement(By.id("signUpForm:memberDetailContinueBtn")).click();
    Thread.sleep(10000);
    driver.findElement(By.id("signUpForm:ccNumberTxtField")).clear();
    driver.findElement(By.id("signUpForm:ccNumberTxtField")).sendKeys("4111111111111111");
    new Select(driver.findElement(By.name("signUpForm:j_idt288"))).selectByVisibleText("May");
    new Select(driver.findElement(By.name("signUpForm:j_idt291"))).selectByVisibleText("2022");
    driver.findElement(By.id("signUpForm:cvvTxtField")).clear();
    driver.findElement(By.id("signUpForm:cvvTxtField")).sendKeys("112");
    driver.findElement(By.id("signUpForm:msaCheckBox")).click();
    Thread.sleep(500);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(1500);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
    Thread.sleep(5000);
    driver.close();
    }
    
    else
    {
    	System.out.println("Price is not same for I-A5-365-S");
    }
  

  //I-S7-M
  driver = new FirefoxDriver();
  baseUrl = "https://gridstaging.globalrescue.com/";
  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  driver.get(baseUrl + "/grcom/signup/signup.xhtml");
  Thread.sleep(1000);
  String Price26= "Cost: $119.00" ;
  driver.findElement(By.id("signUpForm:j_idt123")).click();
  Thread.sleep(9000);
  String price26a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
  System.out.println("System "+price26a);

  if(Price26.equals(price26a))
  	
  {
  	
  System.out.println("Price is Verified for I-S7-M");
  driver.findElement(By.id("signUpForm:emailTxtField")).clear();
  int ran;
  ran = 100 + (int)(Math.random() * ((10000 - 100) + 1));
  
  driver.findElement(By.id("signUpForm:emailTxtField")).sendKeys("signuptest"+ran+"@test.com");
  driver.findElement(By.id("signUpForm:planSelectionContinueBtn")).click();
  Thread.sleep(1500);
	Thread.sleep(10000);
	driver.findElement(By.id("signUpForm:firstNameTxtField")).clear();
  driver.findElement(By.id("signUpForm:firstNameTxtField")).sendKeys("Test");
  driver.findElement(By.id("signUpForm:middleNameTxtField")).clear();
  driver.findElement(By.id("signUpForm:middleNameTxtField")).sendKeys("t");
  driver.findElement(By.id("signUpForm:lastNameTxtField")).clear();
  driver.findElement(By.id("signUpForm:lastNameTxtField")).sendKeys("QA");   
  driver.findElement(By.id("signUpForm:contactGenderRadioBtn:1")).click();
  driver.findElement(By.id("signUpForm:contactGenderRadioBtn:0")).click();
  driver.findElement(By.cssSelector("div.flag.us")).click();	
	driver.findElement(By.id("signUpForm:mobileNumberInput:mobileNumberInput")).sendKeys("3456543");
  driver.findElement(By.id("signUpForm:birthDateInputDate")).clear();
  driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
  driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).clear();
  driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).sendKeys("01/01/2017");
  driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).clear();
  driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).sendKeys("test");
  driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).clear();
  driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).sendKeys("las vegas");
  new Select(driver.findElement(By.id("signUpForm:primaryAddressStateDD"))).selectByVisibleText("Iowa");
  driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).clear();
  driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).sendKeys("89101");
  driver.findElement(By.id("signUpForm:memberDetailContinueBtn")).click();
  Thread.sleep(10000);
  driver.findElement(By.id("signUpForm:ccNumberTxtField")).clear();
  driver.findElement(By.id("signUpForm:ccNumberTxtField")).sendKeys("4111111111111111");
  new Select(driver.findElement(By.name("signUpForm:j_idt288"))).selectByVisibleText("May");
  new Select(driver.findElement(By.name("signUpForm:j_idt291"))).selectByVisibleText("2022");
  driver.findElement(By.id("signUpForm:cvvTxtField")).clear();
  driver.findElement(By.id("signUpForm:cvvTxtField")).sendKeys("112");
  driver.findElement(By.id("signUpForm:msaCheckBox")).click();
  Thread.sleep(500);
  driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
  Thread.sleep(1500);
  driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
  Thread.sleep(1000);
  driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
  Thread.sleep(5000);
  driver.close();
  }
  
  else
  {
  	System.out.println("Price is not same for I-S7-M");
  }
  
//I-S14-M
  driver = new FirefoxDriver();
  baseUrl = "https://gridstaging.globalrescue.com/";
  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  driver.get(baseUrl + "/grcom/signup/signup.xhtml");
  Thread.sleep(1000);
  String Price27= "Cost: $159.00" ;
  driver.findElement(By.id("signUpForm:j_idt127")).click();
  Thread.sleep(9000);
  String price27a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
  System.out.println("System "+price27a);

  if(Price27.equals(price27a))
  	
  {
  	
  System.out.println("Price is Verified for I-S14-M");
  driver.findElement(By.id("signUpForm:emailTxtField")).clear();
  int ran;
  ran = 100 + (int)(Math.random() * ((10000 - 100) + 1));
  
  driver.findElement(By.id("signUpForm:emailTxtField")).sendKeys("signuptest"+ran+"@test.com");
  driver.findElement(By.id("signUpForm:planSelectionContinueBtn")).click();
  Thread.sleep(1500);
	Thread.sleep(10000);
	driver.findElement(By.id("signUpForm:firstNameTxtField")).clear();
  driver.findElement(By.id("signUpForm:firstNameTxtField")).sendKeys("Test");
  driver.findElement(By.id("signUpForm:middleNameTxtField")).clear();
  driver.findElement(By.id("signUpForm:middleNameTxtField")).sendKeys("t");
  driver.findElement(By.id("signUpForm:lastNameTxtField")).clear();
  driver.findElement(By.id("signUpForm:lastNameTxtField")).sendKeys("QA");   
  driver.findElement(By.id("signUpForm:contactGenderRadioBtn:1")).click();
  driver.findElement(By.id("signUpForm:contactGenderRadioBtn:0")).click();
  driver.findElement(By.cssSelector("div.flag.us")).click();	
	driver.findElement(By.id("signUpForm:mobileNumberInput:mobileNumberInput")).sendKeys("3456543");
  driver.findElement(By.id("signUpForm:birthDateInputDate")).clear();
  driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
  driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).clear();
  driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).sendKeys("01/01/2017");
  driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).clear();
  driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).sendKeys("test");
  driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).clear();
  driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).sendKeys("las vegas");
  new Select(driver.findElement(By.id("signUpForm:primaryAddressStateDD"))).selectByVisibleText("Iowa");
  driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).clear();
  driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).sendKeys("89101");
  driver.findElement(By.id("signUpForm:memberDetailContinueBtn")).click();
  Thread.sleep(10000);
  driver.findElement(By.id("signUpForm:ccNumberTxtField")).clear();
  driver.findElement(By.id("signUpForm:ccNumberTxtField")).sendKeys("4111111111111111");
  new Select(driver.findElement(By.name("signUpForm:j_idt288"))).selectByVisibleText("May");
  new Select(driver.findElement(By.name("signUpForm:j_idt291"))).selectByVisibleText("2022");
  driver.findElement(By.id("signUpForm:cvvTxtField")).clear();
  driver.findElement(By.id("signUpForm:cvvTxtField")).sendKeys("112");
  driver.findElement(By.id("signUpForm:msaCheckBox")).click();
  Thread.sleep(500);
  driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
  Thread.sleep(1500);
  driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
  Thread.sleep(1000);
  driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
  Thread.sleep(5000);
  driver.close();
  }
  
  else
  {
  	System.out.println("Price is not same for I-S14-M");
  }
  
//I-S30-M
  driver = new FirefoxDriver();
  baseUrl = "https://gridstaging.globalrescue.com/";
  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  driver.get(baseUrl + "/grcom/signup/signup.xhtml");
  Thread.sleep(1000);
  String Price28= "Cost: $229.00" ;
  driver.findElement(By.id("signUpForm:j_idt131")).click();
  Thread.sleep(9000);
  String price28a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
  System.out.println("System "+price28a);

  if(Price28.equals(price28a))
  	
  {
  	
  System.out.println("Price is Verified for I-S30-M");
  driver.findElement(By.id("signUpForm:emailTxtField")).clear();
  int ran;
  ran = 100 + (int)(Math.random() * ((10000 - 100) + 1));
  
  driver.findElement(By.id("signUpForm:emailTxtField")).sendKeys("signuptest"+ran+"@test.com");
  driver.findElement(By.id("signUpForm:planSelectionContinueBtn")).click();
  Thread.sleep(1500);
  Thread.sleep(10000);
  driver.findElement(By.id("signUpForm:firstNameTxtField")).clear();
  driver.findElement(By.id("signUpForm:firstNameTxtField")).sendKeys("Test");
  driver.findElement(By.id("signUpForm:middleNameTxtField")).clear();
  driver.findElement(By.id("signUpForm:middleNameTxtField")).sendKeys("t");
  driver.findElement(By.id("signUpForm:lastNameTxtField")).clear();
  driver.findElement(By.id("signUpForm:lastNameTxtField")).sendKeys("QA");   
  driver.findElement(By.id("signUpForm:contactGenderRadioBtn:1")).click();
  driver.findElement(By.id("signUpForm:contactGenderRadioBtn:0")).click();
  driver.findElement(By.cssSelector("div.flag.us")).click();	
  driver.findElement(By.id("signUpForm:mobileNumberInput:mobileNumberInput")).sendKeys("3456543");
  driver.findElement(By.id("signUpForm:birthDateInputDate")).clear();
  driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
  driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).clear();
  driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).sendKeys("01/01/2017");
  driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).clear();
  driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).sendKeys("test");
  driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).clear();
  driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).sendKeys("las vegas");
  new Select(driver.findElement(By.id("signUpForm:primaryAddressStateDD"))).selectByVisibleText("Iowa");
  driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).clear();
  driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).sendKeys("89101");
  driver.findElement(By.id("signUpForm:memberDetailContinueBtn")).click();
  Thread.sleep(10000);
  driver.findElement(By.id("signUpForm:ccNumberTxtField")).clear();
  driver.findElement(By.id("signUpForm:ccNumberTxtField")).sendKeys("4111111111111111");
  new Select(driver.findElement(By.name("signUpForm:j_idt288"))).selectByVisibleText("May");
  new Select(driver.findElement(By.name("signUpForm:j_idt291"))).selectByVisibleText("2022");
  driver.findElement(By.id("signUpForm:cvvTxtField")).clear();
  driver.findElement(By.id("signUpForm:cvvTxtField")).sendKeys("112");
  driver.findElement(By.id("signUpForm:msaCheckBox")).click();
  Thread.sleep(500);
  driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
  Thread.sleep(1500);
  driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
  Thread.sleep(1000);
  driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
  Thread.sleep(5000);
  driver.close();
  }
  
  else
  {
  	System.out.println("Price is not same for I-S30-M");
  }
  
//I-S7-S
  driver = new FirefoxDriver();
  baseUrl = "https://gridstaging.globalrescue.com/";
  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  driver.get(baseUrl + "/grcom/signup/signup.xhtml");
  Thread.sleep(1000);
  String Price29= "Cost: $225.00" ;
  driver.findElement(By.id("signUpForm:j_idt123")).click();
  Thread.sleep(9000);
  driver.findElement(By.xpath("//a[@id='signUpForm:j_idt160']/span")).click();
  Thread.sleep(9000);
  String price29a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
  System.out.println("System "+price29a);

  if(Price29.equals(price29a))
  	
  {
  	
  System.out.println("Price is Verified for I-S7-S");
  driver.findElement(By.id("signUpForm:emailTxtField")).clear();
  int ran;
  ran = 100 + (int)(Math.random() * ((10000 - 100) + 1));
  
  driver.findElement(By.id("signUpForm:emailTxtField")).sendKeys("signuptest"+ran+"@test.com");
  driver.findElement(By.id("signUpForm:planSelectionContinueBtn")).click();
  Thread.sleep(1500);
	Thread.sleep(10000);
	driver.findElement(By.id("signUpForm:firstNameTxtField")).clear();
  driver.findElement(By.id("signUpForm:firstNameTxtField")).sendKeys("Test");
  driver.findElement(By.id("signUpForm:middleNameTxtField")).clear();
  driver.findElement(By.id("signUpForm:middleNameTxtField")).sendKeys("t");
  driver.findElement(By.id("signUpForm:lastNameTxtField")).clear();
  driver.findElement(By.id("signUpForm:lastNameTxtField")).sendKeys("QA");   
  driver.findElement(By.id("signUpForm:contactGenderRadioBtn:1")).click();
  driver.findElement(By.id("signUpForm:contactGenderRadioBtn:0")).click();
  driver.findElement(By.cssSelector("div.flag.us")).click();	
  driver.findElement(By.id("signUpForm:mobileNumberInput:mobileNumberInput")).sendKeys("3456543");
  driver.findElement(By.id("signUpForm:birthDateInputDate")).clear();
  driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
  driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).clear();
  driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).sendKeys("01/01/2017");
  driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).clear();
  driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).sendKeys("test");
  driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).clear();
  driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).sendKeys("las vegas");
  new Select(driver.findElement(By.id("signUpForm:primaryAddressStateDD"))).selectByVisibleText("Iowa");
  driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).clear();
  driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).sendKeys("89101");
  driver.findElement(By.id("signUpForm:memberDetailContinueBtn")).click();
  Thread.sleep(10000);
  driver.findElement(By.id("signUpForm:ccNumberTxtField")).clear();
  driver.findElement(By.id("signUpForm:ccNumberTxtField")).sendKeys("4111111111111111");
  new Select(driver.findElement(By.name("signUpForm:j_idt288"))).selectByVisibleText("May");
  new Select(driver.findElement(By.name("signUpForm:j_idt291"))).selectByVisibleText("2022");
  driver.findElement(By.id("signUpForm:cvvTxtField")).clear();
  driver.findElement(By.id("signUpForm:cvvTxtField")).sendKeys("112");
  driver.findElement(By.id("signUpForm:msaCheckBox")).click();
  Thread.sleep(500);
  driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
  Thread.sleep(1500);
  driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
  Thread.sleep(1000);
  driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
  Thread.sleep(5000);
  driver.close();
  }
  
  else
  {
  	System.out.println("Price is not same for I-S7-S");
  }
  
  
//I-S14-S
  driver = new FirefoxDriver();
  baseUrl = "https://gridstaging.globalrescue.com/";
  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  driver.get(baseUrl + "/grcom/signup/signup.xhtml");
  Thread.sleep(1000);
  String Price30= "Cost: $315.00" ;
  driver.findElement(By.id("signUpForm:j_idt127")).click();
  Thread.sleep(9000);
  driver.findElement(By.xpath("//a[@id='signUpForm:j_idt160']/span")).click();
  Thread.sleep(9000);
  String price30a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
  System.out.println("System "+price30a);

  if(Price30.equals(price30a))
  	
  {
  	
  System.out.println("Price is Verified for I-S14-S");
  driver.findElement(By.id("signUpForm:emailTxtField")).clear();
  int ran;
  ran = 100 + (int)(Math.random() * ((10000 - 100) + 1));
  
  driver.findElement(By.id("signUpForm:emailTxtField")).sendKeys("signuptest"+ran+"@test.com");
  driver.findElement(By.id("signUpForm:planSelectionContinueBtn")).click();
  Thread.sleep(1500);
	Thread.sleep(10000);
	driver.findElement(By.id("signUpForm:firstNameTxtField")).clear();
  driver.findElement(By.id("signUpForm:firstNameTxtField")).sendKeys("Test");
  driver.findElement(By.id("signUpForm:middleNameTxtField")).clear();
  driver.findElement(By.id("signUpForm:middleNameTxtField")).sendKeys("t");
  driver.findElement(By.id("signUpForm:lastNameTxtField")).clear();
  driver.findElement(By.id("signUpForm:lastNameTxtField")).sendKeys("QA");   
  driver.findElement(By.id("signUpForm:contactGenderRadioBtn:1")).click();
  driver.findElement(By.id("signUpForm:contactGenderRadioBtn:0")).click();
  driver.findElement(By.cssSelector("div.flag.us")).click();	
  driver.findElement(By.id("signUpForm:mobileNumberInput:mobileNumberInput")).sendKeys("3456543");
  driver.findElement(By.id("signUpForm:birthDateInputDate")).clear();
  driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
  driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).clear();
  driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).sendKeys("01/01/2017");
  driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).clear();
  driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).sendKeys("test");
  driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).clear();
  driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).sendKeys("las vegas");
  new Select(driver.findElement(By.id("signUpForm:primaryAddressStateDD"))).selectByVisibleText("Iowa");
  driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).clear();
  driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).sendKeys("89101");
  driver.findElement(By.id("signUpForm:memberDetailContinueBtn")).click();
  Thread.sleep(10000);
  driver.findElement(By.id("signUpForm:ccNumberTxtField")).clear();
  driver.findElement(By.id("signUpForm:ccNumberTxtField")).sendKeys("4111111111111111");
  new Select(driver.findElement(By.name("signUpForm:j_idt288"))).selectByVisibleText("May");
  new Select(driver.findElement(By.name("signUpForm:j_idt291"))).selectByVisibleText("2022");
  driver.findElement(By.id("signUpForm:cvvTxtField")).clear();
  driver.findElement(By.id("signUpForm:cvvTxtField")).sendKeys("112");
  driver.findElement(By.id("signUpForm:msaCheckBox")).click();
  Thread.sleep(500);
  driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
  Thread.sleep(1500);
  driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
  Thread.sleep(1000);
  driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
  Thread.sleep(5000);
  driver.close();
  }
  
  else
  {
  	System.out.println("Price is not same for I-S14-S");
  }
  
//I-S30-S
  driver = new FirefoxDriver();
  baseUrl = "https://gridstaging.globalrescue.com/";
  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  driver.get(baseUrl + "/grcom/signup/signup.xhtml");
  Thread.sleep(1000);
  String Price31= "Cost: $315.00" ;
  driver.findElement(By.id("signUpForm:j_idt131")).click();
  Thread.sleep(9000);
  driver.findElement(By.xpath("//a[@id='signUpForm:j_idt160']/span")).click();
  Thread.sleep(9000);
  String price31a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
  System.out.println("System "+price31a);

  if(Price31.equals(price31a))
  	
  {
  	
  System.out.println("Price is Verified for I-S30-S");
  driver.findElement(By.id("signUpForm:emailTxtField")).clear();
  int ran;
  ran = 100 + (int)(Math.random() * ((10000 - 100) + 1));
  
  driver.findElement(By.id("signUpForm:emailTxtField")).sendKeys("signuptest"+ran+"@test.com");
  driver.findElement(By.id("signUpForm:planSelectionContinueBtn")).click();
  Thread.sleep(1500);
  Thread.sleep(10000);
  driver.findElement(By.id("signUpForm:firstNameTxtField")).clear();
  driver.findElement(By.id("signUpForm:firstNameTxtField")).sendKeys("Test");
  driver.findElement(By.id("signUpForm:middleNameTxtField")).clear();
  driver.findElement(By.id("signUpForm:middleNameTxtField")).sendKeys("t");
  driver.findElement(By.id("signUpForm:lastNameTxtField")).clear();
  driver.findElement(By.id("signUpForm:lastNameTxtField")).sendKeys("QA");   
  driver.findElement(By.id("signUpForm:contactGenderRadioBtn:1")).click();
  driver.findElement(By.id("signUpForm:contactGenderRadioBtn:0")).click();
  driver.findElement(By.cssSelector("div.flag.us")).click();	
  driver.findElement(By.id("signUpForm:mobileNumberInput:mobileNumberInput")).sendKeys("3456543");
  driver.findElement(By.id("signUpForm:birthDateInputDate")).clear();
  driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
  driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).clear();
  driver.findElement(By.id("signUpForm:membershipStartDateInputDate")).sendKeys("01/01/2017");
  driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).clear();
  driver.findElement(By.id("signUpForm:primaryAddressLine1TxtField")).sendKeys("test");
  driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).clear();
  driver.findElement(By.id("signUpForm:primaryAddressCityTxtField")).sendKeys("las vegas");
  new Select(driver.findElement(By.id("signUpForm:primaryAddressStateDD"))).selectByVisibleText("Iowa");
  driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).clear();
  driver.findElement(By.id("signUpForm:primaryAddressZipTxtField")).sendKeys("89101");
  driver.findElement(By.id("signUpForm:memberDetailContinueBtn")).click();
  Thread.sleep(10000);
  driver.findElement(By.id("signUpForm:ccNumberTxtField")).clear();
  driver.findElement(By.id("signUpForm:ccNumberTxtField")).sendKeys("4111111111111111");
  new Select(driver.findElement(By.name("signUpForm:j_idt288"))).selectByVisibleText("May");
  new Select(driver.findElement(By.name("signUpForm:j_idt291"))).selectByVisibleText("2022");
  driver.findElement(By.id("signUpForm:cvvTxtField")).clear();
  driver.findElement(By.id("signUpForm:cvvTxtField")).sendKeys("112");
  driver.findElement(By.id("signUpForm:msaCheckBox")).click();
  Thread.sleep(500);
  driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
  Thread.sleep(1500);
  driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
  Thread.sleep(1000);
  driver.findElement(By.id("signUpForm:membershipBuyBtn")).click();
  Thread.sleep(5000);
  driver.close();
  }
  
  else
  {
  	System.out.println("Price is not same for I-S30-S");
  }
  
  
  /*public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }*/

  System.out.println("***Thank You***");
}
}
