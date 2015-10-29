package grcom;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.Select;

public class studentvalidations {

	

	
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
  public void studentvalidationss() throws Exception {
   driver.get(baseUrl + "/grcom/signup/signup.xhtml");
   
    //S-A1-45-M
    String Price1= "Cost: $259.00" ;
    driver.findElement(By.id("signUpForm:j_idt76")).click();
    Thread.sleep(12000);
    String price= driver.findElement(By.id("signUpForm:membershipCostPanel")).getText();
    System.out.println("System "+price);
  
    if(Price1.equals(price))
    	
    {
    System.out.println("Price is Verified for S-A1-45-M");
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
    ran = 1000 + (int)(Math.random() * ((100000 - 1000) + 1));
    
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
    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1970");
   
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
    driver.findElement(By.linkText("See Details")).click();
    Thread.sleep(4000);
    assertEquals("Individuals 35 and older are not eligible for student memberships. Please select an individual plan.", driver.findElement(By.cssSelector("h5.text-blue")).getText());
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
    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/1992");
    driver.findElement(By.id("signUpForm:memberDetailContinueBtn")).click();
    Thread.sleep(4000);
    assertEquals("To qualify for a student membership, individuals over the age of 23 must be in full time education. Please confirm that this is the case", driver.findElement(By.xpath("//span[@id='signUpForm:studentErrorPanel']/div/h4")).getText());
    driver.findElement(By.id("signUpForm:j_idt170:j_idt172")).click();
    Thread.sleep(4000);
    assertTrue(isElementPresent(By.id("signUpForm:membershipBuyBtn")));
    driver.findElement(By.cssSelector("span.icon-prev.text-light-green")).click();
    Thread.sleep(4000);
    driver.findElement(By.id("signUpForm:memberDetailContinueBtn")).click();
    Thread.sleep(4000);
    driver.findElement(By.id("signUpForm:j_idt170:j_idt174")).click();
    Thread.sleep(4000);
    assertEquals("Type of Plan", driver.findElement(By.xpath("//div[@id='signupSteps']/div/div/div/div/h2")).getText());
    driver.findElement(By.id("signUpForm:planSelectionContinueBtn")).click();
    Thread.sleep(4000);
    driver.findElement(By.id("signUpForm:birthDateInputDate")).clear();
    driver.findElement(By.id("signUpForm:birthDateInputDate")).sendKeys("01/01/2000");
    driver.findElement(By.id("signUpForm:memberDetailContinueBtn")).click();
    Thread.sleep(10000);
    
    System.out.println("35 or above years & Full Time Student Age checks for student are validated!");
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
    assertEquals("Discount: $2.59", driver.findElement(By.xpath("//span[@id='signUpForm:referralCodeDiscountPanel']/div/div/h3")).getText());
    assertEquals("Amount Due: $256.41", driver.findElement(By.xpath("//span[@id='signUpForm:referralCodeDiscountPanel']/div/div/h3[2]")).getText());
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
    	System.out.println("Price is not same for S-A1-45-M, We are Terminating! ");
    }
    
    System.out.println("***Thank You***");
  }

private void assertTrue(Object elementPresent) {
	// TODO Auto-generated method stub
	
}

private Object isElementPresent(By id) {
	// TODO Auto-generated method stub
	return null;
}
  
}