package com.qa.pages;

import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.testBase.TestBase;

public class RegisterPage extends TestBase {
	
	@FindBy(linkText="REGISTER")
	WebElement registerbtn;
	
	@FindBy(name="firstName")
	WebElement fname;
	
	@FindBy(name="lastName")
	WebElement lname;
	
	@FindBy(name="phone")
	WebElement phn;
	
	@FindBy(id="userName")
	WebElement eml;
	
	@FindBy(name="address1")
	WebElement ads;
	
	@FindBy(name="city")
	WebElement cty;
	
	@FindBy(name="state")
	WebElement st;
	
	@FindBy(name="postalCode")
	WebElement zipcode;
	
	@FindBy(name="country")
	WebElement coun;
	
	@FindBy(id="email")
	WebElement usrname;
	
	@FindBy(name="password")
	WebElement pswd;
	
	@FindBy(name="confirmPassword")
	WebElement cnf_pwd;
	
	@FindBy(name="register")
	WebElement submit;
	

	public RegisterPage() throws FileNotFoundException {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
    
	public void RegistrationBtnClick() {
		registerbtn.click();
	}
	public String ValidateTitle() {
		return driver.getTitle();
	}
	
	public void CreateNewCustomer (String firstname,String lastname,String phone,
			String email,String address,String city,String state,
			String postalcode,String country,String username,String password,String confirm_password ) {
		
		fname.sendKeys(firstname);
		lname.sendKeys(lastname);
		phn.sendKeys(phone);
		eml.sendKeys(email);
		ads.sendKeys(address);
		cty.sendKeys(city);
		st.sendKeys(state);
		zipcode.sendKeys(postalcode);
		Select dropdown= new Select(coun);
		dropdown.selectByVisibleText(country);
		usrname.sendKeys(username);
		pswd.sendKeys(password);
		cnf_pwd.sendKeys(confirm_password);
		submit.click();
		
	}
	
	
	
	
	
}
