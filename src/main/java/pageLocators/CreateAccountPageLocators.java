package pageLocators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

//Locators for CreateAccount flow
public class CreateAccountPageLocators {
	
	@FindBy(how=How.XPATH,using="//*[@id=\"email\"]")
	public WebElement email;
	
	@FindBy(how=How.XPATH,using="//input[@name=\"jawwy_user_pass\"]")
	public WebElement password;
	
	@FindBy(how=How.XPATH,using="//button[@class=\"signup-form__submit\"]")
	public WebElement clickContinue;
	
	@FindBy(how=How.XPATH,using="//button[@class=\"signup-form__back\"]")
	public WebElement backButton;
	
	@FindBy(how=How.XPATH,using="//select[@name='country']")
	public WebElement selectCountry;
	
	@FindBy(how=How.XPATH,using="//*[@class='selectProviders-list']/li")
	public List<WebElement> serviceProviders;
	
	@FindBy(how=How.XPATH,using="//*[@class='provider-name']")
	public WebElement paymentType;
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Click here')]")
	public WebElement clickHereText;
	
	@FindBy(how=How.ID,using="not_user_subscribe")
	public WebElement clickOnSubscribe;

	@FindBy(how=How.CLASS_NAME,using="step-name")
	public WebElement createAccountText;
	
	@FindBy(how=How.XPATH,using="//a[@href='' and contains(text(),'Terms')]")
	public WebElement termsAndConditions;
	
	@FindBy(how=How.XPATH,using="//*[@class='signup-form-terms__title']")
	public WebElement checkterms;
	
	@FindBy(how=How.XPATH,using="//a[@class='agree']")
	public WebElement agreeButton;
}
