package com.qa.pages;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class SignInPage extends TestBase {

	@FindBy(name="userName")
	WebElement usrnam;
	
	@FindBy(name="password")
	WebElement pwd;
	
	@FindBy(name="login")
	WebElement signBtn;
	
	public SignInPage() throws FileNotFoundException {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	public HomePage signThePage(String username,String password) throws FileNotFoundException {
		usrnam.sendKeys(username);
		pwd.sendKeys(password);
		signBtn.click();
		
		return new HomePage();
		
	}
}
