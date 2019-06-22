package com.qa.pages;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.testBase.TestBase;

public class FlightPaymentPage extends TestBase {

	@FindBy(name="passFirst0")
	WebElement firstNamePass;
	
	@FindBy(name="passLast0")
	WebElement lastNamePass;
	
	@FindBy(name="passFirst1")
	WebElement secondNamePass;
	
	@FindBy(name="passLast1")
	WebElement secondLastPass;
	
	@FindBy(name="creditCard")
	WebElement cardType;
	
	@FindBy(name="creditnumber")
	WebElement cardNumber;
	
	@FindBy(name="cc_exp_dt_mn")
	WebElement monthOfExpiry;
	
	@FindBy(name="cc_exp_dt_yr")
	WebElement yearOfExpiry;
	
	@FindBy(name="cc_frst_name")
	WebElement ccFirstName;
	
	@FindBy(name="cc_last_name")
	WebElement ccLastName;
	
	@FindBy(name="buyFlights")
	WebElement purchaseBtn;
	
	public FlightPaymentPage() throws FileNotFoundException {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
   
   public void passengerdetails(String first,String last,String second,String secondLast,String creditCardHolderFirstName,String creditCardHolderLastName) {
	   firstNamePass.sendKeys(first);
	   lastNamePass.sendKeys(last);
	   secondNamePass.sendKeys(second);
	   secondLastPass.sendKeys(secondLast);
	   ccFirstName.sendKeys(creditCardHolderFirstName);
	   ccLastName.sendKeys(creditCardHolderLastName);
   }
   
   public FinalConfirmationPage cardDetails() throws FileNotFoundException {
	   Select dropDown=new Select(cardType);
	   dropDown.selectByVisibleText("Visa");
	   cardNumber.sendKeys("464146414641");
	   monthOfExpiry.sendKeys("");
	   Select cardMonth=new Select(monthOfExpiry);
	   cardMonth.selectByVisibleText("07");
	   Select cardYear=new Select(yearOfExpiry);
	   cardYear.selectByVisibleText("2010");
	   purchaseBtn.click();
	   return new FinalConfirmationPage();
   }
}
