package com.qa.automation.pageobjects.facebook;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import com.qa.automation.core.CommonPageHelpersLib;
import com.qa.automation.pageobjects.facebook.FacebookPageConstants;

public class FacebookPageHelper extends CommonPageHelpersLib {

	public static void init() {
		CommonPageHelpersLib.init();
	}

	public static void goToHomePage() {
		get(FacebookPageConstants.url);
	}

	public static void enterEmail() {
		enterText(FacebookPageObjects.email_field, FacebookPageConstants.email);
	}

	public static void enterPassword() {
		enterText(FacebookPageObjects.password_field, FacebookPageConstants.password);
	}

	public static void clickLoginButton() {
		clickButton(FacebookPageObjects.login_button);
	}

	public static void postStatusMsg() {
		clickButton(FacebookPageObjects.postMsgField);
		sleep(5);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).sendKeys(FacebookPageConstants.statusMsg).perform();
	}
	
	public static void clickButtonToPost() {
		clickButton(FacebookPageObjects.postButton);
	}
}
