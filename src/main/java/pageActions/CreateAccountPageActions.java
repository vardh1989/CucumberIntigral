package pageActions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pageLocators.CreateAccountPageLocators;
import utils.Log;
import utils.SeleniumDriver;


public class CreateAccountPageActions {
	
	CreateAccountPageLocators createAccount=null;
	
	//Intializing WebElements for Create Account Flow
	public CreateAccountPageActions() {
		this.createAccount =new CreateAccountPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), createAccount);
		
	}
	
	public void enterUserName(String userName) {
		createAccount.email.sendKeys(userName);
	}
	
	public void enterPassword(String password) {
		createAccount.password.sendKeys(password);
	}
	
	public void clickOnContinue() {
		createAccount.clickContinue.click();
	}
	
	public void verifyBackButtonAtPaymentPage(String verifyBack) throws InterruptedException {
		SeleniumDriver.scrollDown();
		String text = createAccount.backButton.getText();
		assertTrue(verifyBack.equalsIgnoreCase(text));
		Log.info("Text on back button is "+text);
	}
	
	public void selectCountryFromDropdown(String countryCode){
		Select select = new Select(createAccount.selectCountry);	
		select.selectByVisibleText(countryCode);
	}
	
	//To identify card payment
	public void verifyPaymentMethodsByType(String cardPaymentText){
		int paymentOptionsAvailable = createAccount.serviceProviders.size();
		String textOnPayment=createAccount.paymentType.getText();
		int numberOfPaymentOptions=1;
		assertEquals(paymentOptionsAvailable,numberOfPaymentOptions);
		assertTrue(textOnPayment.equalsIgnoreCase(cardPaymentText));
	}	
	
	//To identify number of paymentOptions
	public void verifyPaymentMethodsByNumber(int numberOfPaymentOptions){
		int paymentOptionsAvailable= createAccount.serviceProviders.size();
		assertEquals(paymentOptionsAvailable,numberOfPaymentOptions);	
	}
	
	public void clickOnBackButton(){
		createAccount.backButton.click();
	}
	
	public void clickHereLink(){
		createAccount.clickHereText.click();
		
	}
	
	public void clickSubcribeOnExistingUser(){
		createAccount.clickOnSubscribe.click();
		
	}

	public void navigateToCreateAccount(String sectionName) {
		String heading=createAccount.createAccountText.getText();
		assertTrue(sectionName.equalsIgnoreCase(heading));
		Log.info("Heading while creating account is "+heading);
		
	}

	public void clickTermsAndConditions() {
		createAccount.termsAndConditions.click();
		
	}

	public void verifyTermsAndConditions(String termsAndCondition) {
		try {
		SeleniumDriver.scrollDown();
		//String terms = createAccount.checkterms.getText();
		String iAgree= createAccount.agreeButton.getText();
		Log.info("Text on terms/condition is "+iAgree);
		}catch(Exception | Error e)
		{
			e.printStackTrace();
		}
		
	}
}
