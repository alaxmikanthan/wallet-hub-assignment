package com.qa.automation.testsuites;

// import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import com.qa.automation.pageobjects.facebook.FacebookPageHelper;
import com.qa.automation.core.LogHelper;

public class FaceBookTest {

	@Test
	public void test_PostStatusMessageOnFaceBook() {

		LogHelper.setTestCaseId(001);
		FacebookPageHelper.init();
		LogHelper.logDbgMsg("Navigate to facebook home page");
		FacebookPageHelper.goToHomePage();
		FacebookPageHelper.sleep(10);
		LogHelper.logDbgMsg("Enter Email");
		FacebookPageHelper.enterEmail();
		LogHelper.logDbgMsg("Enter Password");
		FacebookPageHelper.enterPassword();
		LogHelper.logDbgMsg("Click login button");
		FacebookPageHelper.clickLoginButton();
		LogHelper.logDbgMsg("Post Status Message");
		FacebookPageHelper.sleep(10);
		FacebookPageHelper.postStatusMsg();
		FacebookPageHelper.sleep(5);
	//	facebookpagehelper.clickButtonToPost();

	}

}
