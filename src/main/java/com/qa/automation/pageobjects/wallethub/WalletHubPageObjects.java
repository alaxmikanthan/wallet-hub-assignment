package com.qa.automation.pageobjects.wallethub;

public class WalletHubPageObjects {
	public static final String email_field = "xpath=//input[@name='em']";
	public static final String password_field = "xpath=//input[@name='pw1']";
	public static final String login_link = "xpath=//a[text()='Login']";
	public static final String login_button = "xpath=//button[contains(@data-hm-tap,'doSubmit')]";
	public static final String postMsgField = "xpath=//div/textarea[contains(@title,'on your mind?')]";
	public static final String postButton = "xpath=//button[contains(@data-testid, 'post-button')]";
	public static final String walletHubIcon = "xpath=//span[contains(@class,'w-icon-wallet')]";
	public static final String rating_element_to_hover = "xpath=//span[contains(@class,'wh-rating rating_')]";
	public static final String rating_star_at_position_five = "xpath=//div[contains(@class,'wh-rating-choices-holder')]/a[5]";
	public static final String policyDropDownArrow = "xpath=//span[@class='drop-arrow']";
	public static final String dropDownValue = "xpath=//div[contains(@class,'dropdown-list-new')]//ul/li[2]";
	public static final String policyRating = "xpath=//span[@id='overallRating']//a[5]";
	public static final String reviewCommentsField = "xpath=//textarea[@id='review-content']";
	public static final String submitButton = "xpath=//div[@class='submit']/input";
}
