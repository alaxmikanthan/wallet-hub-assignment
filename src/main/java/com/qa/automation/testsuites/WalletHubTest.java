package com.qa.automation.testsuites;

// import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import com.qa.automation.pageobjects.wallethub.WalletHubPageHelper;
import com.qa.automation.core.LogHelper;

public class WalletHubTest {

	@Test
	public void test_PostReviewOnWalletHub() {
		LogHelper.setTestCaseId(001);
		WalletHubPageHelper.init();
		LogHelper.logDbgMsg("Navigate to home page");
		WalletHubPageHelper.goToHomePage();
		LogHelper.logDbgMsg("Hover over rating element");
		WalletHubPageHelper.sleep(2);
		WalletHubPageHelper.hoverOverRatingElement();
		WalletHubPageHelper.sleep(2);
		LogHelper.logDbgMsg("Click on star at fifth position");
		WalletHubPageHelper.clickRatingStartAtFifthPosition();
		WalletHubPageHelper.sleep(5);
		LogHelper.logDbgMsg("Select health policy in policy drop down");
		WalletHubPageHelper.selectHealthPolicyInDropDown();
		WalletHubPageHelper.sleep(5);
		LogHelper.logDbgMsg("Write review comments");
		WalletHubPageHelper.enterReviewComments();
		LogHelper.logDbgMsg("Click on 5 rating");
		WalletHubPageHelper.selectFiveStartRating();
		WalletHubPageHelper.sleep(5);
		LogHelper.logDbgMsg("Click On Submit");
		WalletHubPageHelper.clickOnSubmit();
		WalletHubPageHelper.sleep(5);
		LogHelper.logDbgMsg("Click Login link in home page");
		WalletHubPageHelper.clickLoginLink();
		WalletHubPageHelper.sleep(5);
		LogHelper.logDbgMsg("Enter Email");
		WalletHubPageHelper.enterEmail();
		LogHelper.logDbgMsg("Enter Password");
		WalletHubPageHelper.enterPassword();
		LogHelper.logDbgMsg("Click Login button");
		WalletHubPageHelper.clickLoginButton();
// assert could not be done as WalletHub keeps asking to verify email 
// although it has been verified
		
	}

}
