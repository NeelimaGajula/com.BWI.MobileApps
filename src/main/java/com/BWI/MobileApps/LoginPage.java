package com.BWI.MobileApps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	
	WebDriver driver;
	
	LoginPage(WebDriver dr){
		this.driver=dr;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="userName")
	WebElement userName;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login")
	WebElement loginButton;
	
	
	public void enterUserName(String uName) throws InterruptedException
	{
		Thread.sleep(2000);
		userName.sendKeys(uName);
	}
	
	public void enterPassword(String pWord) throws InterruptedException
	{
		Thread.sleep(2000);
		password.sendKeys(pWord);
	}
	
	public void clickLoginButton()
	{
		loginButton.click();
	}
}
