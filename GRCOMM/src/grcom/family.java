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

public class family {
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
	  public void familyy() throws Exception {
	   driver.get(baseUrl + "/grcom/signup/signup.xhtml");
	   
	    //F-A1-45-M
	    String Price1= "Cost: $579.00" ;
	    driver.findElement(By.id("signUpForm:j_idt77")).click();
	    Thread.sleep(12000);
	    String price= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
	    System.out.println("System "+price);
	  
	    if(Price1.equals(price))
	    	
	    {
	    System.out.println("Price is Verified for F-A1-45-M");
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
		driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
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
	    System.out.println("F-A1-45-M Created Succesfully!");
	    driver.close();
	    }
	    
	    else
	    {
	    	System.out.println("Price is not same for F-A1-45-M");
	    }
	    
	    //F-A1-90-M
	    driver = new FirefoxDriver();
	    baseUrl = "https://gridstaging.globalrescue.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
	    Thread.sleep(1000);
	    String Price2= "Cost: $729.00" ;
	    driver.findElement(By.id("signUpForm:j_idt77")).click();
	    Thread.sleep(12000);
	    driver.findElement(By.id("signUpForm:j_idt145")).click();
	    Thread.sleep(8000);
	    String price2a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
	    System.out.println("System "+price2a);
	  
	    if(Price2.equals(price2a))
	    	
	    {
	    System.out.println("Price is Verified for F-A1-90-M");
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
		driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
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
	    System.out.println("F-A1-90-M Created Succesfully!");
	    driver.close();
	    }
	    
	    else
	    {
	    	System.out.println("Price is not same for F-A1-90-M");
	    }
	
	  //F-A1-180-M
	    driver = new FirefoxDriver();
	    baseUrl = "https://gridstaging.globalrescue.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
	    Thread.sleep(1000);
	    String Price3= "Cost: $854.00" ;
	    driver.findElement(By.id("signUpForm:j_idt77")).click();
	    Thread.sleep(12000);
	    driver.findElement(By.id("signUpForm:j_idt149")).click();
	    Thread.sleep(8000);
	    String price3a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
	    System.out.println("System "+price3a);
	  
	    if(Price3.equals(price3a))
	    	
	    {
	    System.out.println("Price is Verified for F-A1-180-M");
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
		driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
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
	    System.out.println("F-A1-180-M Created Succesfully!");
	    driver.close();
	    
	    }
	    
	    else
	    {
	    	System.out.println("Price is not same for F-A1-180-M");
	    }
	
	 
	    //F-A3-90-M
	    driver = new FirefoxDriver();
	    baseUrl = "https://gridstaging.globalrescue.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
	    Thread.sleep(1000);
	    String Price5= "Cost: $2,137.00" ;
	    driver.findElement(By.id("signUpForm:j_idt77")).click();
	    Thread.sleep(12000);
	    driver.findElement(By.id("signUpForm:j_idt104")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.id("signUpForm:j_idt145")).click();
	    Thread.sleep(8000);
	    String price5a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
	    System.out.println("System "+price5a);
	  
	    if(Price5.equals(price5a))
	    	
	    {
	    System.out.println("Price is Verified for F-A3-90-M");
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
		driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
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
	    System.out.println("F-A3-90-M Created Succesfully!");
	    driver.close();
	    }
	    
	    else
	    {
	    	System.out.println("Price is not same for F-A3-90-M");
	    }
	
	    //F-A3-180-M
	    driver = new FirefoxDriver();
	    baseUrl = "https://gridstaging.globalrescue.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
	    Thread.sleep(1000);
	    String Price6= "Cost: $2,512.00" ;
	    driver.findElement(By.id("signUpForm:j_idt77")).click();
	    Thread.sleep(12000);
	    driver.findElement(By.id("signUpForm:j_idt104")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.id("signUpForm:j_idt149")).click();
	    Thread.sleep(8000);
	    String price6a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
	    System.out.println("System "+price6a);
	  
	    if(Price6.equals(price6a))
	    	
	    {
	    System.out.println("Price is Verified for F-A3-180-M");
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
		driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
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
	    System.out.println("F-A3-180-M Created Succesfully!");
	    driver.close();
	    }
	    
	    else
	    {
	    	System.out.println("Price is not same for F-A3-180-M");
	    }
	
	    //F-A3-365-M
	    driver = new FirefoxDriver();
	    baseUrl = "https://gridstaging.globalrescue.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
	    Thread.sleep(1000);
	    String Price7= "Cost: $3,037.00" ;
	    driver.findElement(By.id("signUpForm:j_idt77")).click();
	    Thread.sleep(12000);
	    driver.findElement(By.id("signUpForm:j_idt104")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.id("signUpForm:j_idt153")).click();
	    Thread.sleep(8000);
	    String price7a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
	    System.out.println("System "+price7a);
	  
	    if(Price7.equals(price7a))
	    	
	    {
	    System.out.println("Price is Verified for F-A3-365-M");
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
		driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
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
	    System.out.println("F-A3-365-M Created Succesfully!");
	    driver.close();
	    }
	    
	    else
	    {
	    	System.out.println("Price is not same for F-A3-365-M");
	    }
	  
	    //F-A4-45-M
	    driver = new FirefoxDriver();
	    baseUrl = "https://gridstaging.globalrescue.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
	    Thread.sleep(1000);
	    String Price8= "Cost: $2,226.00" ;
	    driver.findElement(By.id("signUpForm:j_idt77")).click();
	    Thread.sleep(12000);
	    driver.findElement(By.id("signUpForm:j_idt108")).click();
	    Thread.sleep(8000);
	    //driver.findElement(By.id("signUpForm:j_idt153")).click();
	   // Thread.sleep(8000);
	    String price8a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
	    System.out.println("System "+price8a);
	  
	    if(Price8.equals(price8a))
	    	
	    {
	    System.out.println("Price is Verified for F-A4-45-M");
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
		driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
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
	    System.out.println("F-A4-45-M Created Succesfully!");
	    driver.close();
	    }
	    
	    else
	    {
	    	System.out.println("Price is not same for F-A4-45-M");
	    }
	  
	  //F-A4-90-M
	    driver = new FirefoxDriver();
	    baseUrl = "https://gridstaging.globalrescue.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
	    Thread.sleep(1000);
	    String Price9= "Cost: $2,826.00" ;
	    driver.findElement(By.id("signUpForm:j_idt77")).click();
	    Thread.sleep(12000);
	    driver.findElement(By.id("signUpForm:j_idt108")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.id("signUpForm:j_idt145")).click();
	    Thread.sleep(8000);
	    String price9a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
	    System.out.println("System "+price9a);
	  
	    if(Price9.equals(price9a))
	    	
	    {
	    System.out.println("Price is Verified for F-A4-90-M");
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
		driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
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
	    System.out.println("F-A4-90-M Created Succesfully!");
	    driver.close();
	    }
	    
	    else
	    {
	    	System.out.println("Price is not same for F-A4-90-M");
	    }
	    
	    //F-A4-365-M
	    driver = new FirefoxDriver();
	    baseUrl = "https://gridstaging.globalrescue.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
	    Thread.sleep(1000);
	    String Price10= "Cost: $4,026.00" ;
	    driver.findElement(By.id("signUpForm:j_idt77")).click();
	    Thread.sleep(12000);
	    driver.findElement(By.id("signUpForm:j_idt108")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.id("signUpForm:j_idt153")).click();
	    Thread.sleep(8000);
	    String price10a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
	    System.out.println("System "+price10a);
	  
	    if(Price10.equals(price10a))
	    	
	    {
	    System.out.println("Price is Verified for F-A4-365-M");
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
		driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
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
	    System.out.println("F-A4-365-M Created Succesfully!");
	    driver.close();
	    }
	    
	    else
	    {
	    	System.out.println("Price is not same for F-A4-365-M");
	    }
	  
	  //F-A5-45-M
	    driver = new FirefoxDriver();
	    baseUrl = "https://gridstaging.globalrescue.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
	    Thread.sleep(1000);
	    String Price11= "Cost: $2,745.00" ;
	    driver.findElement(By.id("signUpForm:j_idt77")).click();
	    Thread.sleep(12000);
	    driver.findElement(By.id("signUpForm:j_idt112")).click();
	    Thread.sleep(8000);
	   // driver.findElement(By.id("signUpForm:j_idt153")).click();
	    //Thread.sleep(8000);
	    String price11a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
	    System.out.println("System "+price11a);
	  
	    if(Price11.equals(price11a))
	    	
	    {
	    System.out.println("Price is Verified for F-A5-45-M");
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
	    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
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
	    System.out.println("F-A5-45-M Created Succesfully!");
	    driver.close();
	    }
	    
	    else
	    {
	    	System.out.println("Price is not same for F-A5-45-M");
	    }
	  
	  //F-A5-90-M
	    driver = new FirefoxDriver();
	    baseUrl = "https://gridstaging.globalrescue.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
	    Thread.sleep(1000);
	    String Price12= "Cost: $3,495.00" ;
	    driver.findElement(By.id("signUpForm:j_idt77")).click();
	    Thread.sleep(12000);
	    driver.findElement(By.id("signUpForm:j_idt112")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.id("signUpForm:j_idt145")).click();
	   Thread.sleep(8000);
	    String price12a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
	    System.out.println("System "+price12a);
	  
	    if(Price12.equals(price12a))
	    	
	    {
	    System.out.println("Price is Verified for F-A5-90-M");
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
	    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
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
	    System.out.println("F-A5-90-M Created Succesfully!");
	    driver.close();
	    }
	    
	    else
	    {
	    	System.out.println("Price is not same for F-A5-90-M");
	    }
	  
	  //F-A5-180-M
	    driver = new FirefoxDriver();
	    baseUrl = "https://gridstaging.globalrescue.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
	    Thread.sleep(1000);
	    String Price13= "Cost: $4,120.00" ;
	    driver.findElement(By.id("signUpForm:j_idt77")).click();
	    Thread.sleep(12000);
	    driver.findElement(By.id("signUpForm:j_idt112")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.id("signUpForm:j_idt149")).click();
	   Thread.sleep(8000);
	    String price13a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
	    System.out.println("System "+price13a);
	  
	    if(Price13.equals(price13a))
	    	
	    {
	    System.out.println("Price is Verified for F-A5-180-M");
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
	    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
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
	    System.out.println("F-A5-180-M Created Succesfully!");
	    driver.close();
	    }
	    
	    else
	    {
	    	System.out.println("Price is not same for F-A5-180-M");
	    }
	  
	    //F-A5-365-M
	    driver = new FirefoxDriver();
	    baseUrl = "https://gridstaging.globalrescue.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
	    Thread.sleep(1000);
	    String Price14= "Cost: $4,995.00" ;
	    driver.findElement(By.id("signUpForm:j_idt77")).click();
	    Thread.sleep(12000);
	    driver.findElement(By.id("signUpForm:j_idt112")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.id("signUpForm:j_idt153")).click();
	   Thread.sleep(8000);
	    String price14a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
	    System.out.println("System "+price14a);
	  
	    if(Price14.equals(price14a))
	    	
	    {
	    System.out.println("Price is Verified for F-A5-365-M");
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
	    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
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
	    System.out.println("F-A5-365-M Created Succesfully!");
	    driver.close();
	    }
	    
	    else
	    {
	    	System.out.println("Price is not same for F-A5-365-M");
	    }
	  
	    //F-A2-45-S
	    driver = new FirefoxDriver();
	    baseUrl = "https://gridstaging.globalrescue.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
	    Thread.sleep(1000);
	    String Price15= "Cost: $2,275.00" ;
	    driver.findElement(By.id("signUpForm:j_idt77")).click();
	    Thread.sleep(12000);
	    driver.findElement(By.id("signUpForm:j_idt100")).click();
	    Thread.sleep(8000);
	   // driver.findElement(By.id("signUpForm:j_idt149")).click();
	   //Thread.sleep(8000);
	    driver.findElement(By.xpath("//a[@id='signUpForm:j_idt160']/span")).click();
	    Thread.sleep(7000);
	    String price15a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
	    System.out.println("System "+price15a);
	  
	    if(Price15.equals(price15a))
	    	
	    {
	    System.out.println("Price is Verified for F-A2-45-S");
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
	    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
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
	    System.out.println("F-A2-45-S Created Succesfully!");
	    driver.close();
	    }
	    
	    else
	    {
	    	System.out.println("Price is not same for F-A2-45-S");
	    }
	    
	    //F-A2-90-S
	    driver = new FirefoxDriver();
	    baseUrl = "https://gridstaging.globalrescue.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
	    Thread.sleep(1000);
	    String Price16= "Cost: $2,875.00" ;
	    driver.findElement(By.id("signUpForm:j_idt77")).click();
	    Thread.sleep(12000);
	    driver.findElement(By.id("signUpForm:j_idt100")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.id("signUpForm:j_idt145")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.xpath("//a[@id='signUpForm:j_idt160']/span")).click();
	    Thread.sleep(7000);
	    String price16a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
	    System.out.println("System "+price16a);
	  
	    if(Price16.equals(price16a))
	    	
	    {
	    System.out.println("Price is Verified for F-A2-90-S");
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
	    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
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
	    System.out.println("F-A2-90-S Created Succesfully!");
	    driver.close();
	    }
	    
	    else
	    {
	    	System.out.println("Price is not same for F-A2-90-S");
	    }
	  
	    //F-A2-180-S
	    driver = new FirefoxDriver();
	    baseUrl = "https://gridstaging.globalrescue.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
	    Thread.sleep(1000);
	    String Price17= "Cost: $3,375.00" ;
	    driver.findElement(By.id("signUpForm:j_idt77")).click();
	    Thread.sleep(12000);
	    driver.findElement(By.id("signUpForm:j_idt100")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.id("signUpForm:j_idt149")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.xpath("//a[@id='signUpForm:j_idt160']/span")).click();
	    Thread.sleep(7000);
	    String price17a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
	    System.out.println("System "+price17a);
	  
	    if(Price17.equals(price17a))
	    	
	    {
	    System.out.println("Price is Verified for F-A2-180-S");
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
	    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
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
	    System.out.println("F-A2-180-S Created Succesfully!");
	    driver.close();
	    }
	    
	    else
	    {
	    	System.out.println("Price is not same for F-A2-180-S");
	    }
	    
	  //F-A2-365-S
	    driver = new FirefoxDriver();
	    baseUrl = "https://gridstaging.globalrescue.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
	    Thread.sleep(1000);
	    String Price18= "Cost: $4,075.00" ;
	    driver.findElement(By.id("signUpForm:j_idt77")).click();
	    Thread.sleep(12000);
	    driver.findElement(By.id("signUpForm:j_idt100")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.id("signUpForm:j_idt153")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.xpath("//a[@id='signUpForm:j_idt160']/span")).click();
	    Thread.sleep(8000);
	    String price18a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
	    System.out.println("System "+price18a);
	  
	    if(Price18.equals(price18a))
	    	
	    {
	    System.out.println("Price is Verified for F-A2-365-S");
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
	    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
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
	    System.out.println("F-A2-365-S Created Succesfully!");
	    driver.close();
	    }
	    
	    else
	    {
	    	System.out.println("Price is not same for F-A2-365-S");
	    }
	    
	  //F-A3-45-S
	    driver = new FirefoxDriver();
	    baseUrl = "https://gridstaging.globalrescue.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
	    Thread.sleep(1000);
	    String Price19= "Cost: $3,370.00" ;
	    driver.findElement(By.id("signUpForm:j_idt77")).click();
	    Thread.sleep(12000);
	    driver.findElement(By.id("signUpForm:j_idt104")).click();
	    Thread.sleep(8000);
	    //driver.findElement(By.id("signUpForm:j_idt153")).click();
	    //Thread.sleep(8000);
	    driver.findElement(By.xpath("//a[@id='signUpForm:j_idt160']/span")).click();
	    Thread.sleep(8000);
	    String price19a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
	    System.out.println("System "+price19a);
	  
	    if(Price19.equals(price19a))
	    	
	    {
	    System.out.println("Price is Verified for F-A3-45-S");
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
	    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
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
	    System.out.println("F-A3-45-S Created Succesfully!");
	    driver.close();
	    }
	    
	    else
	    {
	    	System.out.println("Price is not same for F-A3-45-S");
	    }
	    
	    //F-A3-90-S
	    driver = new FirefoxDriver();
	    baseUrl = "https://gridstaging.globalrescue.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
	    Thread.sleep(1000);
	    String Price20= "Cost: $4,270.00" ;
	    driver.findElement(By.id("signUpForm:j_idt77")).click();
	    Thread.sleep(12000);
	    driver.findElement(By.id("signUpForm:j_idt104")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.id("signUpForm:j_idt145")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.xpath("//a[@id='signUpForm:j_idt160']/span")).click();
	    Thread.sleep(8000);
	    String price20a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
	    System.out.println("System "+price20a);
	  
	    if(Price20.equals(price20a))
	    	
	    {
	    System.out.println("Price is Verified for F-A3-90-S");
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
	    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
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
	    System.out.println("F-A3-90-S Created Succesfully!");
	    driver.close();
	    }
	    
	    else
	    {
	    	System.out.println("Price is not same for F-A3-90-S");
	    }
	    
	    //F-A3-180-S
	    driver = new FirefoxDriver();
	    baseUrl = "https://gridstaging.globalrescue.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
	    Thread.sleep(1000);
	    String Price21= "Cost: $5,020.00" ;
	    driver.findElement(By.id("signUpForm:j_idt77")).click();
	    Thread.sleep(12000);
	    driver.findElement(By.id("signUpForm:j_idt104")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.id("signUpForm:j_idt149")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.xpath("//a[@id='signUpForm:j_idt160']/span")).click();
	    Thread.sleep(8000);
	    String price21a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
	    System.out.println("System "+price21a);
	  
	    if(Price21.equals(price21a))
	    	
	    {
	    System.out.println("Price is Verified for F-A3-180-S");
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
	    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
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
	    System.out.println("F-A3-180-S Created Succesfully!");
	    driver.close();
	    }
	    
	    else
	    {
	    	System.out.println("Price is not same for F-A3-180-S");
	    }
	    
	    //F-A3-365-S
	    driver = new FirefoxDriver();
	    baseUrl = "https://gridstaging.globalrescue.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
	    Thread.sleep(1000);
	    String Price22= "Cost: $6,070.00" ;
	    driver.findElement(By.id("signUpForm:j_idt77")).click();
	    Thread.sleep(12000);
	    driver.findElement(By.id("signUpForm:j_idt104")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.id("signUpForm:j_idt153")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.xpath("//a[@id='signUpForm:j_idt160']/span")).click();
	    Thread.sleep(8000);
	    String price22a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
	    System.out.println("System "+price22a);
	  
	    if(Price22.equals(price22a))
	    	
	    {
	    System.out.println("Price is Verified for F-A3-365-S");
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
	    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
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
	    System.out.println("F-A3-365-S Created Succesfully!");
	    driver.close();
	    }
	    
	    else
	    {
	    	System.out.println("Price is not same for F-A3-365-S");
	    }
	    
	    //F-A4-45-S
	    driver = new FirefoxDriver();
	    baseUrl = "https://gridstaging.globalrescue.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
	    Thread.sleep(1000);
	    String Price23= "Cost: $4,450.00" ;
	    driver.findElement(By.id("signUpForm:j_idt77")).click();
	    Thread.sleep(12000);
	    driver.findElement(By.id("signUpForm:j_idt108")).click();
	    Thread.sleep(8000);
	    //driver.findElement(By.id("signUpForm:j_idt153")).click();
	    //Thread.sleep(8000);
	    driver.findElement(By.xpath("//a[@id='signUpForm:j_idt160']/span")).click();
	    Thread.sleep(8000);
	    String price23a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
	    System.out.println("System "+price23a);
	  
	    if(Price23.equals(price23a))
	    	
	    {
	    System.out.println("Price is Verified for F-A4-45-S");
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
	    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
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
	    System.out.println("F-A4-45-S Created Succesfully!");
	    driver.close();
	    }
	    
	    else
	    {
	    	System.out.println("Price is not same for F-A4-45-S");
	    }
	    
	    //F-A4-90-S
	    driver = new FirefoxDriver();
	    baseUrl = "https://gridstaging.globalrescue.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
	    Thread.sleep(1000);
	    String Price24= "Cost: $5,650.00" ;
	    driver.findElement(By.id("signUpForm:j_idt77")).click();
	    Thread.sleep(12000);
	    driver.findElement(By.id("signUpForm:j_idt108")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.id("signUpForm:j_idt145")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.xpath("//a[@id='signUpForm:j_idt160']/span")).click();
	    Thread.sleep(8000);
	    String price24a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
	    System.out.println("System "+price24a);
	  
	    if(Price24.equals(price24a))
	    	
	    {
	    System.out.println("Price is Verified for F-A4-90-S");
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
	    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
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
	    System.out.println("F-A4-90-S Created Succesfully!");
	    driver.close();
	    }
	    
	    else
	    {
	    	System.out.println("Price is not same for F-A4-90-S");
	    }
	    
	    //F-A4-180-S
	    driver = new FirefoxDriver();
	    baseUrl = "https://gridstaging.globalrescue.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
	    Thread.sleep(1000);
	    String Price25= "Cost: $6,650.00" ;
	    driver.findElement(By.id("signUpForm:j_idt77")).click();
	    Thread.sleep(12000);
	    driver.findElement(By.id("signUpForm:j_idt108")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.id("signUpForm:j_idt149")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.xpath("//a[@id='signUpForm:j_idt160']/span")).click();
	    Thread.sleep(8000);
	    String price25a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
	    System.out.println("System "+price25a);
	  
	    if(Price25.equals(price25a))
	    	
	    {
	    System.out.println("Price is Verified for F-A4-180-S");
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
	    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
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
	    System.out.println("F-A4-180-S Created Succesfully!");
	    driver.close();
	    }
	    
	    else
	    {
	    	System.out.println("Price is not same for F-A4-180-S");
	    }
	    
	  //F-A4-365-S
	    driver = new FirefoxDriver();
	    baseUrl = "https://gridstaging.globalrescue.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
	    Thread.sleep(1000);
	    String Price26= "Cost: $8,050.00" ;
	    driver.findElement(By.id("signUpForm:j_idt77")).click();
	    Thread.sleep(12000);
	    driver.findElement(By.id("signUpForm:j_idt108")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.id("signUpForm:j_idt153")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.xpath("//a[@id='signUpForm:j_idt160']/span")).click();
	    Thread.sleep(8000);
	    String price26a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
	    System.out.println("System "+price26a);
	  
	    if(Price26.equals(price26a))
	    	
	    {
	    System.out.println("Price is Verified for F-A4-365-S");
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
	    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
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
	    System.out.println("F-A4-365-S Created Succesfully!");
	    driver.close();
	    }
	    
	    else
	    {
	    	System.out.println("Price is not same for F-A4-365-S");
	    }
	    
	    //F-A5-45-S
	    driver = new FirefoxDriver();
	    baseUrl = "https://gridstaging.globalrescue.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
	    Thread.sleep(1000);
	    String Price27= "Cost: $5,490.00" ;
	    driver.findElement(By.id("signUpForm:j_idt77")).click();
	    Thread.sleep(12000);
	    driver.findElement(By.id("signUpForm:j_idt112")).click();
	    Thread.sleep(8000);
	    //driver.findElement(By.id("signUpForm:j_idt153")).click();
	    //Thread.sleep(8000);
	    driver.findElement(By.xpath("//a[@id='signUpForm:j_idt160']/span")).click();
	    Thread.sleep(8000);
	    String price27a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
	    System.out.println("System "+price27a);
	  
	    if(Price27.equals(price27a))
	    	
	    {
	    System.out.println("Price is Verified for F-A5-45-S");
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
	    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
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
	    System.out.println("F-A5-45-S Created Succesfully!");
	    driver.close();
	    }
	    
	    else
	    {
	    	System.out.println("Price is not same for F-A5-45-S");
	    }
	    
	    //F-A5-90-S
	    driver = new FirefoxDriver();
	    baseUrl = "https://gridstaging.globalrescue.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
	    Thread.sleep(1000);
	    String Price28= "Cost: $6,990.00" ;
	    driver.findElement(By.id("signUpForm:j_idt77")).click();
	    Thread.sleep(12000);
	    driver.findElement(By.id("signUpForm:j_idt112")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.id("signUpForm:j_idt145")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.xpath("//a[@id='signUpForm:j_idt160']/span")).click();
	    Thread.sleep(8000);
	    String price28a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
	    System.out.println("System "+price28a);
	  
	    if(Price28.equals(price28a))
	    	
	    {
	    System.out.println("Price is Verified for F-A5-90-S");
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
	    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
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
	    System.out.println("F-A5-90-S Created Succesfully!");
	    driver.close();
	    }
	    
	    else
	    {
	    	System.out.println("Price is not same for F-A5-90-S");
	    }
	    
	    //F-A5-180-S
	    driver = new FirefoxDriver();
	    baseUrl = "https://gridstaging.globalrescue.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
	    Thread.sleep(1000);
	    String Price29= "Cost: $8,240.00" ;
	    driver.findElement(By.id("signUpForm:j_idt77")).click();
	    Thread.sleep(12000);
	    driver.findElement(By.id("signUpForm:j_idt112")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.id("signUpForm:j_idt149")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.xpath("//a[@id='signUpForm:j_idt160']/span")).click();
	    Thread.sleep(8000);
	    String price29a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
	    System.out.println("System "+price29a);
	  
	    if(Price29.equals(price29a))
	    	
	    {
	    System.out.println("Price is Verified for F-A5-180-S");
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
	    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
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
	    System.out.println("F-A5-180-S Created Succesfully!");
	    driver.close();
	    }
	    
	    else
	    {
	    	System.out.println("Price is not same for F-A5-180-S");
	    }
	    
	    //F-A5-365-S
	    driver = new FirefoxDriver();
	    baseUrl = "https://gridstaging.globalrescue.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
	    Thread.sleep(1000);
	    String Price30= "Cost: $9,990.00" ;
	    driver.findElement(By.id("signUpForm:j_idt77")).click();
	    Thread.sleep(12000);
	    driver.findElement(By.id("signUpForm:j_idt112")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.id("signUpForm:j_idt153")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.xpath("//a[@id='signUpForm:j_idt160']/span")).click();
	    Thread.sleep(8000);
	    String price30a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
	    System.out.println("System "+price30a);
	  
	    if(Price30.equals(price30a))
	    	
	    {
	    System.out.println("Price is Verified for F-A5-365-S");
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
	    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
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
	    System.out.println("F-A5-365-S Created Succesfully!");
	    driver.close();
	    }
	    
	    else
	    {
	    	System.out.println("Price is not same for F-A5-365-S");
	    }
	    
	    /////////////////////////////SHORT TREM MEMBERSHIPS/////////////////////////////////////////////////
	    
	    //F-S7-M
	    driver = new FirefoxDriver();
	    baseUrl = "https://gridstaging.globalrescue.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
	    Thread.sleep(1000);
	    String Price31= "Cost: $199.00" ;
	    driver.findElement(By.id("signUpForm:j_idt77")).click();
	    Thread.sleep(12000);
	    driver.findElement(By.id("signUpForm:j_idt123")).click();
	    Thread.sleep(8000);
	    //driver.findElement(By.xpath("//a[@id='signUpForm:j_idt160']/span")).click();
	    //Thread.sleep(8000);
	    String price31a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
	    System.out.println("System "+price31a);
	  
	    if(Price31.equals(price31a))
	    	
	    {
	    System.out.println("Price is Verified for F-S7-M");
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
	    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
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
	    System.out.println("F-S7-M Created Succesfully!");
	    driver.close();
	    }
	    
	    else
	    {
	    	System.out.println("Price is not same for F-S7-M");
	    }
	    
	    //F-S14-M
	    driver = new FirefoxDriver();
	    baseUrl = "https://gridstaging.globalrescue.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
	    Thread.sleep(1000);
	    String Price32= "Cost: $289.00" ;
	    driver.findElement(By.id("signUpForm:j_idt77")).click();
	    Thread.sleep(12000);
	    driver.findElement(By.id("signUpForm:j_idt127")).click();
	    Thread.sleep(8000);
	    //driver.findElement(By.xpath("//a[@id='signUpForm:j_idt160']/span")).click();
	    //Thread.sleep(8000);
	    String price32a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
	    System.out.println("System "+price32a);
	  
	    if(Price32.equals(price32a))
	    	
	    {
	    System.out.println("Price is Verified for F-S7-M");
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
	    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
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
	    System.out.println("F-S14-M Created Succesfully!");
	    driver.close();
	    }
	    
	    else
	    {
	    	System.out.println("Price is not same for F-S14-M");
	    }
	    
	  //F-S30-M
	    driver = new FirefoxDriver();
	    baseUrl = "https://gridstaging.globalrescue.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
	    Thread.sleep(1000);
	    String Price33= "Cost: $389.00" ;
	    driver.findElement(By.id("signUpForm:j_idt77")).click();
	    Thread.sleep(12000);
	    driver.findElement(By.id("signUpForm:j_idt131")).click();
	    Thread.sleep(8000);
	    //driver.findElement(By.xpath("//a[@id='signUpForm:j_idt160']/span")).click();
	    //Thread.sleep(8000);
	    String price33a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
	    System.out.println("System "+price33a);
	  
	    if(Price33.equals(price33a))
	    	
	    {
	    System.out.println("Price is Verified for F-S30-M");
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
	    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
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
	    System.out.println("F-S30-M Created Succesfully!");
	    driver.close();
	    }
	    
	    else
	    {
	    	System.out.println("Price is not same for F-S30-M");
	    }
	    
	  //F-S7-S
	    driver = new FirefoxDriver();
	    baseUrl = "https://gridstaging.globalrescue.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
	    Thread.sleep(1000);
	    String Price34= "Cost: $395.00" ;
	    driver.findElement(By.id("signUpForm:j_idt77")).click();
	    Thread.sleep(12000);
	    driver.findElement(By.id("signUpForm:j_idt123")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.xpath("//a[@id='signUpForm:j_idt160']/span")).click();
	    Thread.sleep(8000);
	    String price34a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
	    System.out.println("System "+price34a);
	  
	    if(Price34.equals(price34a))
	    	
	    {
	    System.out.println("Price is Verified for F-S7-S");
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
	    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
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
	    System.out.println("F-S7-S Created Succesfully!");
	    driver.close();
	    }
	    
	    else
	    {
	    	System.out.println("Price is not same for F-S7-S");
	    }
	    
	    //F-S14-S
	    driver = new FirefoxDriver();
	    baseUrl = "https://gridstaging.globalrescue.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
	    Thread.sleep(1000);
	    String Price35= "Cost: $575.00" ;
	    driver.findElement(By.id("signUpForm:j_idt77")).click();
	    Thread.sleep(12000);
	    driver.findElement(By.id("signUpForm:j_idt127")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.xpath("//a[@id='signUpForm:j_idt160']/span")).click();
	    Thread.sleep(8000);
	    String price35a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
	    System.out.println("System "+price35a);
	  
	    if(Price35.equals(price35a))
	    	
	    {
	    System.out.println("Price is Verified for F-S14-S");
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
	    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
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
	    System.out.println("F-S14-S Created Succesfully!");
	    driver.close();
	    }
	    
	    else
	    {
	    	System.out.println("Price is not same for F-S14-S");
	    }
	    
	  //F-S30-S
	    driver = new FirefoxDriver();
	    baseUrl = "https://gridstaging.globalrescue.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(baseUrl + "/grcom/signup/signup.xhtml");
	    Thread.sleep(1000);
	    String Price36= "Cost: $775.00" ;
	    driver.findElement(By.id("signUpForm:j_idt77")).click();
	    Thread.sleep(12000);
	    driver.findElement(By.id("signUpForm:j_idt131")).click();
	    Thread.sleep(8000);
	    driver.findElement(By.xpath("//a[@id='signUpForm:j_idt160']/span")).click();
	    Thread.sleep(8000);
	    String price36a= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
	    System.out.println("System "+price36a);
	  
	    if(Price36.equals(price36a))
	    	
	    {
	    System.out.println("Price is Verified for F-S30-S");
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
	    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1975");
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
	    System.out.println("F-S30-S Created Succesfully!");
	    driver.close();
	    }
	    
	    else
	    {
	    	System.out.println("Price is not same for F-S30-S");
	    }
	    
	    System.out.println("***Thank You***");
	  }
	  
}

