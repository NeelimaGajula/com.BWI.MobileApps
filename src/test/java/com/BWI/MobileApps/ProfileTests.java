package com.BWI.MobileApps;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ProfileTests {

	WebDriver driver;
	LoginPage loginPage;
	ProfilePage profilePage;

	@BeforeTest()
	public void launchBrowser() {
		driver = Base.StartBrowser("chrome", "https://demoqa.com/login");
		loginPage = new LoginPage(driver);
		profilePage = new ProfilePage(driver);
	}

	@Test()
	public void verifyLogin() throws InterruptedException {
		loginPage.enterUserName("testuser");
		loginPage.enterPassword("password@123");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "Scrolled down");

		loginPage.clickLoginButton();

		Thread.sleep(2000);
		Assert.assertTrue(profilePage.isDisplayedHomePageFields("logOut"));
		Thread.sleep(2000);
		profilePage.clickOnLogoutButton();
	}

	@AfterTest()
	public void closeBrowser() {
		driver.close();
	}
}
