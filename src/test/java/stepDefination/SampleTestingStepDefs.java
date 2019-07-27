package stepDefination;

import utils.Log;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageActions.CreateAccountPageActions;
import pageActions.WelcomeScreenPageActions;
import pageLocators.CreateAccountPageLocators;
import utils.SeleniumDriver;

public class SampleTestingStepDefs {
		
		WelcomeScreenPageActions ws =new WelcomeScreenPageActions();
		CreateAccountPageActions ca= new CreateAccountPageActions();

	    @Given("^Jawwytv site \"([^\"]*)\" opens successfully$")
	    public void jawwytv_site_something_opens_successfully(String url){
	    	SeleniumDriver.openPage(url);
	    	Log.info("User navigated succesfully to "+url   );
	    }

	    @When("^User changes language in welcome screen$")
	    public void user_changes_language_in_welcome_screen() {
	    	ws.changeLanguage();
	    	Log.info("User succesfully changed language");
	    	
	    }
	    
	    @When("^User clicks on back button on payment screen$")
	    public void user_clicks_on_back_button_on_payment_screen(){
	        ca.clickOnBackButton();
	        Log.info("User succesfully clicked back button");
	    }

	    @Then("^User enters username as \"([^\"]*)\"$")
	    public void user_enters_username_as(String userName){
	    	ca.enterUserName(userName);
	    	Log.info("Username( "+userName+") succesfully entered ");
	    }

	    @Then("^User should see back button displayed on payment screen$")
	    public void user_should_see_back_button_displayed_on_payment_screen(){
	    	String verifyBack="Back";
	    	try {
				ca.verifyBackButtonAtPaymentPage(verifyBack);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
	    }


	    @Then("^User should see that only one \"([^\"]*)\" payment method is displayed$")
	    public void user_should_see_that_only_some_payment_methods_are_displayed(String paymentType){
	        ca.verifyPaymentMethodsByType(paymentType);
	        Log.info("Payment method is "+paymentType);
	        
	    }
	    
	    @Then("^User should see that (\\d+ )payment methods are displayed$")
	    public void user_should_see_that_something_payment_methods_are_displayed(int paymentOptions){
	    	ca.verifyPaymentMethodsByNumber(paymentOptions);
	    	Log.info("Number of payment methods are "+paymentOptions);
	        
	    }

	    @Then("^User clicks on Click here link in create your account section$")
	    public void user_clicks_on_click_here_link_in_create_your_account_section(){
	       ca.clickHereLink();
	       Log.info("User succesfully clicked on 'click here' text");
	    }

	    @Then("^User should navigate to Create your account section$")
	    public void user_should_navigate_to_create_your_account_section(){
	    	String sectionName="Create your account";
	    	ca.navigateToCreateAccount(sectionName);
	    }

	    @Then("^User clicks on Terms and Conditions link in create your account section$")
	    public void user_clicks_on_terms_and_conditions_link_in_create_your_account_section(){
	    	ca.clickTermsAndConditions();
	    	Log.info("User clicked T&C");
	    	
	    }

	    @Then("^User should see that Terms & Conditions section is displayed$")
	    public void user_should_see_that_terms_conditions_section_is_displayed() {
	    	String termsAndCondition ="TERMS & CONDITIONS"; 
	    	ca.verifyTermsAndConditions(termsAndCondition);
	    	Log.info("User verified T&C");
	    }

	    @And("^User clicks on seven days free subscribe now button$")
	    public void user_clicks_on_seven_days_free_subscribe_now_button(){
	    	ws.subscribeFreeForSevenDays();
	    	Log.info("User is willing to subscribe to free trial");
	    }

	    @And("^User enters password as \"([^\"]*)\"$")
	    public void user_enters_password_as(String password){
	    	ca.enterPassword(password);
	    	Log.info("User entered password "+password);
	    }

	    @And("^User clicks on continue button$")
	    public void user_clicks_on_continue_button(){
	    	ca.clickOnContinue();
	    }

	    @And("^User should select \"([^\"]*)\" from country dropdown menu$")
	    public void user_should_select_country_dropdown_menu(String countryCode) {
	    	ca.selectCountryFromDropdown(countryCode);
	    	Log.info("User selected country as "+countryCode);
	    }


	    @And("^User clicks on Subscribe link in Existing User section$")
	    public void user_clicks_on_subscribe_link_in_existing_user_section(){
	    	ca.clickSubcribeOnExistingUser();
	    	Log.info("User clicked Subscribe Now");
	    }
	    

	}

