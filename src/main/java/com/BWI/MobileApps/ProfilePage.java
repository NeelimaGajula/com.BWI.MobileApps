package com.BWI.MobileApps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {

WebDriver driver;
	
	ProfilePage(WebDriver dr){
		this.driver=dr;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="submit")
	WebElement logoutButton;
	
	@FindBy(xpath="//img[@src=\"/images/Toolsqa.jpg\"]")
	WebElement toolsQALogo;
	
	public void clickOnLogoutButton()
	{
		logoutButton.click();
	}
	public boolean isDisplayedHomePageFields(String field)
	{
		boolean flag=false;
		switch(field)
		{
		case "logOut" :
			flag= logoutButton.isDisplayed();
		default :
			System.out.println("given field is not available");
		}
		
		return flag;
	}
}
