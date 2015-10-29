package grcom;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.Select;

public class student {

	
	final static FirefoxProfile profile = new FirefoxProfile(new File("C:/Users/awafa/AppData/Roaming/Mozilla/Firefox/Profiles"));

	
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
  public void studentt() throws Exception {
   driver.get(baseUrl + "/grcom/signup/signup.xhtml");
   
    //S-A1-45-M
    String Price1= "Cost: $259.00" ;
    driver.findElement(By.id("signUpForm:j_idt79")).click();
    Thread.sleep(12000);
    String price= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
    System.out.println("System "+price);
  
    if(Price1.equals(price))
    	
    {
    System.out.println("Price is Verified for S-A1-45-M");
    driver.findElement(By.id("signUpForm:emailTxtField")).clear();
    int ran;
     ran = 1000 + (int)(Math.random() * ((100000 - 1000) + 1));
    
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
    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1999");
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
    System.out.println("S-A1-45-M Created Succesfully!");
    driver.close();
    }
    
    else
    {
    	System.out.println("Price is not same for S-A1-45-M");
    }
    
//S-A1-90-M
    
    driver = new FirefoxDriver();
    baseUrl = "https://gridstaging.globalrescue.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
    Thread.sleep(1000);
    String Price2 = "Cost: $359.00";
    driver.findElement(By.id("signUpForm:j_idt79")).click();
    Thread.sleep(7000);
    driver.findElement(By.id("signUpForm:j_idt145")).click();
    Thread.sleep(6000);
   
    String price2a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
    System.out.println("System "+price2a);
    
    if(Price2.equals(price2a))
    {
    	System.out.println("Price is Verified for S-A1-90-M");
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
    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1999");
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
    System.out.println("S-A1-45-M Created Succesfully!");
    driver.close();
    }
   
    else
    {
    System.out.println("Price is not same for S-A1-90-M");
    }
    
//S-A1-180-M
    
    driver = new FirefoxDriver();
    baseUrl = "https://gridstaging.globalrescue.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
    Thread.sleep(1000);
    String Price3="Cost: $444.00";
    driver.findElement(By.id("signUpForm:j_idt79")).click();
    Thread.sleep(8000);
    driver.findElement(By.xpath("//a[@id='signUpForm:j_idt149']/b")).click();
    Thread.sleep(8000);
    
    String price3a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
    System.out.println("System "+price3a);
    
    if(Price3.equals(price3a))
   
    {
    System.out.println("Price is Verified for S-A1-180-M");
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
    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1999");
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
    System.out.println("S-A1-180-M Created Succesfully!");
    driver.close();
    }
    else
    {
    	System.out.println("Price is not same for S-A1-180-M");
    }
//S-A1-365-M
    
    driver = new FirefoxDriver();
    baseUrl = "https://gridstaging.globalrescue.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
    Thread.sleep(1000);
    String Price4="Cost: $594.00";
    driver.findElement(By.id("signUpForm:j_idt79")).click();
    Thread.sleep(8000);
    driver.findElement(By.id("signUpForm:j_idt153")).click();
    //driver.findElement(By.xpath("//a[@id='signUpForm:j_idt153']/b")).click();
    Thread.sleep(8000);
    
    String price4a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
    System.out.println("System "+price4a);
    
    if(Price4.equals(price4a))
   
    {
    System.out.println("Price is Verified for S-A1-365-M");
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
    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1999");
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
    System.out.println("S-A1-365-M Created Succesfully!");
    driver.close();
    }
    else
    {
    	System.out.println("Price is not same for S-A1-365-M");
    }
   
//S-A2-45-M
    
    driver = new FirefoxDriver();
    baseUrl = "https://gridstaging.globalrescue.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
    Thread.sleep(1000);
    String Price5="Cost: $498.00";
    driver.findElement(By.id("signUpForm:j_idt79")).click();
    Thread.sleep(8000);
    driver.findElement(By.id("signUpForm:j_idt100")).click();
    Thread.sleep(8000);
  //  driver.findElement(By.xpath("//a[@id='signUpForm:j_idt153']/b")).click();
   // Thread.sleep(6000);
    
    String price5a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
    System.out.println("System "+price5a);
    
    if(Price5.equals(price5a))
   
    {
    System.out.println("Price is Verified for S-A2-45-M");
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
    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1999");
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
    System.out.println("S-A2-45-M Created Succesfully!");
    driver.close();
    }
    else
    {
    	System.out.println("Price is not same for S-A2-45-M");
    }
//S-A2-90-M
    
    driver = new FirefoxDriver();
    baseUrl = "https://gridstaging.globalrescue.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
    Thread.sleep(1000);
    String Price6="Cost: $698.00";
    driver.findElement(By.id("signUpForm:j_idt79")).click();
    Thread.sleep(8000);
    driver.findElement(By.id("signUpForm:j_idt100")).click();
    Thread.sleep(8000);
    driver.findElement(By.xpath("//a[@id='signUpForm:j_idt145']/b")).click();
    Thread.sleep(8000);
    
    String price6a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
    System.out.println("System "+price6a);
    
    if(Price6.equals(price6a))
   
    {
    System.out.println("Price is Verified for S-A2-90-M");
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
    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1999");
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
    System.out.println("S-A2-90-M Created Succesfully!");
    driver.close();
    }
    else
    {
    	System.out.println("Price is not same for S-A2-90-M");
    }
//S-A2-180-M
    
    driver = new FirefoxDriver();
    baseUrl = "https://gridstaging.globalrescue.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
    Thread.sleep(1000);
    String Price7="Cost: $868.00";
    driver.findElement(By.id("signUpForm:j_idt79")).click();
    Thread.sleep(8000);
    driver.findElement(By.id("signUpForm:j_idt100")).click();
    Thread.sleep(8000);
    driver.findElement(By.xpath("//a[@id='signUpForm:j_idt149']/b")).click();
    Thread.sleep(8000);
    
    String price7a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
    System.out.println("System "+price7a);
    
    if(Price7.equals(price7a))
   
    {
    System.out.println("Price is Verified for S-A2-180-M");
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
    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1999");
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
    System.out.println("S-A2-180-M Created Succesfully!");
    driver.close();
    }
    else
    {
    	System.out.println("Price is not same for S-A2-180-M");
    }

//S-A3-45-M
    
    driver = new FirefoxDriver();
    baseUrl = "https://gridstaging.globalrescue.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
    Thread.sleep(1000);
    String Price8="Cost: $727.00";
    driver.findElement(By.id("signUpForm:j_idt79")).click();
    Thread.sleep(8000);
    driver.findElement(By.id("signUpForm:j_idt104")).click();
    Thread.sleep(8000);
    //driver.findElement(By.xpath("//a[@id='signUpForm:j_idt149']/b")).click();
    //Thread.sleep(6000);
    
    String price8a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
    System.out.println("System "+price8a);
    
    if(Price8.equals(price8a))
   
    {
    System.out.println("Price is Verified for S-A3-45-M");
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
    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1999");
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
    System.out.println("S-A3-45-M Created Succesfully!");
    driver.close();
    }
    else
    {
    	System.out.println("Price is not same for S-A3-45-M");
    }

//S-A4-45-M
    
    driver = new FirefoxDriver();
    baseUrl = "https://gridstaging.globalrescue.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
    Thread.sleep(1000);
    String Price9="Cost: $946.00";
    driver.findElement(By.id("signUpForm:j_idt79")).click();
    Thread.sleep(8000);
    driver.findElement(By.id("signUpForm:j_idt108")).click();
    Thread.sleep(8000);
    //driver.findElement(By.xpath("//a[@id='signUpForm:j_idt145']/b")).click();
    //Thread.sleep(6000);
    
    String price9a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
    System.out.println("System "+price9a);
    
    if(Price9.equals(price9a))
   
    {
    System.out.println("Price is Verified for S-A4-45-M");
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
    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1999");
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
    System.out.println("S-A4-45-M Created Succesfully!");
    driver.close();
    }
    else
    {
    	System.out.println("Price is not same for S-A4-45-M");
    }

//S-A4-365-M
    
    driver = new FirefoxDriver();
    baseUrl = "https://gridstaging.globalrescue.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
    Thread.sleep(1000);
    String Price10="Cost: $2,286.00";
    driver.findElement(By.id("signUpForm:j_idt79")).click();
    Thread.sleep(8000);
    driver.findElement(By.id("signUpForm:j_idt108")).click();
    Thread.sleep(8000);
    driver.findElement(By.xpath("//a[@id='signUpForm:j_idt153']/b")).click();
    Thread.sleep(8000);
    
    String price10a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
    System.out.println("System "+price10a);
    
    if(Price10.equals(price10a))
   
    {
    System.out.println("Price is Verified for S-A4-365-M");
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
    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1999");
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
    System.out.println("S-A4-365-M Created Succesfully!");
    driver.close();
    }
    else
    {
    	System.out.println("Price is not same for S-A4-365-M");
    }

//S-A5-365-M
    
    driver = new FirefoxDriver();
    baseUrl = "https://gridstaging.globalrescue.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
    Thread.sleep(1000);
    String Price11="Cost: $2,820.00";
    driver.findElement(By.id("signUpForm:j_idt79")).click();
    Thread.sleep(8000);
    driver.findElement(By.id("signUpForm:j_idt112")).click();
    Thread.sleep(8000);
    driver.findElement(By.xpath("//a[@id='signUpForm:j_idt153']/b")).click();
    Thread.sleep(8000);
    
    String price11a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
    System.out.println("System "+price11a);
    
    if(Price11.equals(price11a))
   
    {
    System.out.println("Price is Verified for S-A5-365-M");
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
    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/2007");
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
    	System.out.println("Price is not same for S-A5-365-M");
    }

    //S-A1-90-S
    driver = new FirefoxDriver();
    baseUrl = "https://gridstaging.globalrescue.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
    Thread.sleep(1000);
    String Price12= "Cost: $715.00" ;
    driver.findElement(By.id("signUpForm:j_idt79")).click();
    Thread.sleep(8000);
    driver.findElement(By.id("signUpForm:j_idt145")).click();
    Thread.sleep(8000);
    driver.findElement(By.xpath("//a[@id='signUpForm:j_idt160']/span")).click();
    Thread.sleep(8000);
    String price12a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
    System.out.println("System "+price12a);
    if(Price12.equals(price12a))
    	
    {
    System.out.println("Price is Verified for S-A1-90-S");
    driver.findElement(By.id("signUpForm:emailTxtField")).clear();
    int ran;
     ran = 1000 + (int)(Math.random() * ((100000 - 1000) + 1));
    
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
    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1999");
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
    System.out.println("S-A1-90-S Created Succesfully!");
    driver.close();
    }
    
    else
    {
    	System.out.println("Price is not same for S-A1-90-S");
    }
    
  //S-A1-180-S
    driver = new FirefoxDriver();
    baseUrl = "https://gridstaging.globalrescue.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
    Thread.sleep(1000);
    String Price13= "Cost: $885.00" ;
    driver.findElement(By.id("signUpForm:j_idt79")).click();
    Thread.sleep(8000);
    driver.findElement(By.id("signUpForm:j_idt149")).click();
    Thread.sleep(8000);
    driver.findElement(By.xpath("//a[@id='signUpForm:j_idt160']/span")).click();
    Thread.sleep(8000);
    String price13a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
    System.out.println("System "+price13a);
    if(Price13.equals(price13a))
    	
    {
    System.out.println("Price is Verified for S-A1-180-S");
    driver.findElement(By.id("signUpForm:emailTxtField")).clear();
    int ran;
     ran = 1000 + (int)(Math.random() * ((100000 - 1000) + 1));
    
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
    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1999");
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
    System.out.println("S-A1-180-S Created Succesfully!");
    driver.close();
    }
    
    else
    {
    	System.out.println("Price is not same for S-A1-180-S");
    }
    
  //S-A2-45-S
    driver = new FirefoxDriver();
    baseUrl = "https://gridstaging.globalrescue.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
    Thread.sleep(1000);
    String Price14= "Cost: $995.00" ;
    driver.findElement(By.id("signUpForm:j_idt79")).click();
    Thread.sleep(8000);
    driver.findElement(By.id("signUpForm:j_idt100")).click();
    Thread.sleep(8000);
    driver.findElement(By.xpath("//a[@id='signUpForm:j_idt160']/span")).click();
    Thread.sleep(8000);
    String price14a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
    System.out.println("System "+price14a);
    if(Price14.equals(price14a))
    	
    {
    System.out.println("Price is Verified for S-A2-45-S");
    driver.findElement(By.id("signUpForm:emailTxtField")).clear();
    int ran;
     ran = 1000 + (int)(Math.random() * ((100000 - 1000) + 1));
    
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
    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1999");
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
    System.out.println("S-A2-45-S Created Succesfully!");
    driver.close();
    }
    
    else
    {
    	System.out.println("Price is not same for S-A2-45-S");
    }
    
  //S-A2-365-S
    driver = new FirefoxDriver();
    baseUrl = "https://gridstaging.globalrescue.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
    Thread.sleep(1000);
    String Price15= "Cost: $2,335.00" ;
    driver.findElement(By.id("signUpForm:j_idt79")).click();
    Thread.sleep(8000);
    driver.findElement(By.id("signUpForm:j_idt100")).click();
    Thread.sleep(8000);
    driver.findElement(By.id("signUpForm:j_idt153")).click();
    Thread.sleep(8000);
    
    driver.findElement(By.xpath("//a[@id='signUpForm:j_idt160']/span")).click();
    Thread.sleep(7000);
    String price15a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
    System.out.println("System "+price15a);
    if(Price15.equals(price15a))
    	
    {
    System.out.println("Price is Verified for S-A2-365-S");
    driver.findElement(By.id("signUpForm:emailTxtField")).clear();
    int ran;
     ran = 1000 + (int)(Math.random() * ((100000 - 1000) + 1));
    
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
    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1999");
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
    System.out.println("S-A2-365-S Created Succesfully!");
    driver.close();
    }
    
    else
    {
    	System.out.println("Price is not same for S-A2-365-S");
    }
    
    //S-A3-180-S
    driver = new FirefoxDriver();
    baseUrl = "https://gridstaging.globalrescue.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
    Thread.sleep(1000);
    String Price16= "Cost: $2,560.00" ;
    driver.findElement(By.id("signUpForm:j_idt79")).click();
    Thread.sleep(8000);
    driver.findElement(By.id("signUpForm:j_idt104")).click();
    Thread.sleep(8000);
    driver.findElement(By.id("signUpForm:j_idt149")).click();
    Thread.sleep(8000);
    driver.findElement(By.xpath("//a[@id='signUpForm:j_idt160']/span")).click();
    Thread.sleep(8000);
    String price16a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
    System.out.println("System "+price16a);
    if(Price16.equals(price16a))
    	
    {
    System.out.println("Price is Verified for S-A3-180-S");
    driver.findElement(By.id("signUpForm:emailTxtField")).clear();
    int ran;
     ran = 1000 + (int)(Math.random() * ((100000 - 1000) + 1));
    
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
    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1999");
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
    System.out.println("S-A3-180-S Created Succesfully!");
    driver.close();
    }
    
    else
    {
    	System.out.println("Price is not same for S-A3-180-S");
    }
    
    //S-A3-365-S
    driver = new FirefoxDriver();
    baseUrl = "https://gridstaging.globalrescue.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
    Thread.sleep(1000);
    String Price17= "Cost: $3,460.00" ;
    driver.findElement(By.id("signUpForm:j_idt79")).click();
    Thread.sleep(8000);
    driver.findElement(By.id("signUpForm:j_idt104")).click();
    Thread.sleep(8000);
    driver.findElement(By.id("signUpForm:j_idt153")).click();
    Thread.sleep(8000);
    driver.findElement(By.xpath("//a[@id='signUpForm:j_idt160']/span")).click();
    Thread.sleep(8000);
    String price17a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
    System.out.println("System "+price17a);
    if(Price17.equals(price17a))
    	
    {
    System.out.println("Price is Verified for S-A3-365-S");
    driver.findElement(By.id("signUpForm:emailTxtField")).clear();
    int ran;
     ran = 1000 + (int)(Math.random() * ((100000 - 1000) + 1));
    
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
    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1999");
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
    System.out.println("S-A3-365-S Created Succesfully!");
    driver.close();
    }
    
    else
    {
    	System.out.println("Price is not same for S-A3-365-S");
    }
    
  //S-A4-90-S
    driver = new FirefoxDriver();
    baseUrl = "https://gridstaging.globalrescue.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
    Thread.sleep(1000);
    String Price18= "Cost: $2,690.00" ;
    driver.findElement(By.id("signUpForm:j_idt79")).click();
    Thread.sleep(8000);
    driver.findElement(By.id("signUpForm:j_idt108")).click();
    Thread.sleep(8000);
    driver.findElement(By.id("signUpForm:j_idt145")).click();
    Thread.sleep(8000);
    driver.findElement(By.xpath("//a[@id='signUpForm:j_idt160']/span")).click();
    Thread.sleep(8000);
    String price18a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
    System.out.println("System "+price18a);
    if(Price18.equals(price18a))
    	
    {
    System.out.println("Price is Verified for S-A4-90-S");
    driver.findElement(By.id("signUpForm:emailTxtField")).clear();
    int ran;
     ran = 1000 + (int)(Math.random() * ((100000 - 1000) + 1));
    
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
    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1999");
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
    	System.out.println("Price is not same for S-A4-90-S");
    }
    
  //S-A4-180-S
    driver = new FirefoxDriver();
    baseUrl = "https://gridstaging.globalrescue.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
    Thread.sleep(1000);
    String Price19= "Cost: $3,370.00" ;
    driver.findElement(By.id("signUpForm:j_idt79")).click();
    Thread.sleep(8000);
    driver.findElement(By.id("signUpForm:j_idt108")).click();
    Thread.sleep(8000);
    driver.findElement(By.id("signUpForm:j_idt149")).click();
    Thread.sleep(8000);
    driver.findElement(By.xpath("//a[@id='signUpForm:j_idt160']/span")).click();
    Thread.sleep(7000);
    String price19a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
    System.out.println("System "+price19a);
    if(Price19.equals(price19a))
    	
    {
    System.out.println("Price is Verified for S-A4-180-S");
    driver.findElement(By.id("signUpForm:emailTxtField")).clear();
    int ran;
     ran = 1000 + (int)(Math.random() * ((100000 - 1000) + 1));
    
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
    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1999");
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
    	System.out.println("Price is not same for S-A4-180-S");
    }
  
  //S-A4-365-S
    driver = new FirefoxDriver();
    baseUrl = "https://gridstaging.globalrescue.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
    Thread.sleep(1000);
    String Price20= "Cost: $4,570.00" ;
    driver.findElement(By.id("signUpForm:j_idt79")).click();
    Thread.sleep(8000);
    driver.findElement(By.id("signUpForm:j_idt108")).click();
    Thread.sleep(8000);
    driver.findElement(By.id("signUpForm:j_idt153")).click();
    Thread.sleep(8000);
    driver.findElement(By.xpath("//a[@id='signUpForm:j_idt160']/span")).click();
    Thread.sleep(8000);
    String price20a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
    System.out.println("System "+price20a);
    if(Price20.equals(price20a))
    	
    {
    System.out.println("Price is Verified for S-A4-365-S");
    driver.findElement(By.id("signUpForm:emailTxtField")).clear();
    int ran;
     ran = 1000 + (int)(Math.random() * ((100000 - 1000) + 1));
    
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
    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1999");
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
    	System.out.println("Price is not same for S-A4-365-S");
    }
    //S-A5-45-S
    driver = new FirefoxDriver();
    baseUrl = "https://gridstaging.globalrescue.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
    Thread.sleep(1000);
    String Price21= "Cost: $2,290.00" ;
    driver.findElement(By.id("signUpForm:j_idt79")).click();
    Thread.sleep(8000);
    driver.findElement(By.id("signUpForm:j_idt112")).click();
    Thread.sleep(8000);
   // driver.findElement(By.id("signUpForm:j_idt153")).click();
    //Thread.sleep(8000);
    driver.findElement(By.xpath("//a[@id='signUpForm:j_idt160']/span")).click();
    Thread.sleep(8000);
    String price21a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
    System.out.println("System "+price21a);
    if(Price21.equals(price21a))
    	
    {
    System.out.println("Price is Verified for S-A5-45-S");
    driver.findElement(By.id("signUpForm:emailTxtField")).clear();
    int ran;
     ran = 1000 + (int)(Math.random() * ((100000 - 1000) + 1));
    
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
    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1999");
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
    System.out.println("S-A5-45-S Created Succesfully!");
    driver.close();
    }
    
    else
    {
    	System.out.println("Price is not same for S-A5-45-S");
    }
  
  //S-A5-90-S
    driver = new FirefoxDriver();
    baseUrl = "https://gridstaging.globalrescue.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
    Thread.sleep(1000);
    String Price22= "Cost: $3,290.00" ;
    driver.findElement(By.id("signUpForm:j_idt79")).click();
    Thread.sleep(8000);
    driver.findElement(By.id("signUpForm:j_idt112")).click();
    Thread.sleep(8000);
    driver.findElement(By.id("signUpForm:j_idt145")).click();
   Thread.sleep(8000);
    driver.findElement(By.xpath("//a[@id='signUpForm:j_idt160']/span")).click();
    Thread.sleep(8000);
    String price22a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
    System.out.println("System "+price22a);
    if(Price22.equals(price22a))
    	
    {
    System.out.println("Price is Verified for S-A5-90-S");
    driver.findElement(By.id("signUpForm:emailTxtField")).clear();
    int ran;
     ran = 1000 + (int)(Math.random() * ((100000 - 1000) + 1));
    
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
    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1999");
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
    System.out.println("S-A5-90-S Created Succesfully!");
    driver.close();
    }
    
    else
    {
    	System.out.println("Price is not same for S-A5-90-S");
    }
    //S-A5-180-S
    driver = new FirefoxDriver();
    baseUrl = "https://gridstaging.globalrescue.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
    Thread.sleep(1000);
    String Price23= "Cost: $4,140.00" ;
    driver.findElement(By.id("signUpForm:j_idt79")).click();
    Thread.sleep(8000);
    driver.findElement(By.id("signUpForm:j_idt112")).click();
    Thread.sleep(8000);
    driver.findElement(By.id("signUpForm:j_idt149")).click();
   Thread.sleep(8000);
    driver.findElement(By.xpath("//a[@id='signUpForm:j_idt160']/span")).click();
    Thread.sleep(8000);
    String price23a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
    System.out.println("System "+price23a);
    if(Price23.equals(price23a))
    	
    {
    System.out.println("Price is Verified for S-A5-180-S");
    driver.findElement(By.id("signUpForm:emailTxtField")).clear();
    int ran;
     ran = 1000 + (int)(Math.random() * ((100000 - 1000) + 1));
    
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
    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1999");
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
    System.out.println("S-A5-180-S Created Succesfully!");
    driver.close();
    }
    
    else
    {
    	System.out.println("Price is not same for S-A5-180-S");
    }
    
    //S-A5-365-S
    driver = new FirefoxDriver();
    baseUrl = "https://gridstaging.globalrescue.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
    Thread.sleep(1000);
    String Price24= "Cost: $5,640.00" ;
    driver.findElement(By.id("signUpForm:j_idt79")).click();
    Thread.sleep(8000);
    driver.findElement(By.id("signUpForm:j_idt112")).click();
    Thread.sleep(8000);
    driver.findElement(By.id("signUpForm:j_idt153")).click();
   Thread.sleep(8000);
    driver.findElement(By.xpath("//a[@id='signUpForm:j_idt160']/span")).click();
    Thread.sleep(7000);
    String price24a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
    System.out.println("System "+price24a);
    if(Price24.equals(price24a))
    	
    {
    System.out.println("Price is Verified for S-A5-365-S");
    driver.findElement(By.id("signUpForm:emailTxtField")).clear();
    int ran;
     ran = 1000 + (int)(Math.random() * ((100000 - 1000) + 1));
    
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
    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/2007");
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
    System.out.println("S-A5-365-S Created Succesfully!");
    driver.close();
    }
    
    else
    {
    	System.out.println("Price is not same for S-A5-365-S");
    }
    
    System.out.println("***Thank You***");
  }
  
}





