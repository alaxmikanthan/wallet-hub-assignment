package com.qa.automation.pageobjects.wallethub;

import com.qa.automation.core.CommonPageHelpersLib;
import com.qa.automation.core.LogHelper;
import com.qa.automation.pageobjects.wallethub.WalletHubPageConstants;

public class WalletHubPageHelper extends CommonPageHelpersLib {

	public static void init() {
		CommonPageHelpersLib.init();
	}

	public static void goToHomePage() {
		get(WalletHubPageConstants.url);
	}

	public static void enterEmail() {
		enterText(WalletHubPageObjects.email_field, WalletHubPageConstants.email);
	}

	public static void enterPassword() {
		enterText(WalletHubPageObjects.password_field, WalletHubPageConstants.password);
	}

	public static void clickLoginLink() {
		clickButton(WalletHubPageObjects.login_link);
	}

	public static void clickLoginButton() {
		clickButton(WalletHubPageObjects.login_button);
	}

	public static void clickWalletHubIcon() {
		clickButton(WalletHubPageObjects.walletHubIcon);
	}

	public static void hoverOverRatingElement() {
		mouseHoverOver(WalletHubPageObjects.rating_element_to_hover);
	}
	
	public static void clickRatingStartAtFifthPosition() {
		clickButton(WalletHubPageObjects.rating_star_at_position_five);
	}
	
	public static void selectHealthPolicyInDropDown() {
		clickButton(WalletHubPageObjects.policyDropDownArrow);
		sleep(2);
		clickButton(WalletHubPageObjects.dropDownValue);
	}
	
	public static void selectFiveStartRating() {
		mouseHoverOver(WalletHubPageObjects.policyRating);
		sleep(2);
		clickButton(WalletHubPageObjects.policyRating);
	}
	
	public static void enterReviewComments() {
		int num = 0;
		String reviewComments = WalletHubPageConstants.reviewComments;
		while (num < 10) {
			reviewComments += WalletHubPageConstants.reviewComments;
			num++;
		}
		enterText(WalletHubPageObjects.reviewCommentsField,reviewComments);
	}
	
	public static void clickOnSubmit() {
		clickButton(WalletHubPageObjects.submitButton);
	}
}
